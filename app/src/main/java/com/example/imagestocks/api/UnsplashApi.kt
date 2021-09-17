package com.example.imagestocks.api


import com.example.imagestocks.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    @Headers("Accept-Version: v1", "Authorization: Client-ID ${Constants.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ) : UnsplashResponse
}