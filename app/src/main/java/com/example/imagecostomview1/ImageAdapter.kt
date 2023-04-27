package com.example.imagecostomview1

import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter( val image: ArrayList<IMG>):RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    interface OnImageClickListener {
        fun onImageClick(
            position: Int,
            productView: ImageView,
            imageView: ImageView,
            imageId: Int
        )

    }

    var onImageClickListener: OnImageClickListener? = null


    inner class ImageViewHolder(
        val ImageView: ImageView
    ) : RecyclerView.ViewHolder(ImageView) {

        init {
            ImageView.setOnClickListener {
                onImageClickListener?.onImageClick(
                    adapterPosition,
                    ImageView,
                    ImageView,
                    image[position].id
                )
            }
        }
    }



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(ImageView(parent.context))
    }

    override fun getItemCount()=image.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val currentImage = image[position]
        holder.ImageView.setImageResource(currentImage.ImgId) // or setImageBitmap, setImageDrawable, or setImageURI
    }
    }

