package work.sample.core

import android.content.Context
import android.graphics.Color
import androidx.core.content.ContextCompat

fun Context.getColor(idColor: Int) : Int {
    return ContextCompat.getColor(this, idColor)
}