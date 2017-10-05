package net.ijichi.recyclerviewsample.views

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.TextView
import net.ijichi.recyclerviewsample.R
import net.ijichi.recyclerviewsample.models.RecyclerState
import net.ijichi.recyclerviewsample.models.RecyclerType

class CoordinatorTestActivity : AppCompatActivity() {

    private val TAG = CoordinatorTestActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator_test)

          val states = (1..20).map {
              RecyclerState(RecyclerType.BODY, "$it 件目")
          }
        val adapter = RecyclerAdapter(this, states)
        val recycler = findViewById<RecyclerView>(R.id.mainRecycler)
        recycler.adapter = adapter

        val appBarText = findViewById<TextView>(R.id.mainAppBarText)

        val appBar = findViewById<AppBarLayout>(R.id.mainAppBar)
    }
}