package com.uvg.labintends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        if(bundle != null) {
            val texto = bundle.getString("valor")
            txtTexto.text = texto

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this, valor2, Toast.LENGTH_SHORT).show()

            /*
            val valor3 = bundle.getString("valor2")

            if(valor3 != null){
                Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()
            }*/

            val valor3 = bundle.getString("valor3", "No hay valor")
            Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()

        }

    }
}