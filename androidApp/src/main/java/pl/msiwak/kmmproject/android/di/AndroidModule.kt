package pl.msiwak.kmmproject.android.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import pl.msiwak.kmmproject.android.navigation.Navigator
import pl.msiwak.kmmproject.android.ui.MainViewModel
import pl.msiwak.kmmproject.android.ui.welcome.WelcomeScreenViewModel

val androidModule = module {
    singleOf(::Navigator)
    factory { MainViewModel(get()) }
    factory { WelcomeScreenViewModel(get()) }
}
