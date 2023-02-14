package com.example.happybirthday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button3)
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView2)
            resultTextView.text = "Приветики"
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)
        when (diceRoll) {
            1 -> Toast.makeText(this, "Приветик", Toast.LENGTH_SHORT).show()
            2 -> Toast.makeText(this, "Как дела?", Toast.LENGTH_SHORT).show()
            3 -> Toast.makeText(this, "Хватит нажимать!", Toast.LENGTH_SHORT).show()
            4 -> Toast.makeText(this, "С праздником", Toast.LENGTH_SHORT).show()
            5 -> Toast.makeText(this, "С днем рождения!!!", Toast.LENGTH_SHORT).show()
            6 -> Toast.makeText(this, "Лень придумывать текст", Toast.LENGTH_SHORT).show()
            //val toast = Toast.makeText(this, "А ну руки убрал!", Toast.LENGTH_SHORT).show()
        }
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.photo_2021_12_04_22_22_06)
            2 -> diceImage.setImageResource(R.drawable.photo_2022_04_30_12_22_22)
            3 -> diceImage.setImageResource(R.drawable.photo_2022_05_11_16_04_14)
            4 -> diceImage.setImageResource(R.drawable.photo_2022_06_20_21_15_59)
            5 -> diceImage.setImageResource(R.drawable.photo_2022_06_22_18_07_45)
            6 -> diceImage.setImageResource(R.drawable.photo_2022_06_27_21_13_01)
        }
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}