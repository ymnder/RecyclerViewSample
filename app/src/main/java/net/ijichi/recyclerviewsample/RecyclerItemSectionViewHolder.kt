package net.ijichi.recyclerviewsample

import android.support.v7.widget.RecyclerView

/**
 * Created by ijichiyoshihito on 2017/08/30.
 */
class RecyclerItemSectionViewHolder(private val view: RecyclerItemSectionView) : RecyclerView.ViewHolder(view) {
  fun update(state: RecyclerState){
    view.update(state)
  }
}