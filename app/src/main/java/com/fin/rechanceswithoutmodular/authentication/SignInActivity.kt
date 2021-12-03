package com.fin.rechanceswithoutmodular.authentication

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fin.rechanceswithoutmodular.R
import com.fin.rechanceswithoutmodular.activity.MainActivity
import com.fin.rechanceswithoutmodular.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding

    companion object {
        var EMAIL = ""
        var PASSWORD = ""
        var NAME = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInTV.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.signInButton.setOnClickListener {
            val email = binding.emailET.text.toString()
            val password = binding.passwordET.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
            }
            if (email == EMAIL) {
                if (password == PASSWORD) {
                    val progressDialog = ProgressDialog(
                        this,
                        R.style.Theme_MaterialComponents_Light_Dialog
                    )
                    progressDialog.isIndeterminate = true
                    progressDialog.setMessage("Loading...")
                    progressDialog.show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Email is not registered", Toast.LENGTH_SHORT).show()
            }
        }
    }
}