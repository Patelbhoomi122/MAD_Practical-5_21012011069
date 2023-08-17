package com.example.mad_practical_5_21012011069

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.Browser
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton = findViewById<Button>(R.id.browse_btn)
        val editText: EditText = findViewById(R.id.editTextUrl)
        browseButton.setOnClickListener {
            openBrowser(editText.text.toString())
        }
        val callButton = findViewById<Button>(R.id.call_btn)
        val editPhone: EditText = findViewById(R.id.editTextPhone)
        callButton.setOnClickListener {
            call(editPhone.text.toString())
        }
        val callLogButton: Button = findViewById(R.id.callLog_btn)
        callLogButton.setOnClickListener {
            callLog()
        }
        val galleryButton: Button = findViewById(R.id.gallery_btn)
        galleryButton.setOnClickListener {
            gallery()
        }
        val cameraButton: Button = findViewById(R.id.camera_btn)
        cameraButton.setOnClickListener {
            camera()
        }
        val alarmButton:Button = findViewById(R.id.alarm_btn)
        alarmButton.setOnClickListener {
            alarm()
        }

    }

    fun openBrowser(url: String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }

    fun call(number: String) {
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }
    }

    fun callLog() {
        Intent(Intent.ACTION_VIEW, Uri.parse("CallLog.Calls.CONTENT_TYPE")).also{ startActivity(it) }
    }

    fun gallery() {
        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) }
    }

    fun camera() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }
    }

    fun alarm() {
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also{startActivity(it)}

    }
}