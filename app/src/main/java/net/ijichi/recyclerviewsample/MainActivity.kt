package net.ijichi.recyclerviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          //    // ヘッダ追加
    //    val headerState = RecyclerState(RecyclerType.HEADER, "へっだ")
    //    states.add(headerState)

          var secCounter = 0
          val states = (1..20).map {
              //      // 2 件目 と 3 件目　の上にセクションを追加
              //      if(i == 2 || i == 3){
              //        secCounter++
              //        val sectionState = RecyclerState(RecyclerType.SECTION, "セクション（区切り） No. $secCounter")
              //        states.add(sectionState)
              //      }
              RecyclerState(RecyclerType.BODY, "$it 件目")
          }

    //    // フッタ追加
    //    val footerState = RecyclerState(RecyclerType.FOOTER, "ふった")
    //    states.add(footerState)

        val adapter = RecyclerAdapter(this, states)

        val recycler = findViewById<RecyclerView>(R.id.mainRecycler)
        recycler.adapter = adapter


        val toolbar = findViewById<TextView>(R.id.mainToolbarText)
        val appBarText = findViewById<TextView>(R.id.mainAppBarText)

        val MAX_VERTICAL_OFFSET = 396 // appBarの最大値

        val appBar = findViewById<AppBarLayout>(R.id.mainAppBar)
        appBar.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            val alpha = (-verticalOffset).toFloat() / MAX_VERTICAL_OFFSET // 1.0〜0.0 の間で変動
            Log.i(TAG, "alpha = $alpha")
            toolbar.alpha = alpha
            appBarText.alpha = 1 - alpha

        }
    }
}
