package com.betrybe.trybevirtualmenu.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.models.MenuDatabase
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class MenuItemDetailActivity : AppCompatActivity() {

    private val image: ShapeableImageView by lazy { findViewById(R.id.detail_image) }
    private val name: MaterialTextView by lazy { findViewById(R.id.detail_name) }
    private val description: MaterialTextView by lazy { findViewById(R.id.detail_description) }
    private val price: MaterialTextView by lazy { findViewById(R.id.detail_price) }
    private val btnBack: ExtendedFloatingActionButton by lazy { findViewById(R.id.detail_back) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_item_detail)

        val position = intent.getIntExtra("dishPosition", 0)

        val dish = MenuDatabase.getByIndex(position)

        image.setImageResource(dish.image)
        name.text = dish.name
        description.text = dish.description
        price.text = "R$ ${dish.price}"

        btnBack.setOnClickListener { this.finish() }
    }
}