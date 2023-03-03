package com.yang

import com.yang.scalalang.fast2.cap2.{ForCase, MutableArgsCase}
import com.yang.scalalang.tour.companion.{CompanionCase, Email}

/**
 * Hello world!
 *
 */
object App {

  def main(args: Array[String]): Unit = {

    println("Hello World!")

    /**
     * for 循环
     */
    ForCase.test()

    /**
     * 伴生对象
     */
    CompanionCase.test()

    /**
     * 变长参数
     */
    MutableArgsCase.test(1, 2, 3, 4, 5)
    // 传序列用 : _* 标识，类似 python *[] 前缀
    MutableArgsCase.test(1 to 5: _*)
  }
}
