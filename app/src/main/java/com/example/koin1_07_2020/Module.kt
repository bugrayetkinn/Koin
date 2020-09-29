package com.example.koin1_07_2020

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**

Created by : Buğra Yetkin

Mail : bugrayetkinn@gmail.com

 */

val module = module {

    single { Repository(get()) }
    viewModel { MainViewModel(get()) }
}