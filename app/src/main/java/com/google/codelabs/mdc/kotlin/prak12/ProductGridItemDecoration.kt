package com.google.codelabs.mdc.kotlin.prak12

import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView

/**
 * Custom item decoration for a vertical [ProductGridFragment] [RecyclerView]. Adds a
 * small amount of padding to the left of grid items, and a large amount of padding to the right.
 */
class ProductGridItemDecoration(private val largePadding: Int, private val smallPadding: Int) : RecyclerView.ItemDecoration() {

    //adjust CardPadding within the RecyclerView
    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView)
    {
        outRect.left = smallPadding
        outRect.right = largePadding
    }
}
