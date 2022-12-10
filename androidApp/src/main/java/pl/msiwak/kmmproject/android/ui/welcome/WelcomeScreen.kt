package pl.msiwak.kmmproject.android.ui.welcome

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun WelcomeScreen(navigator: NavHostController?) {
    Column {
        Text(text = "Welcome screen")
        Button(onClick = { navigator?.navigate("register") }) {
            Text(text = "OPEN REGISTRATION")
        }
    }
}

@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(null)
}