package com.onovughe.weeklyassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.danghoski.weeklyaccessment4.R
import com.danghoski.weeklyaccessment4.Services

class Login : AppCompatActivity() {

    val validNameLogin: String = "Aghogho"
    val validPassLogin: String = "aghogho"

    private lateinit var loginName: EditText
    private lateinit var loginPass: EditText
    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginName = findViewById(R.id.loginName)
        loginPass = findViewById(R.id.loginPass)
        loginBtn = findViewById(R.id.signBtn)

        loginBtn.setOnClickListener{
            val login1 = loginName.text.toString()
            val login2 = loginPass.text.toString()

            login(login1, login2)
        }
    }

    fun login(login1: String, login2: String){
        if(isLoginDetails(login1, login2)){
            val intent: Intent = Intent(this, Services:: class.java )
        }else{
            Toast.makeText(applicationContext, "Invalid Name or Password", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isLoginDetails(login1: String, login2: String):Boolean{
        if (login1 == validNameLogin && login2 == validPassLogin) return true
        return false
    }
}