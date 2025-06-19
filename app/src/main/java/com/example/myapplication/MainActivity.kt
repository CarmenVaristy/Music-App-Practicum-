package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


        class MainActivity : AppCompatActivity() {
            // Parallel arrays
            companion object {
                val songTitles = arrayListOf<String>()
                val artistNames = arrayListOf<String>()
                val ratings = arrayListOf<Int>()
                val comments = arrayListOf<String>()
            }

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val title = findViewById<EditText>(R.id.editTitle)
                val artist = findViewById<EditText>(R.id.editArtist)
                val rating = findViewById<EditText>(R.id.editRating)
                val comment = findViewById<EditText>(R.id.editComment)

                val btnAdd = findViewById<Button>(R.id.btnAdd)
                val btnView = findViewById<Button>(R.id.btnView)
                val btnExit = findViewById<Button>(R.id.btnExit)

                btnAdd.setOnClickListener {
                    val titleText = title.text.toString()
                    val artistText = artist.text.toString()
                    val ratingText = rating.text.toString()
                    val commentText = comment.text.toString()

                    // Error handling
                    if (titleText.isEmpty() || artistText.isEmpty() || ratingText.isEmpty() || commentText.isEmpty()) {
                        Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    val ratingValue = ratingText.toIntOrNull()
                    if (ratingValue == null || ratingValue !in 1..5) {
                        Toast.makeText(this, "Rating must be between 1 and 5", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    if (songTitles.size >= 4) {
                        Toast.makeText(this, "Playlist can only hold 4 songs", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    songTitles.add(titleText)
                    artistNames.add(artistText)
                    ratings.add(ratingValue)
                    comments.add(commentText)

                    Toast.makeText(this, "Song added!", Toast.LENGTH_SHORT).show()

                    title.text.clear()
                    artist.text.clear()
                    rating.text.clear()
                    comment.text.clear()
                }

                btnView.setOnClickListener {
                    startActivity(Intent(this, DetailActivity::class.java))
                }

                btnExit.setOnClickListener {
                    finish()
                }
            }
        }




