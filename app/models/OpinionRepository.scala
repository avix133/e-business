package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * Description of class: 
  *
  * Created on 29 Apr 2018 (20:22)
  *
  * @author dawid
  */
@Singleton
class OpinionRepository @Inject()(dbConfigProvider: DatabaseConfigProvider, productRepository: ProductRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  import productRepository.ProductTable

  private val product_id = TableQuery[ProductTable]

  private class OpinionTable(tag: Tag) extends Table[Opinion](tag, "opinion") {

    def product = column[Long]("product", O.PrimaryKey)

    def comment = column[String]("comment")

    def product_fk = foreignKey("product_fk", product, product_id)(_.id)

    def * = (product, comment) <> ((Opinion.apply _).tupled, Opinion.unapply)
  }

  private val opinion = TableQuery[OpinionTable]

  def create(product: Long, comment: String): Future[Int] =
    db.run(opinion += Opinion(product, comment))


  def list(): Future[Seq[Opinion]] = db.run {
    opinion.result
  }
}
