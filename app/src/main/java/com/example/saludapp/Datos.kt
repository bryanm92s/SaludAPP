package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos.*

class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)


        // Recuperar información

        val ObjetoIntent:Intent=intent
        var Nombre=ObjetoIntent.getStringExtra("Nombre")
        var Apellido=ObjetoIntent.getStringExtra("Apellido")
        txtSaludo.text="Hola, bienvenido $Nombre $Apellido"
    }
}