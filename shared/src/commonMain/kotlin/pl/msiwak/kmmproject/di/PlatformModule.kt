package pl.msiwak.kmmproject.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import pl.msiwak.kmmproject.Platform

val platformModule = module {
    singleOf<Platform> { Platform() }
}