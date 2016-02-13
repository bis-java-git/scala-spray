package com.example

import spray.json.{JsonFormat, DefaultJsonProtocol}

import spray.httpx.SprayJsonSupport._

/**
  * Created by hemant joshi on 23/01/2016.
  */


case class Elevation(location: Location, elevation: Double)
case class Location(lat: Double, lng: Double)
case class GoogleElevationApiResult[T](status: String, results: List[T])

object ElevationJsonProtocol extends DefaultJsonProtocol {
  implicit val locationFormat = jsonFormat2(Location)
  implicit val elevationFormat = jsonFormat2(Elevation)
 implicit def googleElevationApiResultFormat[T :JsonFormat] = jsonFormat2(GoogleElevationApiResult.apply[T])
}