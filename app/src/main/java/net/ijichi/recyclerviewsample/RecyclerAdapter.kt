package net.ijichi.recyclerviewsample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.FrameLayout
import android.view.LayoutInflater
import android.widget.TextView


/**
 * Created by ijichiyoshihito on 2017/08/30.
 */
class RecyclerAdapter(
  private val context: Context,
  private val states: List<RecyclerState>) :
  RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    when(RecyclerType.fromInt(viewType)){
      RecyclerType.HEADER -> {
        val view = RecyclerItemHeaderView(context)
        return RecyclerItemHeaderViewHolder(view)
      }
      RecyclerType.FOOTER -> {
      val view = RecyclerItemFooterView(context)
      return RecyclerItemFooterViewHolder(view)
    }
      RecyclerType.SECTION -> {
      val view = RecyclerItemSectionView(context)
      return RecyclerItemSectionViewHolder(view)
    }
      RecyclerType.BODY -> {
        val view = RecyclerItemView(context)
        return RecyclerItemViewHolder(view)
      }
    }
  }

  override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
    when(viewHolder){
      is RecyclerItemHeaderViewHolder ->{
        viewHolder.update(states[position])
      }
      is RecyclerItemFooterViewHolder ->{
        viewHolder.update(states[position])
      }
      is RecyclerItemSectionViewHolder ->{
        viewHolder.update(states[position])
      }
      is RecyclerItemViewHolder ->{
        viewHolder.update(states[position])
      }
    }
  }

  override fun getItemViewType(position: Int): Int {
    return states[position].type.int
  }

  override fun getItemCount(): Int {
    return states.count()
  }
}