package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class OpinionController @Inject()(opinionRepository: OpinionRepository, productsRepo: ProductRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  val opinionForm: Form[CreateOpinionForm] = Form {
    mapping(
      "product" -> longNumber,
      "comment" -> nonEmptyText
    )(CreateOpinionForm.apply)(CreateOpinionForm.unapply)
  }

  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    products.map(prod => Ok(views.html.opinion(opinionForm, prod)))
  }

  def addOpinion = Action.async { implicit request =>
    var a: Seq[Product] = Seq[Product]()
    val products = productsRepo.list().onComplete {
      case Success(prod) => a = prod
      case Failure(_) => print("fail")
    }

    opinionForm.bindFromRequest.fold(
      formWithErrors => {
        Future.successful(
          Ok(views.html.opinion(formWithErrors, a))
        )
      },
      opinion => {
        opinionRepository.create(opinion.product, opinion.comment).map { _ =>
          Redirect(routes.OpinionController.getOpinions()).flashing("success" -> "Opinion saved!")
        }
      }
    )

  }

  def getOpinions = Action.async { implicit request =>
    opinionRepository.list().map { opinion =>
      Ok(Json.toJson(opinion))
    }
  }
}


case class CreateOpinionForm(product: Long, comment: String)