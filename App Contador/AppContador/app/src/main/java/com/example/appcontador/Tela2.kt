package com.example.appcontador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val tvResultado:TextView = findViewById(R.id.tv_resultado);

        val usuario = intent.getStringExtra("usuario")
        val contador = intent.getIntExtra("contador", 0)
        val aleatorio = intent.getDoubleExtra("aleatorio", 0.0)

        tvResultado.text = """
        O usuário $usuario clicou $contador vezes.
        Ele sorteou o número $aleatorio
        """.trimIndent();
    }

    override fun onBackPressed() {
        Toast.makeText(this, "hahaha tá preso aqui!", Toast.LENGTH_SHORT).show()
    }
}