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

        btnEnviar.setOnClickListener {


            val checkedGeneroRadioButtonId=rg_genero.checkedRadioButtonId
            val Gen=findViewById<RadioButton>(checkedGeneroRadioButtonId)
            val Genero=Gen.text

            val Nombre:String=editNombre.text.toString()
            val Apellido:String=editApellido.text.toString()
            val Edad:String=editEdad.text.toString()
            val Correo:String=editCorreo.text.toString()

            //Checkbox
            val Android =cbAndroid.isChecked
            val Csharp = cbCsharp.isChecked
            val Js =cbJavascript.isChecked

            if (Nombre.isEmpty()){
                Toast.makeText(this, "Campo nombre vacío", Toast.LENGTH_SHORT).show()
            }else{
                if (Apellido.isEmpty()){
                    Toast.makeText(this, "Campo apellido vacío", Toast.LENGTH_SHORT).show()
                }else{
                    if (Edad.isEmpty()){
                        Toast.makeText(this, "Campo edad vacío",Toast.LENGTH_SHORT).show()
                    }else{
                        if(Correo.isEmpty()){
                            Toast.makeText(this,"Campo correo vacío",Toast.LENGTH_SHORT).show()
                        }else{
                            if (!cbAndroid.isChecked && !cbCsharp.isChecked && !cbJavascript.isChecked){
                                Toast.makeText(this,"Debe seleccionar al menos un lenguaje preferido", Toast.LENGTH_SHORT).show()
                            }else{
                                val Lenguaje = if (Android) { "Android " } else { "" }+ if(Csharp){ "C# " }else{ "" }+ if(Js){ "Javascript " }else{ "" }
                                val intent: Intent=Intent(this@MainActivity, Datos::class.java)
                                intent.putExtra("Nombre", Nombre)
                                intent.putExtra("Apellido", Apellido)
                                intent.putExtra("Edad",Edad)
                                intent.putExtra("Correo", Correo)
                                intent.putExtra("Genero", Genero)
                                intent.putExtra("Lenguaje", Lenguaje)
                                startActivity(intent)
                            }
                        }
                    }
                }
            }


        }
    }
}