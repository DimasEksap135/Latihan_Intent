package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val proses = findViewById<Button>(R.id.saveBtn)
        val nama = findViewById<EditText>(R.id.nama)
        val nim = findViewById<EditText>(R.id.nim)
        val nilai = findViewById<EditText>(R.id.nilai)

        //action of button
        saveBtn.setOnClickListener(){

            val Nama=nama.text.toString()
            val Nim=nim.text.toString()
            val Nilai=nilai.text.toString().toInt()

            intent= Intent(this,Main2Activity::class.java)

            intent.putExtra("Nama",Nama)
            intent.putExtra("Nim",Nim)
            intent.putExtra("Nilai",Nilai)
            startActivity(intent)
        }
    }
}
