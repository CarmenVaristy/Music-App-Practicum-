package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


        class DetailActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_detail)

                // Link the UI elements from XML to code
                val outputText = findViewById<TextView>(R.id.textOutput)
                val showDetailsButton = findViewById<Button>(R.id.btnShow)
                val averageRatingButton = findViewById<Button>(R.id.btnAverage)
                val backButton = findViewById<Button>(R.id.btnBack)

                // When user clicks "Show Playlist Details"
                showDetailsButton.setOnClickListener {
                    var allSongs = ""

                    // Loop through each song and collect its info
                    for (i in MainActivity.songTitles.indices) {
                        allSongs += "Song ${i + 1}:\n"
                        allSongs += "Title: ${MainActivity.songTitles[i]}\n"
                        allSongs += "Artist: ${MainActivity.artistNames[i]}\n"
                        allSongs += "Rating: ${MainActivity.ratings[i]}\n"
                        allSongs += "Comment: ${MainActivity.comments[i]}\n\n"
                    }

                    // Show the song details
                    outputText.text = allSongs
                }

                // When user clicks "Show Average Rating"
                averageRatingButton.setOnClickListener {
                    // Make sure there are ratings to calculate
                    if (MainActivity.ratings.isEmpty()) {
                        outputText.text = "No ratings to calculate."
                        return@setOnClickListener
                    }

                    // Add up all ratings
                    var totalRating = 0
                    for (rating in MainActivity.ratings) {
                        totalRating += rating
                    }

                    // Calculate average rating
                    val average = totalRating.toDouble() / MainActivity.ratings.size

                    // Show the average rating rounded to 2 decimals
                    outputText.text = "Average Rating: %.2f".format(average)
                }

                // When user clicks "Back to Main Screen"
                backButton.setOnClickListener {
                    finish() // Closes this screen and returns to the main one
                }
            }
        }
//Reference (Harvard Style)
//Google Developers. (n.d.). Building your first Android app. Available at: https://developer.android.com/training/basics/firstapp [Accessed 19 June 2025].
//Android Developers. (n.d.). Activities and Intents. Available at: https://developer.android.com/guide/components/activities/intro-activities [Accessed 19 June 2025].
//Vogella. (n.d.). Android Intents - Tutorial. Available at: https://www.vogella.com/tutorials/AndroidIntent/article.html [Accessed 19 June 2025].
//Kotlin Documentation. (n.d.). Collections overview. Available at: https://kotlinlang.org/docs/collections-overview.html [Accessed 19 June 2025].

