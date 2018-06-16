package models

import java.util.UUID

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
class CartRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {

  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CartTable(tag: Tag) extends Table[Cart](tag, "cart_ids") {

    def cartId = column[Int]("cart_id", O.PrimaryKey, O.AutoInc)

    def userId = column[String]("user")

    def * = (cartId, userId) <> ((Cart.apply _).tupled, Cart.unapply)
  }

  val cart = TableQuery[CartTable]

  def create(userId: String): Future[Cart] = db.run {
    (cart.map(c => c.userId)
      returning cart.map(_.cartId)
      into { case (`userId`, id) => Cart(id, userId) }
      ) += userId
  }

  def list(): Future[Seq[Cart]] = db.run {
    cart.result
  }

  def updateById(id: Int, row: Cart): Future[Int] = db.run {
    cart.filter(_.cartId === id).update(row)
  }
}
