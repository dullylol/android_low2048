package com.asustuf.low2048

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var field: Array<TextView>
    private lateinit var moveUp: ImageButton
    private lateinit var moveDown: ImageButton
    private lateinit var moveRight: ImageButton
    private lateinit var moveLeft: ImageButton
    private lateinit var restart: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        field = emptyArray()
        field += findViewById<TextView>(R.id.textView1)
        field += findViewById<TextView>(R.id.textView2)
        field += findViewById<TextView>(R.id.textView3)
        field += findViewById<TextView>(R.id.textView4)
        field += findViewById<TextView>(R.id.textView5)
        field += findViewById<TextView>(R.id.textView6)
        field += findViewById<TextView>(R.id.textView7)
        field += findViewById<TextView>(R.id.textView8)
        field += findViewById<TextView>(R.id.textView9)

        moveUp = findViewById<ImageButton>(R.id.moveUp)
        moveDown = findViewById<ImageButton>(R.id.moveDown)
        moveRight = findViewById<ImageButton>(R.id.moveRight)
        moveLeft = findViewById<ImageButton>(R.id.moveLeft)
        restart = findViewById<ImageButton>(R.id.restartButton)

        Spawn.randomNumberSpawn(field)
        setBlocksColor(field)
    }

    fun onClickMoveLeft(view: View) {
        var isBlocksMoved = false
        for (i in 0..8 step 3) {
            if (field[i].text != "" && field[i].text == field[i+1].text) {
                field[i].text = (field[i].text.toString().toInt() + field[i+1].text.toString().toInt()).toString()
                field[i+1].text = field[i+2].text
                field[i+2].text = ""
                isBlocksMoved = true
            }
            else if (field[i].text != "" && field[i+1].text == "" && field[i].text == field[i+2].text) {
                field[i].text = (field[i].text.toString().toInt() + field[i+2].text.toString().toInt()).toString()
                field[i+2].text = ""
                isBlocksMoved = true
            }
            else if (field[i+1].text != "" && field[i+1].text == field[i+2].text) {
                field[i+1].text = (field[i+1].text.toString().toInt() + field[i+2].text.toString().toInt()).toString()
                field[i+2].text = ""
                isBlocksMoved = true
            }
            if (field[i+1].text == "" && field[i+2].text != "") {
                field[i+1].text = field[i+2].text
                field[i+2].text = ""
                isBlocksMoved = true
            }
            if (field[i].text == "" && field[i+1].text != "") {
                field[i].text = field[i+1].text
                field[i+1].text = ""
                isBlocksMoved = true
            }
        }
        if (isBlocksMoved) {
            Spawn.randomNumberSpawn(field)
            setBlocksColor(field)
        }
    }

    fun onClickMoveRight(view: View) {
        var isBlocksMoved = false
        for (i in 0..8 step 3) {
            if (field[i+2].text != "" && field[i+2].text == field[i+1].text) {
                field[i+2].text = (field[i+2].text.toString().toInt() + field[i+1].text.toString().toInt()).toString()
                field[i+1].text = field[i].text
                field[i].text = ""
                isBlocksMoved = true
            }
            else if (field[i+2].text != "" && field[i+1].text == "" && field[i+2].text == field[i].text) {
                field[i+2].text = (field[i+2].text.toString().toInt() + field[i].text.toString().toInt()).toString()
                field[i].text = ""
                isBlocksMoved = true
            }
            else if (field[i+1].text != "" && field[i+1].text == field[i].text) {
                field[i+1].text = (field[i+1].text.toString().toInt() + field[i].text.toString().toInt()).toString()
                field[i].text = ""
                isBlocksMoved = true
            }
            if (field[i+1].text == "" && field[i].text != "") {
                field[i+1].text = field[i].text
                field[i].text = ""
                isBlocksMoved = true
            }
            if (field[i+2].text == "" && field[i+1].text != "") {
                field[i+2].text = field[i+1].text
                field[i+1].text = ""
                isBlocksMoved = true
            }
        }
        if (isBlocksMoved) {
            Spawn.randomNumberSpawn(field)
            setBlocksColor(field)
        }
    }

    fun onClickMoveUp(view: View) {
        var isBlocksMoved = false
        for (i in 0..2) {
            if (field[i].text != "" && field[i].text == field[i+3].text) {
                field[i].text = (field[i].text.toString().toInt() + field[i+3].text.toString().toInt()).toString()
                field[i+3].text = field[i+6].text
                field[i+6].text = ""
                isBlocksMoved = true
            }
            else if (field[i].text != "" && field[i+3].text == "" && field[i].text == field[i+6].text) {
                field[i].text = (field[i].text.toString().toInt() + field[i+6].text.toString().toInt()).toString()
                field[i+6].text = ""
                isBlocksMoved = true
            }
            else if (field[i+3].text != "" && field[i+3].text == field[i+6].text) {
                field[i+3].text = (field[i+3].text.toString().toInt() + field[i+6].text.toString().toInt()).toString()
                field[i+6].text = ""
                isBlocksMoved = true
            }
            if (field[i+3].text == "" && field[i+6].text != "") {
                field[i+3].text = field[i+6].text
                field[i+6].text = ""
                isBlocksMoved = true
            }
            if (field[i].text == "" && field[i+3].text != "") {
                field[i].text = field[i+3].text
                field[i+3].text = ""
                isBlocksMoved = true
            }
        }
        if (isBlocksMoved) {
            Spawn.randomNumberSpawn(field)
            setBlocksColor(field)
        }
    }

    fun onClickMoveDown(view: View) {
        var isBlocksMoved = false
        for (i in 0..2) {
            if (field[i+6].text != "" && field[i+6].text == field[i+3].text) {
                field[i+6].text = (field[i+6].text.toString().toInt() + field[i+3].text.toString().toInt()).toString()
                field[i+3].text = field[i].text
                field[i].text = ""
                isBlocksMoved = true
            }
            else if (field[i+6].text != "" && field[i+3].text == "" && field[i+6].text == field[i].text) {
                field[i+6].text = (field[i+6].text.toString().toInt() + field[i].text.toString().toInt()).toString()
                field[i].text = ""
                isBlocksMoved = true
            }
            else if (field[i+3].text != "" && field[i+3].text == field[i].text) {
                field[i+3].text = (field[i+3].text.toString().toInt() + field[i].text.toString().toInt()).toString()
                field[i].text = ""
                isBlocksMoved = true
            }
            if (field[i+3].text == "" && field[i].text != "") {
                field[i+3].text = field[i].text
                field[i].text = ""
                isBlocksMoved = true
            }
            if (field[i+6].text == "" && field[i+3].text != "") {
                field[i+6].text = field[i+3].text
                field[i+3].text = ""
                isBlocksMoved = true
            }
        }
        if (isBlocksMoved) {
            Spawn.randomNumberSpawn(field)
            setBlocksColor(field)
        }
    }

    fun onClickMoveRestart(view: View) {
        Spawn.restart(field)
        setBlocksColor(field)
    }


}