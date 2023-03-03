package com.yang.scalalang.fast2.cap2

object MutableArgsCase {

  // args 可传多个，类似 python *args
  def test(args: Int*) = {

    var res = 0
    for (i <- args) res += i
    println(res)
  }
}
