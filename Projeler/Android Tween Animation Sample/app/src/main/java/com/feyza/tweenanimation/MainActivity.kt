package com.feyza.tweenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var spinButton: Button
    private lateinit var imageView: ImageView
    private lateinit var blinkButton: Button
    private lateinit var zoomButton: Button
    private lateinit var moveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinButton = findViewById(R.id.spinButton)
        blinkButton = findViewById(R.id.blinkButton)
        imageView = findViewById(R.id.imageView2)
        zoomButton = findViewById(R.id.zoomButton)
        moveButton = findViewById(R.id.moveButton)

        spinButton.setOnClickListener {
            val spinAnimation= AnimationUtils.loadAnimation(this, R.anim.spin)
            imageView.startAnimation(spinAnimation)
        }

        blinkButton.setOnClickListener {
            val blinkAnimation= AnimationUtils.loadAnimation(this, R.anim.blink)
            imageView.startAnimation(blinkAnimation)
        }

        zoomButton.setOnClickListener {
            val zoomAnimation= AnimationUtils.loadAnimation(this, R.anim.zoom)
            imageView.startAnimation(zoomAnimation)
        }

        moveButton.setOnClickListener {
            val moveAnimation= AnimationUtils.loadAnimation(this, R.anim.move)
            imageView.startAnimation(moveAnimation)
        }


    }
}