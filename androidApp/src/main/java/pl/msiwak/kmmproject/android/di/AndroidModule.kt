package pl.msiwak.kmmproject.android.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import pl.msiwak.kmmproject.android.navigation.Navigator
import pl.msiwak.kmmproject.android.ui.MainViewModel
import pl.msiwak.kmmproject.android.ui.register.RegisterViewModel
import pl.msiwak.kmmproject.android.ui.welcome.WelcomeScreenViewModel
import pl.msiwak.kmmproject.authorization.FirebaseAuthorization

val androidModule = module {
    singleOf(::Navigator)
    single { FirebaseAuthorization() }
    factory { MainViewModel(get()) }
    factory { RegisterViewModel(get()) }
    factory { WelcomeScreenViewModel(get()) }
}
