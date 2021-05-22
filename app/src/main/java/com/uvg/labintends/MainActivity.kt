package com.uvg.labintends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Tener cuatro botones que representan suma, resta, multiplicación y división.
        //Cada botón redirige a MainActiviy2
        //En el MainActivity2 tienen que haber dos editText para poder ingresar los números.
        //

        //Botón para realizar la suma.
        btnSumar.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "Sumar")
            intent.putExtra("valor2", "Prueba")

            startActivityForResult(intent, 1)
        }

        //Botón para realizar la resta.
        btnRestar.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("valor", "Restar")
            intent.putExtra("valor2", "Prueba")
            //intent.putExtra("valor3", "aaa")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)
        }

        //Botón para realizar la multiplicación.
        btnMultiplicar.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "Multiplicar")
            intent.putExtra("valor2", "Prueba")
            //intent.putExtra("valor3", "aaa")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)
        }

        //Botón para realizar la división.
        btnDividir.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "Dividir")
            intent.putExtra("valor2", "Prueba")
            //intent.putExtra("valor3", "aaa")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK){
            if(requestCode == 1) {
                val bundle = data?.extras
                if(bundle != null){
                    val resultado = bundle.getString("resultado1")
                    Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}