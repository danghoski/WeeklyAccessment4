package com.onovughe.weeklyassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.danghoski.weeklyaccessment4.R

class MainActivity : AppCompatActivity() {
    val validName: String = "Akpor"
    val validUser: String = "Akpor26"
    val validEmail: String = "Akpor@gmail.com"
    val validPass: String = "12345"

    private lateinit var signName: EditText
    private lateinit var signUser: EditText
    private lateinit var signEmail: EditText
    private lateinit var signPass: EditText
    private lateinit var signBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signName = findViewById(R.id.signName)
        signUser = findViewById(R.id.signUser)
        signEmail = findViewById(R.id.signEmail)
        signPass = findViewById(R.id.loginPass)
        signBtn = findViewById(R.id.signBtn)

        signBtn.setOnClickListener{
            val sign1 = signName.text.toString()
            val  sign2 = signUser.text.toString()
            val sign3 = signEmail.text.toString()
            val sign4 = signPass.text.toString()

            signin(sign1, sign2, sign3, sign4)
        }
    }

    fun signin(sign1: String, sign2: String, sign3: String, sign4: String) {
        if (isValidDetails(sign1, sign2, sign3, sign4)) {
            val intent: Intent = Intent(this, Login::class.java)
        } else {
            Toast.makeText(applicationContext, "Invalid Inputs", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidDetails(
        sign1: String,
        sign2: String,
        sign3: String,
        sign4: String
    ): Boolean {
        if (sign1 == validName && sign2 == validUser && sign3 == validEmail && sign4 == validPass) return true
        return false
    }
}