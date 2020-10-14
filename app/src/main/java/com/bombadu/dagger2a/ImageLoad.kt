package com.bombadu.dagger2a

import android.widget.ImageView
import com.squareup.picasso.Picasso
import javax.inject.Inject

class ImageLoad @Inject constructor() {

    fun loadIntoImageView(url: String, myImageView: ImageView) {

        Picasso.get().load(url).into(myImageView)
    }

}