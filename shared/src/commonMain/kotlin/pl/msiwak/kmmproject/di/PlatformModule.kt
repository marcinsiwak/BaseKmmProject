package pl.msiwak.kmmproject.di

import org.koin.dsl.module
import pl.msiwak.kmmproject.Platform

val platformModule = module {
    single<Platform> { Platform() }
}