package controllers

import javax.inject._

import play.api._
import play.api.libs.json.Json
import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class ExternalApiController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.obj("result" -> "ok", "apiType" -> "external"))
  }

  def getWithParameter(param: Option[String]) =  Action { implicit request: Request[AnyContent] =>
    Ok(Json.obj("result" -> "ok", "param" -> param.getOrElse("no param").toString))
  }

  def postWithParameter(param: Option[String]) = Action { implicit request: Request[AnyContent] =>
    Ok(Json.obj("result" -> "ok", "param" -> param.getOrElse("no param").toString))
  }
}
