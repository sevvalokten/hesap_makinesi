package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        val result = findViewById<EditText>(R.id.result)
        val addButton = findViewById<Button>(R.id.btnAdd)
        val resetButton = findViewById<Button>(R.id.btnReset)

        addButton.setOnClickListener {
            val num1 = input1.text.toString().toDoubleOrNull()
            val num2 = input2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                result.setText((num1 + num2).toString())
            } else {
                result.setText("Hatalı giriş")
            }
        }

        resetButton.setOnClickListener {
            input1.setText("")
            input2.setText("")
            result.setText("")
        }
    }
}
