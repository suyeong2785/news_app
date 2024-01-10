package com.example.chapter5

import retrofit2.Call
import retrofit2.http.GET

interface NewsService {
    @GET("category/news/politics/feed/")
    fun mainFeed(): Call<NewsRss>
}