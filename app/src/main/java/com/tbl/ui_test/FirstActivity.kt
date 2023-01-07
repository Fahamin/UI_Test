package com.tbl.ui_test

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var btn_Submit = findViewById<Button>(R.id.submitButton)
        var title = findViewById<TextView>(R.id.tv_title)
        var decription = findViewById<TextView>(R.id.tv_decsription)

        btn_Submit.setOnClickListener {
            var mes = "Title ${title.text} | Desc ${decription.text}"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key", mes)
            startActivity(intent)

        }
    }
}