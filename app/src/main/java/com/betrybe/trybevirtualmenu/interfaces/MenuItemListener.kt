package com.betrybe.trybevirtualmenu.interfaces

import android.view.View

interface MenuItemListener {
    fun setMenuItemClickListener(v: View, position: Int)
}