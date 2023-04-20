package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var userName: EditText
    lateinit var password: EditText
    lateinit var saveBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userName = findViewById(R.id.editTextTextPersonName)
        password = findViewById(R.id.editTextTextPassword)
        saveBtn = findViewById(R.id.button)

        //click
        saveBtn.setOnClickListener {
            login(userName.text.toString(), password.text.toString())
        }

    }

    private fun login(useName: String, pass: String) {
        if (useName != "" && pass != "") {
            if (useName == "raj" && pass == "raj") {
                Toast.makeText(applicationContext, "Success", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Fail", Toast.LENGTH_LONG).show()
            }

        } else {
            Toast.makeText(
                applicationContext,
                "Please enter the username and password",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}