package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText1 = findViewById<EditText>(R.id.editTextNumber);
        val editText2 = findViewById<EditText>(R.id.editTextNumber2);
        val textViewResult = findViewById<TextView>(R.id.textViewResult);
        val btn_add = findViewById<Button>(R.id.button);
        val btn_sub = findViewById<Button>(R.id.button2);
        val btn_mul = findViewById<Button>(R.id.button3);
        val btn_div = findViewById<Button>(R.id.button4);
btn_add.setOnClickListener {

    val num1 = editText1.text.toString().toInt();
    val num2 = editText2.text.toString().toInt();
    textViewResult.text = (num1 + num2).toString();

}
        btn_sub.setOnClickListener {

            val num1 = editText1.text.toString().toInt();
            val num2 = editText2.text.toString().toInt();
            textViewResult.text = (num1 - num2).toString();

        }
        btn_mul.setOnClickListener {

            val num1 = editText1.text.toString().toInt();
            val num2 = editText2.text.toString().toInt();
            textViewResult.text = (num1 * num2).toString();

        }
        btn_div.setOnClickListener {

            val num1 = editText1.text.toString().toInt();
            val num2 = editText2.text.toString().toInt();
            textViewResult.text = (num1 / num2).toString();

        }
    }
}