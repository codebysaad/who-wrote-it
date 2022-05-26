package com.saadfauzi.whowroteit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {
    @GET("volumes")
    fun getBook(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int,
        @Query("printType") printType: String
    ): Call<BooksResponse>
}