package com.example.xoquiz4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goTo4x4.setOnClickListener{
            val intent = Intent(this, FourByFourActivity::class.java)
            startActivity(intent)
        }

        goTo5x5.setOnClickListener{
            val intent = Intent(this, FiveByFiveActivity::class.java)
            startActivity(intent)
        }

        restartGame.setOnClickListener{
            btn1.setBackgroundResource(android.R.drawable.btn_default)
            btn2.setBackgroundResource(android.R.drawable.btn_default)
            btn3.setBackgroundResource(android.R.drawable.btn_default)
            btn4.setBackgroundResource(android.R.drawable.btn_default)
            btn5.setBackgroundResource(android.R.drawable.btn_default)
            btn6.setBackgroundResource(android.R.drawable.btn_default)
            btn7.setBackgroundResource(android.R.drawable.btn_default)
            btn8.setBackgroundResource(android.R.drawable.btn_default)
            btn9.setBackgroundResource(android.R.drawable.btn_default)


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

            setPlayer = 1
        }
    }

    var Player1 = ArrayList<Int>()
    var Player2 = ArrayList<Int>()
    var ActivePlayer = 1
    var setPlayer = 1

    fun btnClick(view: View)
    {
        val buSelected: Button = view as Button
        var cellId = 0
        when(buSelected.id)
        {
            R.id.btn1 -> cellId = 1
            R.id.btn2 -> cellId = 2
            R.id.btn3 -> cellId = 3

            R.id.btn4 -> cellId = 4
            R.id.btn5 -> cellId = 5
            R.id.btn6 -> cellId = 6

            R.id.btn7 -> cellId = 7
            R.id.btn8 -> cellId = 8
            R.id.btn9 -> cellId = 9
        }
        PlayGame(cellId,buSelected)

    }

    fun CheckWinner()
    {
        var winner = -1

        //row1
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3))
        {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(2) && Player2.contains(3))
        {
            winner = 2
        }

        //row2
        if (Player1.contains(4) && Player1.contains(5) && Player1.contains(6))
        {
            winner = 1
        }
        if (Player2.contains(4) && Player2.contains(5) && Player2.contains(6))
        {
            winner = 2
        }

        //row3
        if (Player1.contains(7) && Player1.contains(8) && Player1.contains(9))
        {
            winner = 1
        }
        if (Player2.contains(7) && Player2.contains(8) && Player2.contains(9))
        {
            winner = 2
        }

        //col1////////////////////////////////////////////////////////////////
        if (Player1.contains(1) && Player1.contains(4) && Player1.contains(7))
        {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(4) && Player2.contains(7))
        {
            winner = 2
        }

        //col2
        if (Player1.contains(2) && Player1.contains(5) && Player1.contains(8))
        {
            winner = 1
        }
        if (Player2.contains(2) && Player2.contains(5) && Player2.contains(8))
        {
            winner = 2
        }

        //col3
        if (Player1.contains(3) && Player1.contains(6) && Player1.contains(9))
        {
            winner = 1
        }
        if (Player2.contains(3) && Player2.contains(6) && Player2.contains(9))
        {
            winner = 2
        }

        //cross1
        if (Player1.contains(1) && Player1.contains(5) && Player1.contains(9))
        {
            winner = 1
        }
        if (Player2.contains(1) && Player2.contains(5) && Player2.contains(9))
        {
            winner = 2
        }

        //cross2
        if (Player1.contains(3) && Player1.contains(5) && Player1.contains(7))
        {
            winner = 1
        }
        if (Player2.contains(3) && Player2.contains(5) && Player2.contains(7))
        {
            winner = 2
        }

        if (winner != -1)
        {
            if (winner == 1) {
                if(setPlayer == 1) {
                    Toast.makeText(this, "Player 1 Wins!!", Toast.LENGTH_SHORT).show()
                    stopTouch()
                }
            } else if(winner == 2){
                Toast.makeText(this, "Player 2 Wins!!", Toast.LENGTH_SHORT).show()
                stopTouch()
            } else {
                Toast.makeText(this, "It's a Tie", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun PlayGame(cellId:Int,buSelected:Button)
    {
        if (ActivePlayer == 1)
        {
            buSelected.setBackgroundResource(R.mipmap.x)
            Player1.add(cellId)
            ActivePlayer = 2
            if (setPlayer == 1)
            {}
            else
            {
                Toast.makeText(this,"Game Over",Toast.LENGTH_SHORT).show()
            }
        }
        else
        {
            buSelected.setBackgroundResource(R.mipmap.o)
            Player2.add(cellId)
            ActivePlayer = 1
        }
        buSelected.isEnabled = false
        CheckWinner()
    }

    fun stopTouch()
    {
        btn1.isEnabled = false
        btn2.isEnabled = false
        btn3.isEnabled = false
        btn4.isEnabled = false
        btn5.isEnabled = false
        btn6.isEnabled = false
        btn7.isEnabled = false
        btn8.isEnabled = false
        btn9.isEnabled = false
    }

}
