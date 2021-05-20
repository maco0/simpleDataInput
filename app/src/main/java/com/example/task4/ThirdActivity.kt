package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.buttonNextSecond
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val name = intent.extras?.getString("Name","")
        buttonNextThird.setOnClickListener{

            val Surname:String = editTextPersonSurname.text.trim().toString()
            if(Surname.isEmpty()){
                Toast.makeText(this, "Empty SurName!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent: Intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("Surname",Surname)
            intent.putExtra("Name",name)
            finish()
            startActivity(intent)

        }
    }
}