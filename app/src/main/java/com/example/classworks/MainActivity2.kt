package com.example.classworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var dlyaText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        dlyaText = findViewById(R.id.textView2)
        val kurs = 86.0

        val dl = intent.extras?.get("key").toString().toDouble() as Double
        val otvet : Double = (dl * kurs)
        dlyaText.text = otvet.toString()


//        val otve : Double = (editOnee + editTwoo)


    }
}