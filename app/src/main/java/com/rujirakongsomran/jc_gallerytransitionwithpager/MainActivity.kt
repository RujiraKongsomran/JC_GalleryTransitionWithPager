package com.rujirakongsomran.jc_gallerytransitionwithpager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rujirakongsomran.jc_gallerytransitionwithpager.ui.theme.JC_GalleryTransitionWithPagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_GalleryTransitionWithPagerTheme {
                // A surface container using the 'background' color from the theme
                VerticalPager()
            }
        }
    }
}
