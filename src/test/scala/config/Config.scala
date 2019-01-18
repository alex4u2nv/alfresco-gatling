package config

object Config {
  val app_url = System.getProperty("app_url", "http://localhost:8080")
  val username = System.getProperty("username", "admin")
  val password = System.getProperty("password", "admin")

  val users = Integer.getInteger("users", 1).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt
}
