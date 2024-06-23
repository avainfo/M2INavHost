package fr.avainfo.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import fr.avainfo.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MainScreen(navController: NavHostController) {
	Column(
		modifier = Modifier.fillMaxSize(),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text("First Screen")
		Button(
			onClick = { navController.navigate("second") },
			modifier = Modifier
				.clip(RoundedCornerShape(100))
				.background(MaterialTheme.colorScheme.primary),
		) {
			Text("Go to Second Screen")
		}
	}
}

@Preview
@Composable
private fun MainScreenPreview() {
	MyApplicationTheme {
		Scaffold { innerPadding ->
			Column(
				modifier = Modifier
					.padding(innerPadding)
					.fillMaxSize(),
				verticalArrangement = Arrangement.Center,
				horizontalAlignment = Alignment.CenterHorizontally
			) {
				Text("Scene Numéro 2")
			}
		}
	}
}