package net.ijichi.recyclerviewsample.models

/**
 * Created by ijichiyoshihito on 2017/08/31.
 */

enum class RecyclerType(val int: Int){
  HEADER(0),
  FOOTER(1),
  SECTION(2),
  BODY(3);

  companion object {
    fun fromInt(int: Int): RecyclerType {
      return values().firstOrNull { it.int == int }
        ?: BODY
    }
  }
}
