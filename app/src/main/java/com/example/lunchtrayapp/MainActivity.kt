package com.example.lunchtrayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lunchtrayapp.ui.theme.LunchTrayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LunchTrayAppTheme {
                    LunchTrayApp()
            }
        }
    }
}

