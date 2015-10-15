

import com.google.inject.AbstractModule
import services.UserService
import services.UserServiceImpl

class DevelopmentGuiceModule extends AbstractModule {

  protected def configure() {
      bind(classOf[UserService]).to(classOf[UserServiceImpl])
	}
    
}