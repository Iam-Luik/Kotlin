package com.example.appcontador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var contador: Int = 0;

    lateinit var tvContagem:TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvContagem = findViewById(R.id.tv_contagem)
    }

    fun contar(v: View){
        contador++;
        //Toast.makeText(this, "Você clicou $contador vezes", Toast.LENGTH_SHORT).show()
        tvContagem.text = "Você clicou $contador vezes"
    }

    fun zerar(v: View){
        contador = 0;
        tvContagem.text = "";
    }

    fun irParaTela2(v: View){
        val tela2 = Intent(this, Tela2::class.java)
        tela2.putExtra("usuario", "Zé Ruela");
        tela2.putExtra("contador", contador);
        tela2.putExtra("aleatorio", Random.nextDouble(1.0, 100.0));
        startActivity(tela2);
    }
}