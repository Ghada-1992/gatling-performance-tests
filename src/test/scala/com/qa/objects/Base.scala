package com.qa.objects

import com.qa.helper.ConstantsData._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

object Base {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl(BASE_URL)
    .warmUp(BASE_URL)
    .acceptHeader(ACCEPT_HEADER)
}