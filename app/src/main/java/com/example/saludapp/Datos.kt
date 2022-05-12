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
        val Nombre=ObjetoIntent.getStringExtra("Nombre")
        val Apellido=ObjetoIntent.getStringExtra("Apellido")
        val Edad = ObjetoIntent.getStringExtra("Edad")
        val Correo = ObjetoIntent.getStringExtra("Correo")
        txtSaludo.text="Bienvenido $Nombre $Apellido, la edad ingresada es: $Edad años, su correo electrónico es: $Correo"
    }
}