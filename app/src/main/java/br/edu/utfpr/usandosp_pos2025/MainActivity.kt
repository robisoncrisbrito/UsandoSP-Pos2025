package br.edu.utfpr.usandosp_pos2025

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var imageView : ImageView

    private var ligado = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById( R.id.imageView )
    }

    fun btOnOffOnClick(view: View) {

        when ( ligado ) {
            true -> {
                imageView.setImageResource( android.R.drawable.star_big_off )
                ligado = false
            }
            false -> {
                imageView.setImageResource( android.R.drawable.star_big_on )
                ligado = true
            }
        }

    }
}