package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent=intent
        val Nama=intent.getStringExtra("Nama")
        val Nim=intent.getStringExtra("Nim")
        val Nilai=intent.getIntExtra("Nilai",0)


        val ket:String

        if (Nilai>=80){
            ket="Keterangan : Nilai Anda ( A ) "
        }
        else if (Nilai>=60){
            ket="Keterangan : Nilai Anda ( B ) "
        }
        else if (Nilai>=40){
            ket="Keterangan : Nilai Anda ( C ) "
        }
        else if (Nilai>=20){
            ket="Keterangan : Nilai Anda ( D ) "
        }
        else {
            ket="Keterangan : Nilai Anda ( E ) "
        }

        val hasil=findViewById<TextView>(R.id.out_nilai)
        hasil.text="Nama : "+Nama+"\nNim : "+Nim+"\nNilai Angka : "+Nilai+"\n"+ket

        val bundle: Bundle? =intent.extras
        val id= bundle?.get("id_value")
        val language=bundle?.get("language_value")

        btn_back.setOnClickListener(){
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
