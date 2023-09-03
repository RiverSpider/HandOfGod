package com.example.handofgod

import android.media.Image
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus: Button = findViewById(R.id.Plus)

        val minus: Button = findViewById(R.id.Minus)

        val handle: ImageView = findViewById(R.id.Handle)

        plus.setOnClickListener()
        {

            if (handle.rotation == 0f){

                val plus = AnimationUtils.loadAnimation(
                    this,
                    R.anim.rotate_clockwise
                )


                handle.startAnimation(plus)
                handle.rotation = -90f
            }
        }

        minus.setOnClickListener()
        {

            if (handle.rotation == -90f){
            val minus = AnimationUtils.loadAnimation(
                this ,
                R.anim.rotate_anticlockwise
            )

            handle.startAnimation(minus)
            handle.rotation = 0f
        }
        }
    }
}

