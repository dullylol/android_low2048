package com.asustuf.low2048

import android.widget.TextView

fun setBlocksColor(field: Array<TextView>) {
    for (i in field.size - 1 downTo 0) {
        when (field[i].text) {
            "" -> field[i].setBackgroundResource(R.color.colorOfNumber0)
            "2" -> field[i].setBackgroundResource(R.color.colorOfNumber2)
            "4" -> field[i].setBackgroundResource(R.color.colorOfNumber4)
            "8" -> field[i].setBackgroundResource(R.color.colorOfNumber8)
            "16" -> field[i].setBackgroundResource(R.color.colorOfNumber16)
            "32" -> field[i].setBackgroundResource(R.color.colorOfNumber32)
            "64" -> field[i].setBackgroundResource(R.color.colorOfNumber64)
            "128" -> field[i].setBackgroundResource(R.color.colorOfNumber128)
            "256" -> field[i].setBackgroundResource(R.color.colorOfNumber256)
            "512" -> field[i].setBackgroundResource(R.color.colorOfNumber512)
            "1024" -> field[i].setBackgroundResource(R.color.colorOfNumber1024)
            else -> field[i].setBackgroundResource(R.color.colorOfNumber2048)
        }
    }
}
