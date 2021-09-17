package com.example.imagestocks

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.imagestocks.screen.Gallery.GalleryImage
import com.example.imagestocks.screen.GalleryViewModel
import com.example.imagestocks.screen.HomeScreen
import com.example.imagestocks.ui.theme.ImageStocksTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel : GalleryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ImageStocksTheme {
                GalleryImage(myViewModel = viewModel, query = "Cats")

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ImageStocksTheme {

    }
}

