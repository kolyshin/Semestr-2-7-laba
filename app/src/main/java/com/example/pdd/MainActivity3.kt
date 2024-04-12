package com.example.pdd

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val visib: TextView = findViewById(R.id.textView6)
        visib.visibility = View.GONE

    }

    fun click2(view: View) {
        val ConstraintLayout: Button = findViewById(R.id.button7)
        ConstraintLayout.setBackgroundColor(resources.getColor(R.color.red))
        val visib: TextView = findViewById(R.id.textView6)
        visib.visibility = View.VISIBLE
        ConstraintLayout.setTextColor(Color.WHITE)

    }
    fun click3(view: View) {
        val ConstraintLayout: Button = findViewById(R.id.button8)
        ConstraintLayout.setBackgroundColor(resources.getColor(R.color.red))
        val visib: TextView = findViewById(R.id.textView6)
        visib.visibility = View.VISIBLE
        ConstraintLayout.setTextColor(Color.WHITE)
    }
    fun click4(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
    fun click5(view: View) {
        val ConstraintLayout: Button = findViewById(R.id.button10)
        ConstraintLayout.setBackgroundColor(resources.getColor(R.color.red))
        val visib: TextView = findViewById(R.id.textView6)
        visib.visibility = View.VISIBLE
        ConstraintLayout.setTextColor(Color.WHITE)
    }
}