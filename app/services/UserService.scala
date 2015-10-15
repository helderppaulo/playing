package services

import javax.inject.Singleton

/**
 * @author helder
 */

abstract class UserService {
  def create(name : String) : Unit
}

@Singleton
class UserServiceImpl extends UserService {
  
  override def create(name : String) {
    println("creating user:" + name)
  }
}