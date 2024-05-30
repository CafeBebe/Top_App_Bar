package com.example.topappbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.topappbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        supportFragmentManager.beginTransaction().replace(R.id.content, Home()).commit()

        binding?.panel?.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.homeItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Home()).commit()

                R.id.deliveryItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Delivery()).commit()

                R.id.contactsItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Contacts()).commit()

                R.id.catalogItemBottomNav -> supportFragmentManager.beginTransaction()
                    .replace(R.id.content, Catalog()).commit()



            }

            return@setOnItemSelectedListener true


        }

    }
}