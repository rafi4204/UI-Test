package com.example.ui_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_bill__payment.*

class Bill_Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill__payment)

       val str1:String="One-Time Password Type:<font color=#fc2b43>*</font>"
        val str2:String="Transfer:<font color=#fc2b43>*</font>"
        password.text= HtmlCompat.fromHtml(str1, HtmlCompat.FROM_HTML_MODE_LEGACY)
        transfer.text=HtmlCompat.fromHtml(str2,HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}
