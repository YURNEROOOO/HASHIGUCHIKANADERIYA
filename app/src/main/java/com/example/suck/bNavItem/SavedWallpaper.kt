package com.example.suck.bNavItem

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Preview
@Composable
fun Walpy() {

    Surface(shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp), elevation = 8.dp) {
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            cells = GridCells.Fixed(3)
        ) {
            items(17){
                OneCard()
            }
        }
    }
}

@ExperimentalMaterialApi
@Preview
@Composable
fun OneCard() {

    Card(
        onClick = {},
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .aspectRatio(1f)
            .padding(4.dp)
    ) {
        Image(
            imageVector = Icons.Rounded.Favorite,
            contentDescription = "Heart")
    }
}