package net.ijichi.recyclerviewsample.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView
import net.ijichi.recyclerviewsample.R
import net.ijichi.recyclerviewsample.models.RecyclerState

/**
 * Created by ijichiyoshihito on 2017/08/30.
 */
class RecyclerItemView constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr){
  private val textView: TextView

  init {
    val rootView = LayoutInflater.from(context).inflate(R.layout.recycler_item_view, this)
    textView = rootView.findViewById(R.id.recyclerItemText)
    setOnClickListener {
      // クリック処理
    }
  }

  fun update(state: RecyclerState){
    textView.text = state.text
  }
}
