package com.example

/**
  * Created by hemant joshi on 23/01/2016.
  */

import akka.actor.ActorSystem
import org.scalatest.{Matchers, FreeSpec}
import spray.testkit.ScalatestRouteTest
import spray.http.StatusCodes._

import scala.concurrent.duration.DurationInt

class ElevationServiceSpec extends FreeSpec with MyService with ScalatestRouteTest with Matchers {
  def actorRefFactory = system
  implicit def default(implicit system: ActorSystem) = RouteTestTimeout(new DurationInt(5).second)

  "The Elevation Service" - {
    "when calling GET /api/ElevationService/39/80" - {
      "should return '1159.288940429688'" in {
        Get("/api/ElevationService/39/80") ~> myRoute ~> check {


          status should equal(OK)

        //  status.value.contains("1159.288940429688")
          responseAs[String] contains "1159.288940429688"
        }
      }
    }
  }
}
