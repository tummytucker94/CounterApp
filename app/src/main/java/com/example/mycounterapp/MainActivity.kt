package com.example.mycounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.tv)
        val button: Button = findViewById(R.id.button)


        button.setOnClickListener {
            tv.setText(""+increaseCounter())
        }
    }
    fun increaseCounter(): Int{
        counter++
        return counter
    }

}

