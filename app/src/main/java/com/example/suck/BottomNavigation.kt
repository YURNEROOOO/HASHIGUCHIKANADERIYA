package com.example.suck

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.suck.bNavItem.AddPictures
import com.example.suck.bNavItem.Favorite
import com.example.suck.bNavItem.Profile
import com.example.suck.bNavItem.SearchView
import com.example.suck.ui.theme.PagerLayout
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Preview
@Composable
fun BottomNav() {

    val selectedIndex: MutableState<Int> = remember { mutableStateOf(0) }
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Scaffold(
            content = {
                when(selectedIndex.value) {
                    0 -> PagerLayout()
                    1 -> SearchView()
                    2 -> AddPictures()
                    3 -> Favorite()
                    4 -> Profile()
                }
            },
            bottomBar = {
                BottomNavigation {
                    BottomNavigationItem(
                        selected = 0 == selectedIndex.value,
                        onClick = { selectedIndex.value = 0 },
                        icon = { Icon(imageVector = Icons.Rounded.Home, contentDescription = null) }
                    )
                    BottomNavigationItem(
                        selected = 1 == selectedIndex.value,
                        onClick = { selectedIndex.value = 1 },
                        icon = { Icon(imageVector = Icons.Rounded.Search, contentDescription = null) }
                    )
                    BottomNavigationItem(
                        selected = 2 == selectedIndex.value,
                        onClick = { selectedIndex.value = 2 },
                        icon = { Icon(imageVector = Icons.Rounded.Menu, contentDescription = null) }
                    )
                    BottomNavigationItem(
                        selected = 3 == selectedIndex.value,
                        onClick = { selectedIndex.value = 3 },
                        icon = { Icon(imageVector = Icons.Rounded.Favorite, contentDescription = null) }
                    )
                    BottomNavigationItem(selected = 4 == selectedIndex.value,
                        onClick = { selectedIndex.value = 4 },
                        icon = { Icon(imageVector = Icons.Rounded.Person, contentDescription = null) }
                    )
                }
            }
        )
    }
}