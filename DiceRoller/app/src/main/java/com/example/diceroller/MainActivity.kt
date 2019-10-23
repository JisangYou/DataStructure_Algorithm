package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

/**
 *
 * Android project contains
 *
 * Kotlin files for the core logic of the app
 *
 * a resource folder for static content such as images and strings
 *
 * an android manifest file that defines essential app details so the OS can launch your app
 *
 * Gradle scripts for building and running your app
 *
 */
class MainActivity : AppCompatActivity() {

//    var diceImage: ImageView? = null
    lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll"
        rollButton.setOnClickListener {
            //            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = "Dice Rolled!"
//        resultText.text = randomInt.toString()
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
//        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}














