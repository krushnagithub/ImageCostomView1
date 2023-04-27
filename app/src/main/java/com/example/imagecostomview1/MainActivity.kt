package com.example.imagecostomview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var RecyclerImg: RecyclerView
    private val image = ArrayList<IMG>()
    private lateinit var Imageadapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()
    }

    private fun initData() {
        image.add(IMG(11, R.drawable.book1))
        image.add(IMG(11, R.drawable.book2))
        image.add(IMG(11, R.drawable.book3))
        image.add(IMG(11, R.drawable.book1))
        image.add(IMG(11, R.drawable.book2))
        image.add(IMG(11, R.drawable.book3))
        image.add(IMG(11, R.drawable.book1))
        image.add(IMG(11, R.drawable.book2))
        image.add(IMG(11, R.drawable.book3))
        image.add(IMG(11, R.drawable.book1))
        image.add(IMG(11, R.drawable.book2))
        image.add(IMG(11, R.drawable.book3))
        image.add(IMG(11, R.drawable.book1))
        image.add(IMG(11, R.drawable.book2))
        image.add(IMG(11, R.drawable.book3))
        image.add(IMG(11, R.drawable.book1))
        image.add(IMG(11, R.drawable.book2))
        image.add(IMG(11, R.drawable.book3))


    }

    private fun initView() {
        RecyclerImg = findViewById(R.id.RecyclerImg)
        RecyclerImg.layoutManager = GridLayoutManager(this, 2)
        Imageadapter = ImageAdapter(image)
        RecyclerImg.adapter = Imageadapter
        Imageadapter.onImageClickListener=MyOnProductClickListener()

    }


    private inner class MyOnProductClickListener : ImageAdapter.OnImageClickListener {
        override fun onImageClick(
            position: Int,
            productView: ImageView,
            imageView: ImageView,
            imageId: Int
        ) {
            mt("MA: image clicked ${imageView.id}")
        }

    }
    private fun mt(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}