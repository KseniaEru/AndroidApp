package ru.belogubaksenia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignInActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)

    }
    fun signin(view: android.view.View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            val intent = Intent(this@SignInActivity,MenuActivity::class.java)
            startActivity(intent)

        }
        else{
            val alerts = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненые поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
}