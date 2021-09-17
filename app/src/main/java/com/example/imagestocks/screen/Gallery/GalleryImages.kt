package com.example.imagestocks.screen.Gallery

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.observe
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.imagestocks.screen.GalleryViewModel

const val TAG ="Gallery"
@Composable
fun GalleryImage( myViewModel : GalleryViewModel , query : String ) {

   val imageList =  myViewModel.getImages()
   Text(text = "Hey Image App")

   Log.d(TAG, "GalleryImage: $imageList ")


}