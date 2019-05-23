package net.kathir.diceapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
       //To set the text on the button
       // rollButton.text = "Let's Roll]"


        // OnClickListener of the button
        rollButton.setOnClickListener {
            //Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()

            //rollDice()

            rollDiceImageView()
        }


    }

    private fun rollDiceImageView() {



        val randomInt = Random().nextInt(6)+1

        val drawableResource =  when(randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
           else -> R.drawable.dice_6


        }

        val diceImage : ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }


    //To generate the random number and insert into the textview

    private fun rollDice() {

        val resultText : TextView = findViewById(R.id.result_text)

        val randomInt = Random().nextInt(6)+1


       // resultText.text = "Dice Rolled"

        resultText.text = randomInt.toString()
    }
}

