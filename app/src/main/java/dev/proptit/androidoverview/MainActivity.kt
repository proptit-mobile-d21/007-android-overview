package dev.proptit.androidoverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import dev.proptit.androidoverview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val color = resources.getColor(R.color.dark_green)
        setTextColorForParts(binding.tvHeading , getString(R.string.highlight_heading_1), color)
        setTextColorForParts(binding.tvHeading , getString(R.string.highlight_heading_2), color)
        setTextColorForParts(binding.tvSignin , getString(R.string.highlight_signin), color)
    }
}