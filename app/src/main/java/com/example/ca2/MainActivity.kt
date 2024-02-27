package com.example.ca2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var car1: ImageView
    lateinit var car2: ImageView
    lateinit var btnBook: Button
    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car1 = findViewById(R.id.car1)
        car2 = findViewById(R.id.car2)
        btnBook = findViewById(R.id.btnBook)

        anim = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_right_anim)
        car1.startAnimation(anim)

        anim = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_left_anim)
        car2.startAnimation(anim)

        btnBook.setOnClickListener {
            var intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.move_right, R.anim.zoom_out)
        }
    }
}