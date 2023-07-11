package com.example.tic_tac_toekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var flag =0
    var count =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun check(view: View){
        val btnCurrent = view as Button
        if(btnCurrent.text == "") {
            count++

            if (flag == 0) {
                btnCurrent.text = "X"
                flag = 1
            } else {
                btnCurrent.text = "O"
                flag = 0
            }

            val b1 = btn1.text.toString()
            val b2 = btn2.text.toString()
            val b3 = btn3.text.toString()
            val b4 = btn4.text.toString()
            val b5 = btn5.text.toString()
            val b6 = btn6.text.toString()
            val b7 = btn7.text.toString()
            val b8 = btn8.text.toString()
            val b9 = btn9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                Toast.makeText(this@MainActivity, "Winner is: $b1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b4 == b5 && b5 == b6 && b6 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b7", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b2", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                Toast.makeText(this@MainActivity, "Winner is $b3", Toast.LENGTH_LONG).show()
                newGame()
            }else if(count==9){
                Toast.makeText(this@MainActivity, "Match is Drawn", Toast.LENGTH_LONG).show()
                newGame()
            }
        }
    }
    fun newGame(){
        btn1.text =""
        btn2.text =""
        btn3.text =""
        btn4.text =""
        btn5.text =""
        btn6.text =""
        btn7.text =""
        btn8.text =""
        btn9.text =""
        flag=0
        count=0
    }
}