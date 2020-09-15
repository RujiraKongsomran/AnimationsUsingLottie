package com.rujirakongsomran.animationsusinglottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isCheckedDone = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lottieCheckedDone.setOnClickListener {
            if (isCheckedDone) {
                lottieCheckedDone.speed = -1f
                lottieCheckedDone.playAnimation()
                isCheckedDone = false
            } else {
                lottieCheckedDone.speed = 1f
                lottieCheckedDone.playAnimation()
                isCheckedDone = true
            }
        }

    }
}