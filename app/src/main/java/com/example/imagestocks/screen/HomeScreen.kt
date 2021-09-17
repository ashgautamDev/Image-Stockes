package com.example.imagestocks.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imagestocks.screen.Gallery.GalleryImage
import com.example.imagestocks.ui.components.Searchbar
import com.example.imagestocks.ui.theme.ImageStocksTheme
import com.example.imagestocks.utils.Constants

@Composable
fun HomeScreen(viewModel: GalleryViewModel) {

    Scaffold(
         topBar = { Searchbar(title = "Galaxy ")} ,
        content = { GalleryImage(myViewModel = viewModel, query =  "title")}
    )
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(16.dp)
    ) {

        Searchbar(title = "Galaxy")
        Spacer(modifier = Modifier.height(8.dp))
       GalleryImage(viewModel ,Constants.DEFAULT_QUERY)
    }
}






@Preview(showBackground = true)
@Composable
fun HomePreview() {

}