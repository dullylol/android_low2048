package com.asustuf.low2048

import android.widget.TextView

class Spawn {
    companion object {
        fun randomNumberSpawn(field: Array<TextView>) {
            var countEmptyBlocks = 0

            for (i in field.size-1 downTo 0) {
                if (field[i].text == "") {
                    countEmptyBlocks++
                }
            }

            if (countEmptyBlocks > 0) {
                while (true) {
                    for (i in field.size-1 downTo 0) {
                        if (field[i].text == "" && (1..countEmptyBlocks).random() == 1) {
                            field[i].text = "2"
                            return
                        }
                    }
                }
            }
        }

        fun restart(field: Array<TextView>) {
            for (i in 0..8) {
                field[i].text = ""
            }
            randomNumberSpawn(field)
        }
    }
}
