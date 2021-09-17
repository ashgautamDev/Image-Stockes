package com.example.imagestocks.model

import androidx.paging.PagingSource
import com.example.imagestocks.api.UnsplashApi
import com.example.imagestocks.utils.Constants
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class UnsplashPagingSource (
    private val unsplashApi: UnsplashApi ,
    private val query : String

    ) : PagingSource<Int , UnsplashImage>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UnsplashImage> {
       val position = params.key ?: Constants.UNSPLASH_STARTING_PAGE_INDEX

        return try {
            val response = unsplashApi.searchImages(query, position, params.loadSize)
            val photos = response.results

            LoadResult.Page(
                data = photos ,
                prevKey = if (position == Constants.UNSPLASH_STARTING_PAGE_INDEX) null else position - 1,
                nextKey = if (photos.isEmpty()) null else position + 1
            )
        }  catch ( exception : IOException){
            LoadResult.Error(exception)
        } catch ( exception : HttpException){
            LoadResult.Error(exception)
        }


    }
}
