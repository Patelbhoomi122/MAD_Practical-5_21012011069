package com.example.mad_practical_5_21012011069

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Browser

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun openBrowser(string: String){
        Intent(Intent.ACTION_VIEW, Uri.parse(string)).also { startActivity(it) }

    }
    fun call(number: String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also{startActivity(it)}

    }
    fun calllog(){

    }
    fun gallery(){

    }
    fun camera(){

    }
    fun alarm(){

    }



}