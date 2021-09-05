package com.example.rejang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SlashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slash_screen)

        Handler(Looper.getMainLooper()).postDelayed({
            // Code here
            val intent: Intent = Intent(
                this,NavigateActivity::class.java

            )
            this.startActivity(intent )
            //finish() -- Kills an activity
        }, 3000) //

    }
}