package com.example.task4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNextSecond.setOnClickListener{

            val name:String = editTextTextPersonName.text.trim().toString()
              if(name.isEmpty()){
                  Toast.makeText(this, "Empty Name!", Toast.LENGTH_SHORT).show()
                  return@setOnClickListener
              }
            val intent:Intent = Intent(this,ThirdActivity::class.java)
            intent.putExtra("Name",name)
            finish()
            startActivity(intent)

        }



    }
}