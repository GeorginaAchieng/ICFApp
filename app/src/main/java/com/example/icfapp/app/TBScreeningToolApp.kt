package com.example.icfapp.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.icfapp.screens.SignUpScreen

@Composable
fun TBScreeningToolApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        SignUpScreen()
    }
}

@Preview
@Composable
fun DefaultSignUpPreview(){
    SignUpScreen()
}
