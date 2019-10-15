package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        small_cloud.setOnClickListener {
            selectAnimation()
        }

        big_cloud.setOnClickListener {
            deselectAnimation()
        }
    }


    private fun selectAnimation() {
        val scaleUpAnimation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.scale_up_animation)
        big_cloud.visibility = View.VISIBLE
        small_cloud.visibility = View.GONE
        big_cloud.startAnimation(scaleUpAnimation)
    }


    private fun deselectAnimation() {
        val scaleDownAnimation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.scale_down_animation)
        big_cloud.visibility = View.GONE
        small_cloud.visibility = View.VISIBLE
        small_cloud.startAnimation(scaleDownAnimation)
    }


}
