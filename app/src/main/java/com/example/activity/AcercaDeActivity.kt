package com.example.activity

import android.app.Activity
import android.os.Bundle

class AcercaDeActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acercade)
    }

    fun cerrar(view: android.view.View) {
        finish()
    }
}
