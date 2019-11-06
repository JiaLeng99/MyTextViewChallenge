package com.example.mytextviewchallenge

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View) {
        val randomInt = Random().nextInt(5) + 1

        val colorResource = when (randomInt) {
            1 -> R.color.blue
            2 -> R.color.green
            3 -> R.color.orange
            4 -> R.color.purple
            else -> R.color.red
        }

        view.setBackgroundColor(colorResource)

    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxText1 = findViewById<TextView>(R.id.textView)
        val boxText2 = findViewById<TextView>(R.id.textView3)
        val boxText3 = findViewById<TextView>(R.id.textView4)
        val boxText4 = findViewById<TextView>(R.id.textView5)
        val boxText5 = findViewById<TextView>(R.id.textView6)
        val boxText6 = findViewById<TextView>(R.id.textView7)
        val boxText7 = findViewById<TextView>(R.id.textView8)
        val boxText8 = findViewById<TextView>(R.id.textView9)
        val boxText9 = findViewById<TextView>(R.id.textView10)
        val boxText10 = findViewById<TextView>(R.id.textView11)
        val boxText11 = findViewById<TextView>(R.id.textView12)
        val boxText12 = findViewById<TextView>(R.id.textView13)
        val boxText13 = findViewById<TextView>(R.id.textView14)
        val boxText14 = findViewById<TextView>(R.id.textView16)
        val boxText15 = findViewById<TextView>(R.id.textView17)
        val boxText16 = findViewById<TextView>(R.id.textView19)
        val boxText17 = findViewById<TextView>(R.id.textView19)
        val boxText18 = findViewById<TextView>(R.id.textView20)
        val boxText19 = findViewById<TextView>(R.id.textView21)
        val boxText20 = findViewById<TextView>(R.id.textView22)
        val boxText21 = findViewById<TextView>(R.id.textView23)
        val boxText22 = findViewById<TextView>(R.id.textView24)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,boxText1, boxText2,boxText3,boxText4,boxText5,boxText6,boxText7,boxText8,boxText9,boxText10,
                boxText11,boxText12,boxText13,boxText14,boxText15,boxText16,boxText17,boxText18,boxText19,boxText20,boxText21,boxText22
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }

        }


    }
}
