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

        field = arrayOf(findViewById(R.id.textView1),
                        findViewById(R.id.textView2),
                        findViewById(R.id.textView3),
                        findViewById(R.id.textView4),
                        findViewById(R.id.textView5),
                        findViewById(R.id.textView6),
                        findViewById(R.id.textView7),
                        findViewById(R.id.textView8),
                        findViewById(R.id.textView9))

        moveUp = findViewById<ImageButton>(R.id.moveUp)
        moveDown = findViewById<ImageButton>(R.id.moveDown)
        moveRight = findViewById<ImageButton>(R.id.moveRight)
        moveLeft = findViewById<ImageButton>(R.id.moveLeft)
        restart = findViewById<ImageButton>(R.id.restartButton)

        Spawn.randomNumberSpawn(field)
        setBlocksColor(field)
    }

    fun onClickMoveLeft(view: View) {
        moveBlocks(field, 0, 2, 8, 3)
    }

    fun onClickMoveRight(view: View) {
        moveBlocks(field, 2, 0, 8, 3)
    }

    fun onClickMoveUp(view: View) {
        moveBlocks(field, 0, 6, 2, 1)
    }

    fun onClickMoveDown(view: View) {
        moveBlocks(field, 6, 0, 2, 1)
    }

    fun onClickMoveRestart(view: View) {
        Spawn.restart(field)
        setBlocksColor(field)
    }

}