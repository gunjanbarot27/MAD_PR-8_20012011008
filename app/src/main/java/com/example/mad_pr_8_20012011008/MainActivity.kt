package com.example.mad_pr_8_20012011008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun animation(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.bounce)
        iv.startAnimation(an)
    }
    fun animation2(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.fade_in)
        iv.startAnimation(an)
    }
    fun animation3(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.rotate)
        iv.startAnimation(an)
    }
    fun animation4(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.fade_out)
        iv.startAnimation(an)
    }
    fun animation5(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.zoom_in)
        iv.startAnimation(an)
    }
    fun animation6(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.zoom_out)
        iv.startAnimation(an)
    }
    fun animation7(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.slide_up)
        iv.startAnimation(an)
    }
    fun animation8(view: View)
    {
        var iv=findViewById<ImageView>(R.id.imageView)
        val an= AnimationUtils.loadAnimation(this,R.anim.slide_down)
        iv.startAnimation(an)
    }
}