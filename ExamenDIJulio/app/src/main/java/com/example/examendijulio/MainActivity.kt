package com.example.examendijulio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.examendijulio.ui.theme.ExamenDIJulioTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            vistaExamen()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun vistaExamen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row(
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp)
                .fillMaxWidth()
                .background(color = Color.DarkGray)
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.background(color = Color.Red)) {
                Text(
                    text = "Hello World!"
                )

            }

            Column(
                modifier = Modifier
                    .background(color = Color.Red)
                    .padding()
            ) {
                Text(
                    text = "Hello World!"
                )

                Text(
                    text = "Hello World!"
                )

                Text(
                    text = "Hello World!"
                )

            }

        }

        Row(
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp)
                .background(color = Color.White)
                .height(100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Hello World!",
                fontSize = 40.sp
            )
        }

        Row(
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp)
                .background(color = Color.Green).fillMaxWidth()
                ,
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.background(color = Color.Blue).padding()) {
                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("1")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("2")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("3")
                }

            }

            Column(modifier = Modifier.background(color = Color.Magenta).padding(start = 40.dp, end = 40.dp)) {
                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("4")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("5")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("6")
                }

            }

            Column(modifier = Modifier.background(color = Color.Black).padding()) {
                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("7")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("8")
                }

                Button(
                    onClick = {},
                    modifier = Modifier.size(60.dp)
                ) {
                    Text("9")
                }

            }
        }

    }
}

