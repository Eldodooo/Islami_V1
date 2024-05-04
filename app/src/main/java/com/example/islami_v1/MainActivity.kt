package com.example.islami_v1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islami_v1.fragments.HomeFragment
import com.example.islami_v1.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var homeTabTextView : TextView
    lateinit var profileTabTextView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeTabTextView = findViewById(R.id.home_tab)
        profileTabTextView = findViewById(R.id.profile_tab)

        homeTabTextView.setOnClickListener{
            // show or hide or replace fragment you need supportFragmentManger
           /* supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,HomeFragment())
                .addToBackStack("Home")
                .commit()*/
            pushFragment(HomeFragment())


        }
        profileTabTextView.setOnClickListener(){
            pushFragment(ProfileFragment())

        }
    }
    fun pushFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).addToBackStack("null").commit()
        Log.e("Tag","pushFragment:")

    }
}