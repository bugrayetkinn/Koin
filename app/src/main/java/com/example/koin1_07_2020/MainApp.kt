package com.example.koin1_07_2020

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


/**

Created by : Buğra Yetkin

Mail : bugrayetkinn@gmail.com

 */

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {

            androidContext(this@MainApp)
            modules(listOf(module))
        }

    }
}