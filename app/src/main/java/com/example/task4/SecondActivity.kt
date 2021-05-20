package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.extras?.getString("Name","")
        val surname = intent.extras?.getString("Surname","")
        finishbutton.setOnClickListener { 
            val ageText :String = editTextAge.text.trim().toString()
           if(ageText.isEmpty()) {
               Toast.makeText(this, "Empty!", Toast.LENGTH_SHORT).show()
               return@setOnClickListener
           }

            var age: Int = ageText.toInt()
            val intent=Intent(this, FinishActivity::class.java)
            intent.putExtra("Surname",surname)
            intent.putExtra("Name",name)
            intent.putExtra("Age",age)
            finish()
            startActivity(intent)

        }
    }
}