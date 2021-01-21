package com.asustuf.low2048

import android.widget.TextView
import kotlin.math.abs

fun moveBlocks(field: Array<TextView>, coefficient1: Int, coefficient2: Int, range: Int, step: Int) {
    var coefficient3 = abs((coefficient1 - coefficient2) / 2)
    var isBlocksMoved = false

    for (i in 0..range step step) {
        if (field[i + coefficient1].text != "" && field[i + coefficient1].text == field[i + coefficient3].text) {
            field[i + coefficient1].text = (field[i + coefficient1].text.toString().toInt() + field[i + coefficient3].text.toString().toInt()).toString()
            field[i + coefficient3].text = field[i + coefficient2].text
            field[i + coefficient2].text = ""
            isBlocksMoved = true
        }
        else if (field[i + coefficient1].text != "" && field[i + coefficient3].text == "" && field[i + coefficient1].text == field[i + coefficient2].text) {
            field[i + coefficient1].text = (field[i + coefficient1].text.toString().toInt() + field[i + coefficient2].text.toString().toInt()).toString()
            field[i + coefficient2].text = ""
            isBlocksMoved = true
        }
        else if (field[i + coefficient3].text != "" && field[i + coefficient3].text == field[i + coefficient2].text) {
            field[i + coefficient3].text = (field[i + coefficient3].text.toString().toInt() + field[i + coefficient2].text.toString().toInt()).toString()
            field[i + coefficient2].text = ""
            isBlocksMoved = true
        }
        if (field[i + coefficient1].text == "" && field[i + coefficient3].text == "" && field[i + coefficient2].text != "") {
            field[i + coefficient1].text = field[i + coefficient2].text
            field[i + coefficient2].text = ""
            isBlocksMoved = true
        }
        if (field[i + coefficient1].text == "" && field[i + coefficient3].text != "") {
            field[i + coefficient1].text = field[i + coefficient3].text
            field[i + coefficient3].text = ""
            isBlocksMoved = true
        }
        if (field[i + coefficient3].text == "" && field[i + coefficient2].text != "") {
            field[i + coefficient3].text = field[i + coefficient2].text
            field[i + coefficient2].text = ""
            isBlocksMoved = true
        }

    }
    if (isBlocksMoved) {
        Spawn.randomNumberSpawn(field)
        setBlocksColor(field)
    }
}
