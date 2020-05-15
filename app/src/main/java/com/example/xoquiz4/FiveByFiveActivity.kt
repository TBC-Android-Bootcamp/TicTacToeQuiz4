package com.example.xoquiz4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_five_by_five.*
import kotlinx.android.synthetic.main.activity_four_by_four.*
import kotlinx.android.synthetic.main.activity_four_by_four.backTo3x3
import kotlinx.android.synthetic.main.activity_four_by_four.btn1
import kotlinx.android.synthetic.main.activity_four_by_four.btn10
import kotlinx.android.synthetic.main.activity_four_by_four.btn11
import kotlinx.android.synthetic.main.activity_four_by_four.btn12
import kotlinx.android.synthetic.main.activity_four_by_four.btn13
import kotlinx.android.synthetic.main.activity_four_by_four.btn14
import kotlinx.android.synthetic.main.activity_four_by_four.btn15
import kotlinx.android.synthetic.main.activity_four_by_four.btn16
import kotlinx.android.synthetic.main.activity_four_by_four.btn2
import kotlinx.android.synthetic.main.activity_four_by_four.btn3
import kotlinx.android.synthetic.main.activity_four_by_four.btn4
import kotlinx.android.synthetic.main.activity_four_by_four.btn5
import kotlinx.android.synthetic.main.activity_four_by_four.btn6
import kotlinx.android.synthetic.main.activity_four_by_four.btn7
import kotlinx.android.synthetic.main.activity_four_by_four.btn8
import kotlinx.android.synthetic.main.activity_four_by_four.btn9
import kotlinx.android.synthetic.main.activity_four_by_four.restartGame
import kotlinx.android.synthetic.main.activity_main.*

class FiveByFiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five_by_five)

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
            btn17.setBackgroundResource(android.R.drawable.btn_default)
            btn18.setBackgroundResource(android.R.drawable.btn_default)
            btn19.setBackgroundResource(android.R.drawable.btn_default)
            btn20.setBackgroundResource(android.R.drawable.btn_default)
            btn21.setBackgroundResource(android.R.drawable.btn_default)
            btn22.setBackgroundResource(android.R.drawable.btn_default)
            btn23.setBackgroundResource(android.R.drawable.btn_default)
            btn24.setBackgroundResource(android.R.drawable.btn_default)
            btn25.setBackgroundResource(android.R.drawable.btn_default)


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
            btn17.isEnabled = true
            btn18.isEnabled = true
            btn19.isEnabled = true
            btn20.isEnabled = true
            btn21.isEnabled = true
            btn22.isEnabled = true
            btn23.isEnabled = true
            btn24.isEnabled = true
            btn25.isEnabled = true

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
            R.id.btn17 -> cellId = 17
            R.id.btn18 -> cellId = 18
            R.id.btn19 -> cellId = 19
            R.id.btn20 -> cellId = 20

            R.id.btn21 -> cellId = 21
            R.id.btn22 -> cellId = 22
            R.id.btn23 -> cellId = 23
            R.id.btn24 -> cellId = 24
            R.id.btn25 -> cellId = 25


        }
        PlayGame(cellId, buSelected)

    }

    fun CheckWinner() {
        var winner = -1

        //row1
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3) && Player1.contains(4) && Player1.contains(5)) {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(2) && Player2.contains(3) && Player2.contains(4) && Player2.contains(5)) {
            winner = 2
        }

        //row2
        if (Player1.contains(6) && Player1.contains(7) && Player1.contains(8) && Player1.contains(9) && Player1.contains(10)) {
            winner = 1
        }
        if (Player2.contains(6) && Player2.contains(7) && Player2.contains(8) && Player2.contains(9) && Player2.contains(10)) {
            winner = 2
        }

        //row3
        if (Player1.contains(11) && Player1.contains(12) && Player1.contains(13) && Player1.contains(14) && Player1.contains(15)) {
            winner = 1
        }
        if (Player2.contains(11) && Player2.contains(12) && Player2.contains(13) && Player2.contains(14) && Player2.contains(15)) {
            winner = 2
        }

        //row4
        if (Player1.contains(16) && Player1.contains(17) && Player1.contains(18) && Player1.contains(19) && Player1.contains(20) ) {
            winner = 1
        }
        if (Player2.contains(16) && Player2.contains(17) && Player2.contains(18) && Player2.contains(19) && Player2.contains(20)) {
            winner = 2
        }

        //row5
        if (Player1.contains(21) && Player1.contains(22) && Player1.contains(23) && Player1.contains(24) && Player1.contains(25)) {
            winner = 1
        }
        if (Player2.contains(21) && Player2.contains(22) && Player2.contains(23) && Player2.contains(24) && Player2.contains(25)) {
            winner = 2
        }

        //col1
        if (Player1.contains(1) && Player1.contains(6) && Player1.contains(11) && Player1.contains(16) && Player1.contains(21) ) {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(6) && Player2.contains(11) && Player2.contains(16) && Player2.contains(21)) {
            winner = 2
        }

        //col2
        if (Player1.contains(2) && Player1.contains(7) && Player1.contains(12) && Player1.contains(17) && Player1.contains(22)) {
            winner = 1
        }
        if (Player2.contains(2) && Player2.contains(7) && Player2.contains(12) && Player2.contains(17) && Player2.contains(22)) {
            winner = 2
        }

        //col3
        if (Player1.contains(3) && Player1.contains(8) && Player1.contains(13) && Player1.contains(18) && Player1.contains(23)) {
            winner = 1
        }
        if (Player2.contains(3) && Player2.contains(8) && Player2.contains(13) && Player2.contains(18) && Player2.contains(23)) {
            winner = 2
        }

        //col4
        if (Player1.contains(4) && Player1.contains(9) && Player1.contains(14) && Player1.contains(19)&& Player1.contains(24)) {
            winner = 1
        }
        if (Player2.contains(4) && Player2.contains(9) && Player2.contains(14) && Player2.contains(19) && Player2.contains(24)) {
            winner = 2
        }

        //col5
        if (Player1.contains(5) && Player1.contains(10) && Player1.contains(15) && Player1.contains(20) && Player1.contains(25)) {
            winner = 1
        }
        if (Player2.contains(5) && Player2.contains(10) && Player2.contains(15) && Player2.contains(20) && Player2.contains(25)) {
            winner = 2
        }

        //cross1
        if (Player1.contains(1) && Player1.contains(7) && Player1.contains(13) && Player1.contains(19) && Player1.contains(25)) {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(7) && Player2.contains(13) && Player2.contains(19) && Player2.contains(25)) {
            winner = 2
        }

        //cross2
        if (Player1.contains(5) && Player1.contains(9) && Player1.contains(13) && Player1.contains(17) && Player1.contains(21)) {
            winner = 1
        }
        if (Player2.contains(5) && Player2.contains(9) && Player2.contains(13) && Player2.contains(17) && Player2.contains(21)) {
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
        btn17.isEnabled = false
        btn18.isEnabled = false
        btn19.isEnabled = false
        btn20.isEnabled = false
        btn21.isEnabled = false
        btn22.isEnabled = false
        btn23.isEnabled = false
        btn24.isEnabled = false
        btn25.isEnabled = false
    }
}
