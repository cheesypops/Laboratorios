package com.example.laboratorio03_viana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCents: ImageView
    private lateinit var tenCents: ImageView
    private lateinit var quarterCents: ImageView
    private lateinit var dollar: ImageView

    private lateinit var cash: TextView
    private var pixto = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        OnClickListener()
    }

    private fun bind(){
        fiveCents = findViewById(R.id.img_fivec)
        tenCents = findViewById(R.id.img_tenc)
        quarterCents = findViewById(R.id.img_quarter)
        dollar = findViewById(R.id.img_dollar)
        cash = findViewById(R.id.text_score)
    }

    private fun OnClickListener(){
        fiveCents.setOnClickListener{
            Add(0.05.toFloat())
        }
        tenCents.setOnClickListener{
            Add(0.1.toFloat())
        }
        quarterCents.setOnClickListener{
            Add(0.25.toFloat())
        }
        dollar.setOnClickListener{
            Add(1.toFloat())
        }
    }

    private fun Add(money: Float){

        pixto += money
        var text_cash = String.format("%.2f", pixto)

        cash.text = ""
        cash.text = "$${text_cash}"

    }
}