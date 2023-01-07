package com.tbl.ui_test

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttons = findViewById<Button>(R.id.btn_share)

        var button = findViewById<Button>(R.id.btn_ShowTost)
        var textView = findViewById<TextView>(R.id.tv_ShowTost)

        button.setOnClickListener {

            textView.text = "hello text"
        }



        buttons.setOnClickListener {

            val share = Intent()
            share.action = Intent.ACTION_SEND
            share.type = "application/pdf"
            share.putExtra(Intent.EXTRA_STREAM, "pdfUri")
            startActivity(Intent.createChooser(share, "Share file"))
        }
    }
}


