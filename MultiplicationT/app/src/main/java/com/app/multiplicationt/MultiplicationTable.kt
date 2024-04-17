package com.app.multiplicationt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MultiplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        val tableNumber = tableString.toString().toInt()

        val tvResult = findViewById<TextView>(R.id.tvResult)

        var output = "$tableNumber X table \n\n"

        var counter = 1

        while (counter <= 10) {
            val answer = tableNumber * counter
            output += "$tableNumber X $counter = $answer \n"
            counter++
        }

        tvResult.text = output


    }
}