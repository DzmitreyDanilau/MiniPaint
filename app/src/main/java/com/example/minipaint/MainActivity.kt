package com.example.minipaint

import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvas = MyCanvas(this)
        myCanvas.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        myCanvas.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvas)
    }


}
