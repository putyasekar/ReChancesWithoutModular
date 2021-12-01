package com.putya.rechanceswithoutmodular.authentication

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spanned
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.HtmlCompat
import com.putya.rechanceswithoutmodular.R
import com.putya.rechanceswithoutmodular.activity.HomeActivity
import com.putya.rechanceswithoutmodular.activity.MainActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

//        sign_in_button.setOnClickListener {
//            val email = inputEmail.text.toString()
//            val password = inputPassword.text.toString()
//            if (email.isEmpty()|| password.isEmpty()) {
//                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
//                return@setOnClickListener
//            }
//            if(email == "admin01@gmail.com" || password == "admin01"){
//                val progressDialog = ProgressDialog(this,
//                    R.style.Theme_MaterialComponents_Light_Dialog)
//                progressDialog.isIndeterminate = true
//                progressDialog.setMessage("Loading...")
//                progressDialog.show()
//                val intent = Intent (this,Dashboard::class.java)
//                startActivity(intent)
//                finish()
//            }
//        }

    }
}