package com.example.suck

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.suck.bNavItem.AddPictures
import com.example.suck.bNavItem.Favorite
import com.example.suck.bNavItem.Profile
import com.example.suck.bNavItem.SearchView
import com.example.suck.ui.theme.PagerLayout
import com.example.suck.ui.theme.SuckTheme
import com.google.accompanist.pager.ExperimentalPagerApi


class MainActivity : ComponentActivity() {

    @ExperimentalPagerApi
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuckTheme{
                Surface {
                    MainUI()
                    BottomNav()
                }
            }
        }
    }
}

@ExperimentalPagerApi
@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Preview
@Composable
fun MainUI() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Wallpaper") {
        composable("Wallpaper") { PagerLayout() }
        composable("Search") { SearchView() }
        composable("AddPict") { AddPictures() }
        composable("Favorite") { Favorite() }
        composable("Profile") { Profile() }
    }
}







