package com.example.imagestocks.api

import com.example.imagestocks.model.UnsplashImage

data class UnsplashResponse(
    val results : List<UnsplashImage>
)
