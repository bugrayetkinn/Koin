package com.example.koin1_07_2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.core.module.Module

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by inject()
    val myDataClass: MyDataClass by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //val mainViewModel: MainViewModel = get()
        mainViewModel.myPrint()


    }
}