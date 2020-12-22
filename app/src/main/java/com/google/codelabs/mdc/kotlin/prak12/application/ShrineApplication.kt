package com.google.codelabs.mdc.kotlin.prak12.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

//menjalankan aplikasi shrine dengan instance ShrineApplication
class ShrineApplication : Application() {
    companion object {
        lateinit var instance: ShrineApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}