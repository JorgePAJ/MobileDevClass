package com.example.clasemobiledev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.on_resume)
//        Log.d("MainActivity", "debug")
//        Log.i("MainActivity", "info")
//        Log.w("MainActivity", "warning")
//        Log.e("MainActivity", "error")
//        Log.wtf("MainActivity", "what a terrible failure")
//
//        Explicito
//        var textito : TextView = findViewById<TextView>(R.id.nameInput)

//        Implicito
//        val editText = findViewById<EditText>(R.id.nameInput)

//        por su modificabilidad las variables pueden ser mutables o inmutables

//        val buttonTest = findViewById<Button>(R.id.button3)
//
//        buttonTest.setOnClickListener {
//            (it as Button).text = "Hola"
//            Toast.makeText(this, "Enviado desde code", Toast.LENGTH_SHORT).show()
//        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")
    }

    fun mostrarMensajes(view: View?){
        val editText = findViewById<EditText>(R.id.nameInput)
        Toast.makeText(this,editText.text.toString(), Toast.LENGTH_LONG).show()
    }

    fun cambiarTexto(view: View?){
        val editText = findViewById<EditText>(R.id.nameInput)
        (view as Button).text = "Adios mundo >:("
        editText.setText("Hola mundo")
    }

    fun cambiarActivity(view: View?){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}

