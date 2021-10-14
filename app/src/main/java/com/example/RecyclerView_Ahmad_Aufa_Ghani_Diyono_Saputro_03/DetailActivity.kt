package com.example.RecyclerView_Ahmad_Aufa_Ghani_Diyono_Saputro_03

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.RecyclerView_Ahmad_Aufa_Ghani_Diyono_Saputro_03.MainActivity.Companion.INTENT_PARCELABLE

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<Superhero>(INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero= findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgSuperhero.setImageResource(superhero?.imgSuperhero!!)
        nameSuperhero.text = superhero.nameSuperhero
        descSuperhero.text = superhero.descSuperhero

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}