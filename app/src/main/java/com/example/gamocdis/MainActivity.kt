package com.example.gamocdis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var checkBox1 : CheckBox
    private lateinit var checkBox2 : CheckBox
    private lateinit var vaqcina : EditText
    private lateinit var gilaki : Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        vaqcina = findViewById(R.id.vaqcina)
        gilaki = findViewById(R.id.gilaki)


    gilaki.setOnClickListener {

        val pasuxi = checkBox1
        val pasuxi2 = checkBox2
        val vaqckitxv = vaqcina.text.toString()


        if (pasuxi.isChecked and vaqckitxv.isEmpty()) {
            vaqcina.error = "შეიყვანეთ ვაქცინის დასახელება"
            return@setOnClickListener
        }else if (pasuxi.isChecked and pasuxi2.isChecked){
            checkBox1.error = "მონიშნეთ ერთი"
            return@setOnClickListener
        } else if (pasuxi2.isChecked and vaqckitxv.isNotEmpty()){
            Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this, "წარმატებით გაიარეთ გამოკითხვა, ", Toast.LENGTH_SHORT).show()
        }

    }



    }



}