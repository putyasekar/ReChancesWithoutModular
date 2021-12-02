package com.fin.rechanceswithoutmodular.authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fin.rechanceswithoutmodular.R

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