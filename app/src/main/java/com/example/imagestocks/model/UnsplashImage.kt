package com.example.imagestocks.model.data

data class UnsplashImage(
    val id: String,
    val description: String?,
    val urls: UnsplashImageUrls,
    val user: UnsplashUser
){
    data class UnsplashImageUrls(
        val raw: String,
        val full: String,
        val regular: String,
        val small: String,
        val thumb: String,
    )
    data class UnsplashUser(
        val name: String,
        val username: String
    )  {
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageStocks&utm_medium=referral"
    }
}


