package com.lleans.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPindah: Button=findViewById(R.id.btn_pindah_activity)
        val btnPindahData: Button=findViewById(R.id.btn_pindah_activity_data)
        val dial: Button=findViewById(R.id.btn_dial_number)

        btnPindah.setOnClickListener(this)
        btnPindahData.setOnClickListener(this)
        dial.setOnClickListener(this)
    }
    override fun onClick(v: View){
        when (v.id){
            R.id.btn_pindah_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                    startActivity(moveIntent)
            }
            R.id.btn_pindah_activity_data -> {
                val MoveData = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                MoveData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Ahmadun Na'il")
                MoveData.putExtra(MoveWithDataActivity.EXTRA_AGE, 16)
                startActivity(MoveData)
            }
            R.id.btn_dial_number -> {
                val Number = "08210841823"
                val dialPhoneIntent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:$Number"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}