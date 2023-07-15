package dev.proptit.androidoverview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannedString
import android.text.style.ForegroundColorSpan
import dev.proptit.androidoverview.databinding.ActivityMainBinding
import java.util.zip.Inflater
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val spannedString = SpannableString("Let's Enjoy Your Dream Vacation")
        val index1 = spannedString.indexOf("Enjoy")
        val index2 = spannedString.indexOf("Dream")

        // Set the text color of the word
        val color = resources.getColor(R.color.dark_green)
        val span1 = ForegroundColorSpan(color)
        val span2 = ForegroundColorSpan(color)
        spannedString.setSpan(span1, index1, index1 + 5, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannedString.setSpan(span2, index2, index2 + 14, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Set the text of the TextView to the SpannableString
        binding.tvHeading.text = spannedString


        val spannedString2 = SpannableString(binding.tvSignin.text)
        val index3 = spannedString2.indexOf("Sign")
        val span3 = ForegroundColorSpan(color)
        spannedString2.setSpan(span3, index3, index3 + 7, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvSignin.setText(spannedString2)
        //setTextColorForParts(binding.tvSignin, binding.tvSignin.text.toString(), "Sign in", color)
    }
}