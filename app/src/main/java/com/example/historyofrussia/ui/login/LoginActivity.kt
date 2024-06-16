package com.example.historyofrussia.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.historyofrussia.MainActivity
import com.example.historyofrussia.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginBottomNav(view: View){
        val loginIntent = Intent(this, MainActivity::class.java)
        startActivity(loginIntent)
    }
}