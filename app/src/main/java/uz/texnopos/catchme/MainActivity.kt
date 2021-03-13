package uz.texnopos.catchme

import android.animation.AnimatorInflater
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animator = AnimatorInflater.loadAnimator(this, R.animator.animator)
        animator.setTarget(car)
        animator.start()

        remote.setOnClickListener {
            when {
                remote.text.toString() == "PAUSE" -> {
                    animator.pause()
                    remote.text = "PLAY"
                }
                remote.text.toString() == "PLAY" -> {
                    animator.resume()
                    remote.text = "PAUSE"
                }
            }
        }
    }
}