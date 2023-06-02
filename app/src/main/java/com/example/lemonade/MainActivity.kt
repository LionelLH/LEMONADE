package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lemonade.ui.theme.LEMONADETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LEMONADETheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    //color = MaterialTheme.colors.background
                ){
                    LemonApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun LemonApp() {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally){
        Button(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(R.drawable.lemon_tree), contentDescription = "")
            LemonAppProcess( stringResource(R.string.lemon))
        }
    }
}

@Composable
fun LemonAppProcess(name: String,modifier : Modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)
) {
    Text(text = "Hello! $name")
}