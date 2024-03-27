package com.damaris.ecommerce_vyza.data.auth

import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

private lateinit var auth: FirebaseAuth
class RegisterAuth(val email:String, val password:String){

    init {
        auth = Firebase.auth
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.i("xd", "createUserWithEmail:success")
                    val user = auth.currentUser
                }else{
                    Log.i("xd", "createUserWithEmail:NOsuccess")
                }
            }
    }
}