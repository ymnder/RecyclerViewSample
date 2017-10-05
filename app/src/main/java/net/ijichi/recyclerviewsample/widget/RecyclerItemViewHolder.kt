package net.ijichi.recyclerviewsample.widget

import android.support.v7.widget.RecyclerView
import net.ijichi.recyclerviewsample.models.RecyclerState

/**
 * Created by ijichiyoshihito on 2017/08/30.
 */
class RecyclerItemViewHolder(private val view: RecyclerItemView) : RecyclerView.ViewHolder(view) {
  fun update(state: RecyclerState){
    view.update(state)
  }
}
