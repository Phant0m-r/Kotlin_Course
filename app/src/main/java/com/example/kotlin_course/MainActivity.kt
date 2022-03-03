package com.example.kotlin_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setYandex()

    }

    private fun setYandex() {
        setContentView(R.layout.yandex_constraint)

        findViewById<Button>(R.id.signIn)?.setOnClickListener {
            setVK()
        }
    }

    private fun setVK() {
        setContentView(R.layout.vk_linear)

        findViewById<Button>(R.id.signIn)?.setOnClickListener {
            setYandex()
        }
    }
}