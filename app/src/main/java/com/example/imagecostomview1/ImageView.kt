package com.example.imagecostomview1

import android.content.Context
import android.media.Image
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class ImageView(context: Context,
    attributeSet: AttributeSet?
) : LinearLayout(context, attributeSet) {
    val imgProduct : ImageView



      var image:IMG?= null
        set(value) {
            field = value
            bindProductToViews()
        }
    constructor(context: Context):this(context,null)
    init {
        val view=LayoutInflater.from(context)
            .inflate(R.layout.activity_image_view1,null)
        this.addView(view)
        imgProduct=view.findViewById(R.id.imgProduct)


        setupListeners()
    }
    interface OnImageClickListener {
        fun onImageClick(
            position: Int,
            productView: com.example.imagecostomview1.ImageView,
            imageView: ImageView,
            imageId: Int
        )

        companion object {
            fun onImageClick(imageView: com.example.imagecostomview1.ImageView, imgProduct: ImageView, imgId: Int) {
                TODO("Not yet implemented")
            }
        }

    }
    var onImageClickListener: ImageAdapter.OnImageClickListener? = null
    private fun setupListeners() {
        imgProduct.setOnClickListener {
            //mt("image of ${product!!.id} clicked")
            OnImageClickListener?.onImageClick(
                this,
                imgProduct,
                image!!.ImgId
            )
        }
    }

        private fun bindProductToViews() {
        if(image != null) {
            imgProduct.setImageResource(image!!.ImgId)

        }
    }

}


