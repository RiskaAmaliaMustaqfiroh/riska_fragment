package com.mz.riska_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TPFL = findViewById<Button>(R.id.fragmentMerah)
        val TO = findViewById<Button>(R.id.fragmentBiru)
        val pplg = findViewById<Button>(R.id.fragmentPPLG)
        val Kuliner = findViewById<Button>(R.id.fragmentkuliner)
        val Busana = findViewById<Button>(R.id.fragmentbusana)

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, tpflFragment())
            fragmentTransaction.commit()
        }

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, toFragment())
            fragmentTransaction.commit()
        }
        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, pplgFragment())
            fragmentTransaction.commit()
        }
        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, kulinerFragment())
            fragmentTransaction.commit()
        }
        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, busanaFragment())
            fragmentTransaction.commit()
        }
    }
}