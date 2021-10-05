package com.example.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular: Button =  Calcular
        val resutado: TextView = Resutado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(Nota1.text.toString())
            val nota2 = Integer.parseInt(Nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(Falta.text.toString())

            if (media>= 6 && faltas<= 10 ){
                Resutado.setText("Aluno aprovado " + "\n" +"Media :"+ media + "\n" + "Faltas :" + faltas)
                Resutado.setTextColor(Color.GREEN)

            }else{
                Resutado.setText("Aluno reprovado " + "\n"+"Media :"+ media + "\n" + "Faltas :" + faltas)
                Resutado.setTextColor(Color.RED)
            }
        }
    }

}
