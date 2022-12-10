package pl.msiwak.kmmproject.android.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import pl.msiwak.kmmproject.android.ui.welcome.WelcomeScreenViewModel

val androidModule = module {
    singleOf(::WelcomeScreenViewModel)
}