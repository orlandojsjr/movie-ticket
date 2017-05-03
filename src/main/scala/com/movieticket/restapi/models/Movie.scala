package com.movieticket.restapi.models

case class Movie(imdbid: String, title: String)
case class MovieInfo(imdbid: String, title: String, links: Seq[Relation])
