package com.sks.alibi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sks.alibi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.title.text = "SKS : Alibi"
        b.subtitle.text = "Prototype — écran d’accueil"
        b.btnStart.setOnClickListener {
            b.subtitle.text = "Partie locale (démo)…"
        }
    }
}
