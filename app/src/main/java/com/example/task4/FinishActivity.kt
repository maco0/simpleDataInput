package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        textViewName.text = intent.extras?.getString("Name","")
        textViewAge.text = intent.extras?.getInt("Age").toString()
        textViewSurname.text = intent.extras?.getString("Surname","")

    }
}