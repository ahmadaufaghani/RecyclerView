package com.example.RecyclerView_Ahmad_Aufa_Ghani_Diyono_Saputro_03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
    val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.superman,
                "Superman",
                "Powers : Flight, Super Strength, Invulnerability, Super Speed, Super Hearing, Super Breath, X-Ray."
            ),
            Superhero(
                R.drawable.batman,
                "Batman",
                "Powers : Gadgets, Superhuman Level Strength, Superhuman Level Agility, Superhuman Level Intellect."
            ),
            Superhero(
                R.drawable.flash,
                "Flash",
                "Powers : Immense superhuman speed, stamina, reflexes, agility, endurance, and strength. "
            ),
            Superhero(
                R.drawable.wonderwoman,
                "Wonder Woman",
                "Powers : Superhuman strength, Mastery Over Lasso, Flight, Teleportation."
            ),
            Superhero(
                R.drawable.cyborg,
                "Cyborg",
                "Powers :  Superhuman strength, speed, stamina, and flight."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.list_superhero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}