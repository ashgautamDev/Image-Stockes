package com.example.imagestocks.ui.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.imagestocks.utils.LoadingNetworkImage


@Composable
fun Searchbar(title: String) {
    var titleText by remember { mutableStateOf(title) }
    Card( modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp), backgroundColor = Color.White) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
                value = titleText,
                onValueChange = { titleText = it },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                },
                keyboardActions =
                KeyboardActions(onSearch = { Log.d("onDone ", "We will search Images from here  ") })
            )
        }
    }
}

@Composable
fun ImageCard(url: String , userName : String) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .shadow(6.dp, shape = RoundedCornerShape(12.dp))
    ) {
        LoadingNetworkImage(url = url)
        Text(text = userName , Modifier.padding(8.dp).align(Alignment.BottomStart))
    }
}