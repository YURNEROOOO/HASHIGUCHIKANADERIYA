package com.example.suck.bNavItem

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Preview
@Composable
fun SearchView() {
    val textState = remember { mutableStateOf( TextFieldValue()) }

    Column(
        Modifier
            .fillMaxWidth()
        ) {

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            value = textState.value,
            onValueChange = { textState.value = it },
            placeholder = { Text(text = "Search") },
            singleLine = true,
            textStyle = TextStyle(color = Color.Black, fontSize = 18.sp),
            shape = RoundedCornerShape(16.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "image",
                    tint = Color.Gray
                ) }
        )
        Surface( ) {
            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                cells = GridCells.Fixed(2)
            ) {
                items(12){
                    OneCardSearch()
                }
            }
        }
    }
}

@ExperimentalMaterialApi
@Preview
@Composable
fun OneCardSearch(){

    Card(
        onClick = {},
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(0.5f)
            .padding(4.dp)
    ) {
        Column( Modifier.background(Color.Blue) ) {}
    }
}