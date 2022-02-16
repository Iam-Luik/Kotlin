package com.example.projeto01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun olaMundo(v: View){
        Toast.makeText(this, "Olá, Mundo!", Toast.LENGTH_SHORT).show()
    }
}