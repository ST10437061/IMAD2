package com.app.multiplicationt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val etNumber = findViewById<EditText>(R.id.etNumber)

        btnMultiply.setOnClickListener {

            val intent = Intent(this, MultiplicationTable::class.java)

            intent.putExtra("tableNumber", etNumber.text.toString())

            startActivity(intent)
        }
    }
}