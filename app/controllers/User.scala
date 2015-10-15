package controllers

import javax.inject.Inject
import play.api.mvc.Action
import play.api.mvc.Controller
import services.UserService
import javax.inject.Singleton


/**
 * @author helder
 */
@Singleton
class User @Inject() (service : UserService) extends Controller {
  def create = Action {
    service.create("usuario1")
    Ok(<h1>User Creation</h1>).as(HTML).withHeaders("Accept" -> "*/*");
  }
}