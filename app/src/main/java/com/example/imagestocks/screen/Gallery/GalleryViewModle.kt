package com.example.imagestocks.screen

import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.remember
import androidx.lifecycle.*
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.imagestocks.model.UnsplashImage
import com.example.imagestocks.model.UnsplashRepository
import com.example.imagestocks.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {

    private val currentQuery = MutableStateFlow(DEFAULT_QUERY)

    val imageList = currentQuery.flatMapLatest { query ->
repository.getSearchResults(query)
    }.cachedIn(viewModelScope)

//    fun getImages(text :String ) = imageList.map {
//        currentQuery.value = currentQuery.value
//    }


    companion object {
        private const val DEFAULT_QUERY = "cats"
    }
}