package com.example.tradechart

import android.app.Application
import android.content.Context
import retrofit2.Retrofit

class App : Application() {

    companion object {
        lateinit var mContext: Context

        lateinit var retrofitClient: Retrofit
    }

    override fun onCreate() {
        super.onCreate()

        mContext = applicationContext

    }

    fun init() {

    }
}