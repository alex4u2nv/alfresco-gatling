package scenario

import java.util.concurrent.TimeUnit

import io.gatling.core.Predef._
import io.gatling.core.Predef.scenario
import requests.{Browse, Dashboard, Login, Search}


object AlfrescoUser {

  val alfrescoUser = scenario("Use Alfresco")
    .exec(Login.login)
    .pause("3", "5", TimeUnit.SECONDS)
    .exec(Dashboard.dashboard)
    .pause("3", "15", TimeUnit.SECONDS)
    .repeat(10) {
      exec(Search.search)
        .pause("3", "15", TimeUnit.SECONDS)
    }
    .exec(Browse.browse)

}

