package com.yang.scalalang.fast2.cap4

import collection.mutable

object MapCase {

  // map 默认是 immutable 的，可变的需要 import
  val m1 = Map("a" -> 1, "b" -> 2)
  val m2 = mutable.Map("a" -> 1, "b" -> 2)
  // m1("a") = 1 会提示报错，因为不可变
  m2("a") = 0
  // getOrElse 类似 python get(key, default)
  val v = m2.getOrElse("c", 0)
  // 不可变 Map 可以设置默认值，转成可变 Map
  val m3 = m1.withDefaultValue(0)
  val m4 = m1.withDefault(_.length)

  println(m1, m2, m3, m4)
}
