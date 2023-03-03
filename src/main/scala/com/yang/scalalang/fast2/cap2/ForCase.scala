package com.yang.scalalang.fast2.cap2

object ForCase {

  /**
   * 没有 = 号的函数，函数体不返回值，返回类型就是 Unit 可以省略掉，这种函数叫过程
   * 等价于 def test(): Unit = {}
   */
  def test() {

    // for 循环，可以加 if 守卫
    for (i <- 1 to 3; j <- 1 to 3 if i != j) println(f"${10 * i + j}%3d")

    // for yield 推导式，返回和遍历集合一样类型的集合
    // Array 接收变长参数，传 seq 可以在后面加 : _* 标识，类似 python *args
    val av = Array(1 to 10: _*)
    val v = for (i <- av if i % 2 == 0) yield i * 2
    // 上面的处理等价于 filter + map
    val vv = av.filter(_ % 2 == 0).map(_ * 2)
    println(v.mkString("Array(", ", ", ")"))
    println(vv.mkString("Array(", ", ", ")"))

    // 多行可以 {} 包围
    for {
      i <- 1 to 3
      from = 4 - i
      j <- from to 3
    } println(f"${10 * i + j}%3d")
  }
}
