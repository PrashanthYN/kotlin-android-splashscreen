package com.wemaketrends.kotlin_android_splashscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //create a os handler instance
        val handler=Handler()

        //create a runnable instance
        val runnable= Runnable {
            //prepare intent to start activity
            val intent=Intent(this,MainActivity::class.java)
            //start activity
            startActivity(intent)
            //close present activity
            finish()
        }

        //start thread
        handler.postDelayed(runnable,2000)
    }
}
