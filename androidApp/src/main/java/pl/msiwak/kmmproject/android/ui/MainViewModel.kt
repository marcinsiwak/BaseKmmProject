package pl.msiwak.kmmproject.android.ui

import androidx.lifecycle.ViewModel
import pl.msiwak.kmmproject.android.navigation.Navigator

class MainViewModel(private val navigator: Navigator) : ViewModel() {

    val mainNavigator = navigator
}