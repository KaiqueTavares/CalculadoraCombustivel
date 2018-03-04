package com.tavares.kaique.calculadoragasolina

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    val tempoSplash = 2500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    fun carregar (){
        Handler().postDelayed({
            startActivity(Intent(this,FormActivity::class.java))
            finish()
        },tempoSplash)
    }
}
