package com.example.clasemobiledev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this,intent.getStringExtra("name"),Toast.LENGTH_SHORT).show()
    }

    fun regresar(view: View?) {
        finish()
    }

}