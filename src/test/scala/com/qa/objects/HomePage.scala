package com.qa.objects

import com.qa.helper.ConstantsData._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object HomePage {

  val accessHomePage: HttpRequestBuilder = http("Access Home Page")
    .get(BASE_URL)
    .check(
      status.is(200))
}