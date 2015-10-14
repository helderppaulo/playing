package controllers

import play.api._
import play.api.mvc._

class BatataController extends Controller {
  def batatar = Action {
    Ok(views.html.index("batata!!!!!"))
  }
}

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def hello = Action {
    Ok(views.html.index("helloooo22220982892198321!"))
  }
  
  def teste = Action {
    Ok(views.html.index("uhuhuhuhuhu"))
  }

}
