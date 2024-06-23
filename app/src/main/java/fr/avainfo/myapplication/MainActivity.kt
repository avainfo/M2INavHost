package fr.avainfo.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.avainfo.myapplication.screens.EndScreen
import fr.avainfo.myapplication.screens.MainScreen
import fr.avainfo.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			MyApplicationTheme {
				Scaffold(
					modifier = Modifier
						.fillMaxSize()
						.background(Color.Gray)
				) { innerPadding ->
					MainNavHost(innerPadding)
				}
			}
		}
	}
}

@Composable
fun MainNavHost(innerPadding: PaddingValues) {
	val navController = rememberNavController()
	NavHost(navController = navController, startDestination = "first") {
		composable("first") { MainScreen(navController) }
		composable("second") { EndScreen(navController) }
		composable(route = "test", content = { EndScreen(navController) })
	}
}