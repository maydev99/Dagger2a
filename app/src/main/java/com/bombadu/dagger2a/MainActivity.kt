package com.bombadu.dagger2a

import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var info: Info
    @Inject lateinit var what: What
    @Inject lateinit var imageLoad: ImageLoad

    private val imageUrl = "https://www.gannett-cdn.com/presto/2020/10/14/NCOD/76bccecd-3c06-4fae-867c-81fb321fb9c6-IMG_1828.jpg?width=1320&height=990&fit=crop&format=pjpg&auto=webp"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)

        DaggerMagicBox.create().poke(this)
        val strBuilder: StringBuilder = java.lang.StringBuilder()
        strBuilder.appendLine(info.text)
        strBuilder.appendLine(info.description)
        strBuilder.appendLine(what.myText)
        text_view.text = strBuilder.toString()
        text_view.gravity = Gravity.CENTER_HORIZONTAL
        Toast.makeText(this, "Add: ${info.myAdd(333)}", Toast.LENGTH_SHORT).show()
        //imageLoad.loadIntoImageView(imageUrl, imageView)

        Picasso.get().load(imageUrl).into(imageView)

    }
}