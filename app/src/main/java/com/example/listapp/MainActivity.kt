package com.example.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "MainActivity", Toast.LENGTH_SHORT).show()

        val listFragment = ListFragment()
        val detailsFragment = DetailsFragment()

        loadFragment(listFragment)

        findViewById<MaterialButton>(R.id.btn_list_fragment).setOnClickListener {
            loadFragment(listFragment)
        }

        findViewById<MaterialButton>(R.id.btn_details_fragment).setOnClickListener {
            loadFragment(detailsFragment)
        }
    }
    fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            this.replace(R.id.fragment_container, fragment)
            this.commit()
        }
    }
}