package com.paramvir.appcentersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(application, "38d6b371-11ca-498d-9909-c45b50c87a9d", Analytics::class.java, Crashes::class.java)



    }

    private fun dummyMethod():String{
        return "";
    }
}
