package com.sg.post10a_whatsup_emotionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import coil.load
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView_backGround.load(R.drawable.whatup_pho)

      /*  Handler().postDelayed({
          creatAnimation()
        },10000)*/

    }

   /* private fun creatAnimation() {
        ViewAnimator
            .animate(textView)
            .alpha(1f)
            .translationX(-500f,0f)
            .duration(3000)
            .thenAnimate(textView2)
            .translationX(-500f,0f)
            .alpha(1f)
            .duration(3000)
            .thenAnimate(textView20)
            .translationX(-500f,0f)
            .alpha(1f)
            .duration(3000)
            .thenAnimate(textView3)
            .translationX(-500f,0f)
            .alpha(1f)
            .duration(3000)
            .thenAnimate(textView4)
            .translationX(500f,0f)
            .alpha(1f)
            .duration(3000)
            .start()
    }*/
}