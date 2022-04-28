package com.quentinrouet.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listVoiture = arrayListOf(
            Voiture("Tesla","Model S","EL"),
            Voiture("Renault","Clio","ES"),
            Voiture("Renault","Megane","ES"),
            Voiture("Renault","Zoe","EL"),
            Voiture("Audi","A4","ES"),
            Voiture("Mercedes-Benz","A180","ES"),
            Voiture("BMW","130d","DI"),
            Voiture("Hyundai","Ioniq","EL"),
            Voiture("BMW","13","El"),
            Voiture("Tesla","Model 3","EL"),
            Voiture("Tesla","Model X","EL"),
            Voiture("Kia","Picanto","ES"),
            Voiture("Hyundai","IONIQ5","EL"),
        )

        val rvVoiture = findViewById<RecyclerView>(R.id.recyclerViewVoiture);
        rvVoiture.layoutManager = LinearLayoutManager(this)
        rvVoiture.adapter = VoitureAdapter(listVoiture, VoitureAdapter.OnVoitureClickListener {
            Toast.makeText(this, "Tu a acheté un ${it.marque} ${it.modele}", Toast.LENGTH_SHORT).show()
        })
    }
}