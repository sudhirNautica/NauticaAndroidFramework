package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast


object Utils {
    fun Context.printToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun LogE(message: String) {
        Log.e("", message)
    }

    fun LogI(message: String) {
        Log.i("", message)
    }

    fun LogD(message: String) {
        Log.d("", message)
    }

    fun Context.hideKeyboard(view: View) {
        try {
            val inputMethodManager =
                getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}