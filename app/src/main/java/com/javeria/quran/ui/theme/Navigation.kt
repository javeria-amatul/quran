package com.javeria.quran.ui.theme

import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DefaultPreview() {
    val navController = rememberNavController()
    QuranTheme{
        NavHost(navController, startDestination = "home") {
            composable(route = "home") {
                HomeScreen( readingListScreen = { navController.navigate("readAndListen") })
            }
            composable("readAndListen") { ReadAndListenScreen() }
        }
    }
}

@Composable
fun HomeScreen(readingListScreen: () -> Unit) {
    Surface {
        Button(onClick = readingListScreen) {
            Text(text = "Read surah")
        }
    }
}

@Composable
fun ReadAndListenScreen() {
    Surface {
        Text(text = "Read And Listen Screen")
    }
}