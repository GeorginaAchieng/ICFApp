@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.icfapp.components



import android.content.Context
import android.content.ContextParams
import android.util.Log
import android.widget.Toast
import androidx.activity.contextaware.ContextAwareHelper
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NormalTextComponent(value: String){
    Text(text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.SansSerif
        )
        ,
        color = Color.Red,
        fontSize = 14.sp,
        textAlign = TextAlign.Center

    )

}
@Composable
fun HeadingTextComponent(value: String){
    Text(text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
        ,
        color = Color.Black,
        fontSize = 14.sp,
        textAlign = TextAlign.Center

    )


}


@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        leadingIcon = {
            Icon(Icons.Default.Person, contentDescription = "password")
        },
        label = { Text("First Name")

        }


    )
}

@Composable
fun SimpleOutlinedTextFieldSample2() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        leadingIcon = {
            Icon(Icons.Default.Person, contentDescription = "password")
        },
        label = { Text("Last Name")
        }


    )


}

@Composable
fun SimpleOutlinedTextFieldSample3() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = text,
        onValueChange = { text = it },
        leadingIcon = {
            Icon(Icons.Default.Email, contentDescription = "password")
        },
        label = { Text("Email")
        }    )

}

@Composable
fun PasswordTextField() {
    val userPassword = remember {
        mutableStateOf("")
    }

        // Password input field
        OutlinedTextField(
            value = userPassword.value, onValueChange = {
                userPassword.value = it
            },
            leadingIcon = {
                Icon(Icons.Default.Info, contentDescription = "password")
            },
            label = {
                Text(text = "password")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 0.dp),
            visualTransformation = PasswordVisualTransformation())
}


@Composable
fun SimpleButton() {
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = {
        //your onclick code here

    }) {
        Text(text = "Signup")
    }
}

@Composable
fun DividerDefaults(){
    Row (
        Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically


    ) {
        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
            color = Color.DarkGray,
            thickness = 1.dp)

        Text(text = "Or", fontSize = 24.sp, color = Color.Red, fontWeight = FontWeight.Bold)

        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
            color = Color.DarkGray,
            thickness = 1.dp)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ClickableLoginText(onTextSelected:(String) ->Unit) {
    val initialText  = "Already have an Account?"
    val  loginText = "Login"

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Color.Blue))
        {
            pushStringAnnotation(tag = loginText, annotation = loginText)
        }
    }
    ClickableText(text = annotatedString, onHover = {
        offset ->
        if (offset != null) {
            annotatedString.getStringAnnotations(offset, offset)
                .firstOrNull()?.also { span ->
                    Log.d("ClickableLoginText", "{${span.item}}")
                    if (span.item == loginText){
                        onTextSelected(span.item)
                    }
                }
        }
    }) {
        
    }
}
