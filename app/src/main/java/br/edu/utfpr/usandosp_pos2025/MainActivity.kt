package br.edu.utfpr.usandosp_pos2025

import android.content.Context
import android.content.SharedPreferences
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

    private lateinit var sharedPreference : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById( R.id.imageView )

        sharedPreference = getSharedPreferences(
            "properties",
            Context.MODE_PRIVATE
        )

        ligado = sharedPreference.getBoolean( "ligado", false )

        when ( ligado ) {
            true  -> imageView.setImageResource( android.R.drawable.star_big_on )
            false -> imageView.setImageResource( android.R.drawable.star_big_off )
        }

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

        val editor = sharedPreference.edit()
        editor.putBoolean( "ligado", ligado )
        editor.apply()



    }
}