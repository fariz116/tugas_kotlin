package com.ilhamfidatama.androidwithkotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*
    // flow 1
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnSignIn: Button*/

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // flow 1
        edtUsername = findViewById(R.id.edt_username)
        edtPassword = findViewById(R.id.edt_password)
        tvResult = findViewById(R.id.txt_result)
        btnSignIn = findViewById(R.id.btn_signin)

        btnSignIn.setOnClickListener {
            Toast.makeText(this, "username ${edtUsername.text} dan password anda ${edtPassword.text}", Toast.LENGTH_LONG).show()
            tvResult.text = "username ${edtUsername.text} dan password anda ${edtPassword.text}"
            val username = edtUsername.text
            val intent = Intent(this, HomeActivity::class.java)
        }*/

        // flow 2
        btn_signin.setOnClickListener {
            Toast.makeText(this, "username ${edt_username.text} dan password anda ${edt_password.text}", Toast.LENGTH_LONG).show()
            txt_result.text = "username ${edt_username.text} dan password anda ${edt_password.text}"
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}