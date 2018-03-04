package com.tavares.kaique.calculadoragasolina

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        btLimpar.setOnClickListener {
            inputGasolina.editText?.setText("")
            inputAlcool.editText?.setText("")
            inputGasolina.editText?.requestFocus()
        }

        btCalcular.setOnClickListener {
            val telaResultado = Intent(this,ResultadoActivity::class.java)
            telaResultado.putExtra("GASOLINA",inputGasolina.editText?.text.toString())
            telaResultado.putExtra("ALCOOL",inputAlcool.editText?.text.toString())
            startActivity(telaResultado)
        }
    }
}
