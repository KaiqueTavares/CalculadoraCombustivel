package com.tavares.kaique.calculadoragasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val gasolina = intent?.getStringExtra("GASOLINA")!!.toDouble()
        val alcool = intent?.getStringExtra("ALCOOL")!!.toDouble()

        val calculo = alcool / gasolina

        if (calculo < 0.7){
            alterarStatusResultado("Alcool")
            alterarImagemResultado(R.drawable.alcool)
        }else {
            alterarStatusResultado("Gasolina")
            alterarImagemResultado(R.drawable.gasolina)
        }
    }

    fun alterarStatusResultado (texto: String){
        tvResultado.text = texto
    }

    fun alterarImagemResultado (idImagem: Int){
        ivStatus.setImageDrawable(ContextCompat.getDrawable(this, idImagem))
    }
}
