package com.example.suck.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.suck.bNavItem.SearchView
import com.example.suck.bNavItem.Walpy
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun Pager(){
    Row(modifier = Modifier.fillMaxSize()) {
        Walpy()
        SearchView()
    }
}


@ExperimentalPagerApi
@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Preview
@Composable
 fun PagerLayout(){
        val pagerState = rememberPagerState(
                pageCount = 2,
                infiniteLoop = true
        )

        HorizontalPager(
            state = pagerState,
            verticalAlignment = Alignment.CenterVertically) { page ->
            val hui = Walpy()
        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .padding(4.dp)
        )

 }
