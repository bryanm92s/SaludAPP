package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAceptar.setOnClickListener {

            val Nombre:String=editNombre.text.toString()
            val Apellido:String=editApellido.text.toString()
            val Edad:String=editEdad.text.toString()
            val Correo:String=editCorreo.text.toString()

            val intent: Intent=Intent(this, Datos::class.java)
            intent.putExtra("Nombre", Nombre)
            intent.putExtra("Apellido", Apellido)
            intent.putExtra("Edad",Edad)
            intent.putExtra("Correo", Correo)
            startActivity(intent)
        }
    }
}