package com.rujirakongsomran.jc_gallerytransitionwithpager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalPager() {
    val images = remember {
        mutableStateListOf(
            "https://cdn.pixabay.com/photo/2017/09/25/13/12/puppy-2785074_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/02/18/18/37/puppy-1207816_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/11/17/13/13/puppy-1047521_1280.jpg",
            "https://cdn.pixabay.com/photo/2018/05/11/08/11/dog-3389729_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/07/31/21/15/dog-2561134_1280.jpg",
            "https://cdn.pixabay.com/photo/2014/04/05/11/40/dog-316598_1280.jpg"
        )
    }

    val pagerState = rememberPagerState()
    VerticalPager(
        pageCount = images.size,
        state = pagerState
    ) { index ->
        AsyncImage(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp)),
            model = ImageRequest.Builder(LocalContext.current)
                .data(images[index])
                .build(),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
        )
    }
}