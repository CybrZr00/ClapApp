package uk.co.digitaljeeves.clapapp

import android.media.AsyncPlayer
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private var playing = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this, R.raw.applause)
        mediaPlayer.isLooping = true
        val button = findViewById<Button>(R.id.btnClap)

        button.setOnClickListener{
            if (!playing){
                mediaPlayer.start()
                button.text = "Pause"

            }else{
                mediaPlayer.pause()
                button.text = "Clap"
            }
            playing = !playing

        }

    }
}