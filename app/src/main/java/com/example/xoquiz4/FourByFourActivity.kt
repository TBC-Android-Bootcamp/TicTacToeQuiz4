package com.example.xoquiz4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_four_by_four.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn1
import kotlinx.android.synthetic.main.activity_main.btn2
import kotlinx.android.synthetic.main.activity_main.btn3
import kotlinx.android.synthetic.main.activity_main.btn4
import kotlinx.android.synthetic.main.activity_main.btn5
import kotlinx.android.synthetic.main.activity_main.btn6
import kotlinx.android.synthetic.main.activity_main.btn7
import kotlinx.android.synthetic.main.activity_main.btn8
import kotlinx.android.synthetic.main.activity_main.btn9
import kotlinx.android.synthetic.main.activity_main.restartGame

class FourByFourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_by_four)

        backTo3x3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        restartGame.setOnClickListener {
            btn1.setBackgroundResource(android.R.drawable.btn_default)
            btn2.setBackgroundResource(android.R.drawable.btn_default)
            btn3.setBackgroundResource(android.R.drawable.btn_default)
            btn4.setBackgroundResource(android.R.drawable.btn_default)
            btn5.setBackgroundResource(android.R.drawable.btn_default)
            btn6.setBackgroundResource(android.R.drawable.btn_default)
            btn7.setBackgroundResource(android.R.drawable.btn_default)
            btn8.setBackgroundResource(android.R.drawable.btn_default)
            btn9.setBackgroundResource(android.R.drawable.btn_default)
            btn10.setBackgroundResource(android.R.drawable.btn_default)
            btn11.setBackgroundResource(android.R.drawable.btn_default)
            btn12.setBackgroundResource(android.R.drawable.btn_default)
            btn13.setBackgroundResource(android.R.drawable.btn_default)
            btn14.setBackgroundResource(android.R.drawable.btn_default)
            btn15.setBackgroundResource(android.R.drawable.btn_default)
            btn16.setBackgroundResource(android.R.drawable.btn_default)


            Player1.clear()
            Player2.clear()
            ActivePlayer = 1
            btn1.isEnabled = true
            btn2.isEnabled = true
            btn3.isEnabled = true
            btn4.isEnabled = true
            btn5.isEnabled = true
            btn6.isEnabled = true
            btn7.isEnabled = true
            btn8.isEnabled = true
            btn9.isEnabled = true
            btn10.isEnabled = true
            btn11.isEnabled = true
            btn12.isEnabled = true
            btn13.isEnabled = true
            btn14.isEnabled = true
            btn15.isEnabled = true
            btn16.isEnabled = true

            setPlayer = 1
        }
    }

    var Player1 = ArrayList<Int>()
    var Player2 = ArrayList<Int>()
    var ActivePlayer = 1
    var setPlayer = 1

    fun btnClick(view: View) {
        val buSelected: Button = view as Button
        var cellId = 0
        when (buSelected.id) {
            R.id.btn1 -> cellId = 1
            R.id.btn2 -> cellId = 2
            R.id.btn3 -> cellId = 3
            R.id.btn4 -> cellId = 4

            R.id.btn5 -> cellId = 5
            R.id.btn6 -> cellId = 6
            R.id.btn7 -> cellId = 7
            R.id.btn8 -> cellId = 8

            R.id.btn9 -> cellId = 9
            R.id.btn10 -> cellId = 10
            R.id.btn11 -> cellId = 11
            R.id.btn12 -> cellId = 12

            R.id.btn13 -> cellId = 13
            R.id.btn14 -> cellId = 14
            R.id.btn15 -> cellId = 15
            R.id.btn16 -> cellId = 16
        }
        PlayGame(cellId, buSelected)

    }

    fun CheckWinner() {
        var winner = -1

        //row1
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3) && Player1.contains(4)) {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(2) && Player2.contains(3) && Player2.contains(4)) {
            winner = 2
        }

        //row2
        if (Player1.contains(5) && Player1.contains(6) && Player1.contains(7) && Player1.contains(8)) {
            winner = 1
        }
        if (Player2.contains(5) && Player2.contains(6) && Player2.contains(7) && Player2.contains(8)) {
            winner = 2
        }

        //row3
        if (Player1.contains(9) && Player1.contains(10) && Player1.contains(11) && Player1.contains(12)) {
            winner = 1
        }
        if (Player2.contains(9) && Player2.contains(10) && Player2.contains(11) && Player2.contains(12)) {
            winner = 2
        }

        //row4
        if (Player1.contains(13) && Player1.contains(14) && Player1.contains(15) && Player1.contains(16)) {
            winner = 1
        }
        if (Player2.contains(13) && Player2.contains(14) && Player2.contains(15) && Player2.contains(16)) {
            winner = 2
        }

        //col1
        if (Player1.contains(1) && Player1.contains(5) && Player1.contains(9) && Player1.contains(13) ) {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(5) && Player2.contains(9) && Player2.contains(13)) {
            winner = 2
        }

        //col2
        if (Player1.contains(2) && Player1.contains(6) && Player1.contains(10) && Player1.contains(14)) {
            winner = 1
        }
        if (Player2.contains(2) && Player2.contains(6) && Player2.contains(10) && Player2.contains(14)) {
            winner = 2
        }

        //col3
        if (Player1.contains(3) && Player1.contains(7) && Player1.contains(11) && Player1.contains(15)) {
            winner = 1
        }
        if (Player2.contains(3) && Player2.contains(7) && Player2.contains(11) && Player2.contains(15)) {
            winner = 2
        }

        //col4
        if (Player1.contains(4) && Player1.contains(8) && Player1.contains(12) && Player1.contains(16)) {
            winner = 1
        }
        if (Player2.contains(4) && Player2.contains(8) && Player2.contains(12) && Player2.contains(16)) {
            winner = 2
        }

        //cross1
        if (Player1.contains(1) && Player1.contains(6) && Player1.contains(11) && Player1.contains(16)) {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(6) && Player2.contains(11) && Player2.contains(16)) {
            winner = 2
        }

        //cross2
        if (Player1.contains(4) && Player1.contains(7) && Player1.contains(10) && Player1.contains(13)) {
            winner = 1
        }
        if (Player2.contains(4) && Player2.contains(7) && Player2.contains(10) && Player2.contains(13)) {
            winner = 2
        }

        if (winner != -1) {
            if (winner == 1) {
                if (setPlayer == 1) {
                    Toast.makeText(this, "Player 1 Wins!!", Toast.LENGTH_SHORT).show()
                    stopTouch()
                }
            } else if (winner == 2) {
                Toast.makeText(this, "Player 2 Wins!!", Toast.LENGTH_SHORT).show()
                stopTouch()
            }
        }
    }

    fun PlayGame(cellId: Int, buSelected: Button) {
        if (ActivePlayer == 1) {
            buSelected.setBackgroundResource(R.mipmap.x)
            Player1.add(cellId)
            ActivePlayer = 2
            if (setPlayer == 1) {
            } else {
                Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show()
            }
        } else {
            buSelected.setBackgroundResource(R.mipmap.o)
            Player2.add(cellId)
            ActivePlayer = 1
        }
        buSelected.isEnabled = false
        CheckWinner()
    }

    fun stopTouch() {
        btn1.isEnabled = false
        btn2.isEnabled = false
        btn3.isEnabled = false
        btn4.isEnabled = false
        btn5.isEnabled = false
        btn6.isEnabled = false
        btn7.isEnabled = false
        btn8.isEnabled = false
        btn9.isEnabled = false
        btn10.isEnabled = false
        btn11.isEnabled = false
        btn12.isEnabled = false
        btn13.isEnabled = false
        btn14.isEnabled = false
        btn15.isEnabled = false
        btn16.isEnabled = false
    }
}
