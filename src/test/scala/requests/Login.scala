package requests

import java.util.concurrent.TimeUnit

import config.Config
import io.gatling.http.Predef.http
import requests.Browse.headers_180
import io.gatling.core.Predef._

object Login {
  val login = group("Login") {
    exec(http("Login")
      .post("/share/page/dologin")
      .headers(headers_180)
      .formParam("username", Config.username)
      .formParam("password", Config.password)
    )
      .pause("3", "10", TimeUnit.SECONDS)
  }
}
