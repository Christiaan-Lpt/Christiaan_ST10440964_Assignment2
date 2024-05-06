package com.example.assignment2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TamagotchiAppActivity : AppCompatActivity() {
    private var hunger = 0
    private var happiness = 0
    private var dirtiness = 0

    @SuppressLint("MissingInflateId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tamagotchi_activity)

        // Set the buttons and text views
        val feedButton = findViewById<Button>(R.id.FeedButton)
        val cleanButton = findViewById<Button>(R.id.CleanButton)
        val petButton = findViewById<Button>(R.id.PetButton)
        val hungerNumber = findViewById<EditText>(R.id.HungerNumber)
        val dirtinessNumber = findViewById<EditText>(R.id.DirtinessNumber)
        val happinessNumber = findViewById<EditText>(R.id.HappinessNumber)
        val petImage = findViewById<ImageView>(R.id.WaitingDog)

        // Set the initial text values
        hungerNumber.setText(hunger.toString())
        happinessNumber.setText(happiness.toString())
        dirtinessNumber.setText(dirtiness.toString())

        // Handle button clicks
        feedButton.setOnClickListener{
            hunger -= 10
            happiness += 5
            dirtiness += 10

            hungerNumber.setText(hunger.toString())
            petImage.setImageResource(R.drawable.eating_dog_imadass2_)
        }

        cleanButton.setOnClickListener {
            dirtiness -= 10
            happiness += 5
            hunger += 10

            dirtinessNumber.setText(dirtiness.toString())
            petImage.setImageResource(R.drawable.bathing_dog_imadass2_)
        }

        petButton.setOnClickListener {
            dirtiness += 10
            happiness += 10
            hunger += 10

            happinessNumber.setText(happiness.toString())
            petImage.setImageResource(R.drawable.happy_dog_imadass2_)



        }


    }

}
