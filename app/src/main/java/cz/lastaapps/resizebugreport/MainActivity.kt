package cz.lastaapps.resizebugreport

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = Color.Yellow) {

                    if (false) {
                        //works
                        Text(text = "Hello world!")
                    } else {

                        val navId = "home"
                        val navController = rememberNavController()

                        //bug
                        NavHost(navController, startDestination = navId) {
                            composable(navId) {
                                Text(text = "Hello navigation!")
                            }
                        }
                    }
                }
            }
        }
    }
}
