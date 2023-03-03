package com.yang.scalalang.fast2.cap3

import scala.collection.mutable.ArrayBuffer

object ArrayCase {

  // 定长数组 Array, 直接初始化为 0
  // Array 在 jvm 底层就是 java 的数组，例如下面的就是 int[]
  val a: Array[Int] = Array[Int](10)

  // 提供初始值
  val b: Array[Int] = Array(1, 2, 3, 4, 5)

  // 变长数组 ArrayBuffer，等价于 java.util.ArrayList
  // 初始化
  val c = ArrayBuffer[Int]()
  // 末尾追加
  c += 1
  // 追加多个
  c += (6, 7, 8)
  // 追加 collection
  c ++= b
  c.search(3)

  // 遍历
  // until 和 to 的区别就是 until 区间右开 [x, y)
  for (i <- 0 until c.length) println(f"c($i) = ${c(i)}")
  // 上面遍历下标可以直接用 indices
  for (i <- c.indices) println(f"c($i) = ${c(i)}")
  // 步长遍历用 by
  for (i <- c.indices by 2) println(f"c($i) = ${c(i)}")
  // 翻转遍历
  for (i <- c.indices.reverse) println(f"c($i) = ${c(i)}")
}
