package dev.proptit.androidoverview

import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.widget.TextView

fun setTextColorForParts(textView: TextView, text: String, color: Int) {
    val spannableString = SpannableString(textView.text)
    val index = spannableString.indexOf(text)
    val span = ForegroundColorSpan(color)
//    Log.d("setColor", spannableString.toString())
//    Log.d("setColor", text.toString())
//    Log.d("setColor",index.toString())
    spannableString.setSpan(span, index, index + text.length, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)
    textView.text = spannableString
}