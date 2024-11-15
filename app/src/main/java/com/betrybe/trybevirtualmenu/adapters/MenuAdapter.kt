package com.betrybe.trybevirtualmenu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.betrybe.trybevirtualmenu.R
import com.betrybe.trybevirtualmenu.interfaces.Dish
import com.betrybe.trybevirtualmenu.interfaces.MenuItemListener
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.textview.MaterialTextView

class MenuAdapter(val dishs: List<Dish>) : Adapter<MenuAdapter.MenuViewHolder>() {

    private var menuListener: MenuItemListener? = null

    fun setMenuListener(listener: MenuItemListener) {
        this.menuListener = listener
    }

    class MenuViewHolder(view: View, menuListener: MenuItemListener?) : ViewHolder(view) {
        val image: ShapeableImageView = view.findViewById(R.id.item_menu_image)
        val name: MaterialTextView = view.findViewById(R.id.item_menu_name)

        init {
            view.setOnClickListener {
                menuListener?.setMenuItemClickListener(view, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_menu_layout, parent, false)
        return MenuViewHolder(view, menuListener)
    }

    override fun getItemCount(): Int = dishs.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.name.text = dishs[position].name
        holder.image.setImageResource(dishs[position].image)
    }
}