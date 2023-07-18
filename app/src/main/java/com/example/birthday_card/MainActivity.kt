package com.example.birthday_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import com.example.birthday_card.ui.theme.BirthdaycardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdaycardTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingWithImage("Happy Birthday Shukrani !", "From: Chrinovic MM")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(
    message: String, 
    from: String,
    modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = message,
            fontSize = 20.sp
        )
        Text(
            text = from,
            fontSize = 10.sp
        )
    }

}

@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box{
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = message, from = from)
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdaycardTheme() {
        BirthdayGreetingWithText("Happy Birthday Sam!", "From: chrinovic MM")
    }
}
