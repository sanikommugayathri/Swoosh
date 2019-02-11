package com.example.gayat.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gayat.swoosh.Model.Player
import com.example.gayat.swoosh.R
import com.example.gayat.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player(league = "", skill = "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View) {
        womensButton.isChecked = false
        co_edButton.isChecked = false

        player.league = "Mens"
    }

    fun onWomensClicked(view: View) {
        mensButton.isChecked = false
        co_edButton.isChecked = false

        player.league = "Womens"
    }

    fun onCoedClicked(view: View) {
        mensButton.isChecked = false
        womensButton.isChecked = false

        player.league = "Co-ed"
    }

    fun leagueNextClicked(view: View) {

        if(player.league != " ")
        {
            val SkillActivity = Intent(this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(SkillActivity)
        }
        else{
            Toast.makeText(this, " Please select a league", Toast.LENGTH_SHORT ).show()
        }
    }


}
