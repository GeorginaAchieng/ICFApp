package com.example.icfapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.icfapp.R
import com.example.icfapp.components.ClickableLoginText
import com.example.icfapp.components.DividerDefaults
import com.example.icfapp.components.HeadingTextComponent
import com.example.icfapp.components.NormalTextComponent
import com.example.icfapp.components.PasswordTextField
import com.example.icfapp.components.SimpleButton
import com.example.icfapp.components.SimpleOutlinedTextFieldSample
import com.example.icfapp.components.SimpleOutlinedTextFieldSample2
import com.example.icfapp.components.SimpleOutlinedTextFieldSample3

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),

        ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hallo))
            HeadingTextComponent(value = stringResource(id = R.string.create_an_account))
            Spacer(modifier = Modifier.height(40.dp))
            SimpleOutlinedTextFieldSample()
            SimpleOutlinedTextFieldSample2()
            SimpleOutlinedTextFieldSample3()
            PasswordTextField()
            Spacer(modifier = Modifier.height(20.dp))
            SimpleButton()
            DividerDefaults()
            ClickableLoginText(onTextSelected = {
            })

        }
    }
}





