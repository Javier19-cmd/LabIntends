package com.uvg.labintends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.txtTexto
import kotlinx.android.synthetic.main.activity_main2.btnOperar
import kotlinx.android.synthetic.main.activity_main2.btnRegresar

class MainActivity3 : AppCompatActivity() {
    lateinit var numero1: EditText
    lateinit var numero2: EditText
    lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

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


            this.numero1 = this.findViewById(R.id.valorA)
            this.numero2 = this.findViewById(R.id.valorB)
            this.res = this.findViewById(R.id.txtTexto)

        }

        //Botón para hacer las operaciones.
        btnOperar.setOnClickListener(){

            /*
            val num1 = findViewById<EditText>(R.id.valorA)
            val num2 = findViewById<EditText>(R.id.valorB)

            val n1: String = num1.getText().toString()
            val n2: String = num2.getText().toString()

            val numero1: Int = Integer.parseInt(n1)
            val numero2: Int = Integer.parseInt(n2)

            var rta: Int = 0

            rta = numero1 + numero2

            intent.putExtra("Valor", "($rta)")*/

            var num1:String = numero1.text.toString()
            var num2:String = numero2.text.toString()

            val resultado = (num1.toFloat() - num2.toFloat())

            res.setText(resultado.toString())

        }

        //Botón para regresar al menú principal.
        btnRegresar.setOnClickListener()
        {

            val intent: Intent = Intent()
            intent.putExtra("resultado1", "valor de pantalla 2")
            setResult(RESULT_OK, intent)
            finish() //Finalizo la pantalla.
        }

    }


}