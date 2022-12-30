package pl.msiwak.kmmproject.android.ui.welcome

import androidx.lifecycle.ViewModel
import pl.msiwak.kmmproject.android.navigation.NavigationDirections
import pl.msiwak.kmmproject.android.navigation.Navigator

class WelcomeScreenViewModel(private val navigator: Navigator): ViewModel() {

    val title = "TITLE"

    fun navigateToRegistration() {
        navigator.navigate(NavigationDirections.Registration)
    }
}