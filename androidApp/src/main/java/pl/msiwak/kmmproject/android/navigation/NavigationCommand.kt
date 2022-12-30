package pl.msiwak.kmmproject.android.navigation

import androidx.navigation.NamedNavArgument

interface NavigationCommand {
    val arguments: List<NamedNavArgument>
    val destination: String
}