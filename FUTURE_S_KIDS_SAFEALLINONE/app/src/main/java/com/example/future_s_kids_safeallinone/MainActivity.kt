package com.example.future_s_kids_safeallinone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.future_s_kids_safeallinone.ui.theme.FUTURE_S_KIDS_SAFEALLINONETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FUTURE_S_KIDS_SAFEALLINONETheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.futura_kid_s_safe),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White))

    Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 60.dp),
        contentAlignment = Alignment.BottomCenter) {
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.size(width = 200.dp, height = 70.dp)) {
            Text(text = "GET ON")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FUTURE_S_KIDS_SAFEALLINONETheme {
        Greeting("Android")
    }
}