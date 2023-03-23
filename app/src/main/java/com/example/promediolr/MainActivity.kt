package com.example.promediolr

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncalcular: Button = findViewById(R.id.btncalculate)
        btncalcular.setOnClickListener { calculator() }

//        val btnsalir: Button = findViewById(R.id.btndevolver)
//        btnsalir.setOnClickListener { calculator() }
    }

    private fun calculator() {


        val namestudent: EditText = findViewById(R.id.idname)
        val namemateria: EditText = findViewById(R.id.idmateria)
        val camponote1: EditText = findViewById(R.id.idnota1)
        val camponote2: EditText = findViewById(R.id.idnota2)
        val camponote3: EditText = findViewById(R.id.idnota3)


        val idname: String = namestudent.text.toString()
        val idmateria: String = namemateria.text.toString()
        val nota1: Double = camponote1.text.toString().toDouble()
        val nota2: Double = camponote2.text.toString().toDouble()
        val nota3: Double = camponote3.text.toString().toDouble()

        val mensajeResult: TextView=findViewById(R.id.textView1)

        var prom: Double = (nota1 + nota2 + nota3) / 3

        var result=""

        if (prom >= 3.5) {
            result="Hola $idname en la materia de $idmateria usted  GANO CON PROMEDIO DE $prom "
            mensajeResult.setTextColor(Color.GREEN)
        } else {
            result="Hola $idname en la materia de $idmateria usted  PERDIO CON PROMEDIO DE $prom "
            mensajeResult.setTextColor(Color.RED)
        }
        mensajeResult.text=result

        Toast.makeText(this,result, Toast.LENGTH_LONG).show()

        val intent= Intent(this, Activityprom::class.java)


        val miBundle:Bundle= Bundle()
        miBundle.putString("prom",mensajeResult!!.text.toString())

        intent.putExtras(miBundle)
        startActivity(intent)
    }

}
