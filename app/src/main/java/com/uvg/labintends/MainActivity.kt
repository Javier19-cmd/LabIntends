package com.uvg.labintends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "Hola Mundo")
            intent.putExtra("valor2", "Prueba")
            //intent.putExtra("valor3", "aaa")
            startActivity(intent)
            //finish()
        }
    }
}