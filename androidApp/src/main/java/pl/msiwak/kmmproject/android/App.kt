package pl.msiwak.kmmproject.android

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import pl.msiwak.kmmproject.android.di.androidModule
import pl.msiwak.kmmproject.di.appModule

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(appModule() + androidModule)
            androidContext(this@App)

        }
    }
}