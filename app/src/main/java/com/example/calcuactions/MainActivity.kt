package com.example.calcuactions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        val add = findViewById<Button>(R.id.add)
        val multiply = findViewById<Button>(R.id.multiply)

        val output = findViewById<TextView>(R.id.output)

        val math = MyMath()

        add.setOnClickListener {
            val num1 = num1.text.toString().toInt()
            val num2 = num2.text.toString().toInt()
            val result = math.add(num1, num2)
            output.text = result.toString()
        }

        multiply.setOnClickListener {
            val num1 = num1.text.toString().toInt()
            val num2 = num2.text.toString().toInt()
            val result = math.multiply(num1, num2)

            output.text = result.toString()
        }
    }
}