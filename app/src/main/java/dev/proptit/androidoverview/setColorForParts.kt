package dev.proptit.androidoverview

import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView

fun setTextColorForParts(textView: TextView, fullText: String, text: String, color: Int) {
    val spannableString = SpannableString(fullText)
    val index = spannableString.indexOf(text)
    val span = ForegroundColorSpan(color)
    spannableString.setSpan(span, index, index + text.length, SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE)
    textView.text = spannableString
}