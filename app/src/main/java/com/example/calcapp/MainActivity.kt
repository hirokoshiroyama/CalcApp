package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.support.annotation.IntegerRes
import android.support.v4.content.ContextCompat.startActivity
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener(this)
        mul.setOnClickListener(this)
        sub.setOnClickListener(this)
        div.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        if (editText1.text.toString() != "" && editText2.text.toString() != "" && editText1.text.toString() !="." && editText2.text.toString() != ".") {
            var num1 = editText1.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()
            var total = num1 + num2

            if (v.id == R.id.add) {
                total = num1 + num2
            } else if (v.id == R.id.mul) {
                total = num1 - num2
            } else if (v.id == R.id.sub) {
                total = num1 * num2
            } else if (v.id == R.id.div) {
                total = num1 / num2
            }

            intent.putExtra("total", total)
            startActivity(intent)
        }
    }
}