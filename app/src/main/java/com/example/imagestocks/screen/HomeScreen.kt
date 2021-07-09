package com.example.imagestocks.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imagestocks.ui.theme.ImageStocksTheme

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(16.dp)
    ) {

        TopBar()
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn() {
        }
    }

}

@Composable
fun TopBar() {
    val title: String = ""
    Row(horizontalArrangement = Arrangement.SpaceAround) {
        Text(text = title, style = MaterialTheme.typography.h2, fontWeight = FontWeight.Bold)
        Icon(imageVector = Icons.Default.Search, contentDescription = "")
    }
}

@Composable
fun ImageCard() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .shadow(6.dp, shape = RoundedCornerShape(12.dp))
    ){
        //Image Here
    }
}
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    ImageStocksTheme {
        HomeScreen()

    }
}