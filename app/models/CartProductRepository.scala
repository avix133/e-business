package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * A repository for people.
  *
  * @param dbConfigProvider The Play db config provider. Play will inject this for you.
  */
@Singleton
class CartProductRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CartProductTable(tag: Tag) extends Table[CartProduct](tag, "cart_product") {

    def cartId = column[Long]("cart", O.PrimaryKey)

    def product = column[Long]("product", O.PrimaryKey)

    def amount = column[Int]("amount")

    def * = (cartId, product, amount) <> ((CartProduct.apply _).tupled, CartProduct.unapply)
  }

  val cart = TableQuery[CartProductTable]

  def create(cartId:Long, productId: Long, amount: Int): Future[CartProduct] = db.run {
    (cart.map(c => c.cartId)
      returning cart.map(_.cartId)
      into { case (`cartId`, id) => CartProduct(id, productId, amount) }
      ) += cartId
  }

  def list(): Future[Seq[CartProduct]] = db.run {
    cart.result
  }
}
