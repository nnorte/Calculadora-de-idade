package com.nnorte.wimbe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_enviar.setOnClickListener(View.OnClickListener {

            val nomeCompleto = et_nome.text.toString()
            val anoNascimento = et_anoNascimento.text.toString().toInt()
            val anoActual = Calendar.getInstance().get(Calendar.YEAR)
            val resultado = "$nomeCompleto tens ${anoActual-anoNascimento} anos de idade"

            Toast.makeText(this,resultado,Toast.LENGTH_LONG).show()
            Snackbar.make(it,resultado,Snackbar.LENGTH_INDEFINITE).show()
            
        })

    }



}
