package simulations


import java.util.concurrent.TimeUnit

import config.Config
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import _root_.scenario.AlfrescoUser
import scala.concurrent.duration._

class AlfrescoBrowse extends Simulation {

	val httpProtocol = http
		.baseUrl(Config.app_url)
		.inferHtmlResources()

	val scn = AlfrescoUser.alfrescoUser;

	setUp(scn.inject(rampUsers(Config.users) during (Config.rampUp seconds ))).protocols(httpProtocol)
}