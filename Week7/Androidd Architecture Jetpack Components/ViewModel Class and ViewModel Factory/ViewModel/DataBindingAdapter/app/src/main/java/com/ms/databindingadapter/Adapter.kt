package com.ms.databindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url : String){           // imageFromUrl: extension fun
    Glide.with(this.context).load(url).into(this)
}