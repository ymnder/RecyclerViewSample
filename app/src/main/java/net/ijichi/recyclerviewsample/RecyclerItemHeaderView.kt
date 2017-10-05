package net.ijichi.recyclerviewsample

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.TextView

/**
 * Created by ijichiyoshihito on 2017/08/30.
 */
class RecyclerItemHeaderView constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr){
  private val textView: TextView

  init {
    val rootView = LayoutInflater.from(context).inflate(R.layout.recycler_item_header_view, this)
    textView = rootView.findViewById(R.id.recyclerItemHeaderText)
    setOnClickListener {
      // クリック処理
    }
  }

  fun update(state: RecyclerState){
    textView.text = state.text
  }
}