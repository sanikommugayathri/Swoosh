package com.example.gayat.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.gayat.swoosh.Model.Player
import com.example.gayat.swoosh.R
import com.example.gayat.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
