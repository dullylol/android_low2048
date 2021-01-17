package com.asustuf.low2048

import android.widget.TextView

fun setBlocksColor(field: Array<TextView>) {
    for (i in field.size - 1 downTo 0) {
        if (field[i].text == "") {
            field[i].setBackgroundResource(R.color.colorOfNumber0)
        }
        else if (field[i].text == "2") {
            field[i].setBackgroundResource(R.color.colorOfNumber2)
        }
        else if (field[i].text == "4") {
            field[i].setBackgroundResource(R.color.colorOfNumber4)
        }
        else if (field[i].text == "8") {
            field[i].setBackgroundResource(R.color.colorOfNumber8)
        }
        else if (field[i].text == "16") {
            field[i].setBackgroundResource(R.color.colorOfNumber16)
        }
        else if (field[i].text == "32") {
            field[i].setBackgroundResource(R.color.colorOfNumber32)
        }
        else if (field[i].text == "64") {
            field[i].setBackgroundResource(R.color.colorOfNumber64)
        }
        else if (field[i].text == "128") {
            field[i].setBackgroundResource(R.color.colorOfNumber128)
        }
        else if (field[i].text == "256") {
            field[i].setBackgroundResource(R.color.colorOfNumber256)
        }
        else if (field[i].text == "512") {
            field[i].setBackgroundResource(R.color.colorOfNumber512)
        }
        else if (field[i].text == "1024") {
            field[i].setBackgroundResource(R.color.colorOfNumber1024)
        }
        else {
            field[i].setBackgroundResource(R.color.colorOfNumber2048)
        }

    }
}