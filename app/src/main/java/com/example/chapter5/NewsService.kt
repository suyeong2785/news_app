package com.example.chapter5

import retrofit2.Call
import retrofit2.http.GET

interface NewsService {

    @GET("weather/feed/")
    fun mainFeed(): Call<NewsRss>

    @GET("politics/feed/")
    fun politicsNews(): Call<NewsRss>

    @GET("economy/feed/")
    fun economyNews(): Call<NewsRss>

    @GET("society/feed/")
    fun socialNews(): Call<NewsRss>

    @GET("international/feed/")
    fun worldNews(): Call<NewsRss>

    @GET("sports/feed/")
    fun sportsNews(): Call<NewsRss>

}