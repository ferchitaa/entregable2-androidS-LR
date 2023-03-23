package com.example.promediolr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class Activityprom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityprom)


       val camporesultado=findViewById<TextView>(R.id.textMensaje)
        var miBundle:Bundle? =this.intent.extras


        if (miBundle!=null) {
            camporesultado.text= " ${miBundle.getString("prom")}"
        }

        val btnsalir:Button=findViewById(R.id.btnsalir)
        btnsalir.setOnClickListener{Onclick ()}
    }

    private fun Onclick(){
        finish()
    }
}