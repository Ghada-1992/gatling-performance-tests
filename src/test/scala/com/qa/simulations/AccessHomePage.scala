package com.qa.simulations

import com.qa.objects._
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.structure.ScenarioBuilder

import scala.concurrent.duration._

class AccessHomePage extends Simulation {


  val accessHomePage: ScenarioBuilder = scenario("Access Home Page")
    .exec(HomePage.accessHomePage)

  setUp(
    accessHomePage.inject(
      rampUsers(1000) during (15 seconds)
    )
  )
    .protocols(Base.httpProtocol)
}
