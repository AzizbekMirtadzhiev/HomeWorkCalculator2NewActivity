package com.example.classworks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var buttonRaschitat : Button
    private lateinit var dlyaEdittext : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRaschitat = findViewById(R.id.button)

        dlyaEdittext = findViewById(R.id.edddit)


        buttonRaschitat.setOnClickListener {
            val  input = dlyaEdittext.text.toString().toDouble()
            val intent = Intent(this@MainActivity, MainActivity2:: class.java)
            intent.putExtra("key", input )
            startActivity(intent)

        }


    }
}