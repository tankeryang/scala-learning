package com.yang.scalalang.fast2.cap5

import scala.beans.BeanProperty

/**
 * 类
 * 主构造器和类定义直接耦合，参数跟在类名括号后
 * v1：对象私有字段，<=> private[this] var v1，如果没有方法使用 v1,则没有该字段
 * private var v2：私有字段，私有 getter setter
 * var v3：私有字段：公有 getter setter
 * @BeanProperty var v4：私有字段，公有 scala + java 版本地 getter setter
 */
class ClassCase(
                 v1: String,
                 private var v2: String,
                 var v3: String,
                 @BeanProperty var v4: String) {

  // 私有【var】字段，scala 会自动生成【私有】的 getter setter 方法
  private var value1 = 0
  // 【对象私有】字段，只对当前对象可见，而且不会生成 getter setter 方法
  private[this] var pvalue1 = 0

  // 公有【var】字段，编译后的字节码，字段是私有的，但会生成【公有】的 getter setter 方法 value2() 和 value2_=()，字节码翻译成 value2_$eq
  // obj.value2 调用 obj.value2() 就是获取值，obj.value2 = 1 调用 obj.value2_=(1) 就是 set 值
  var value2 = 0

  // 私有【var】字段，也可以自定义【公有】getter setter 方法，更细腻的控制取值和改值
  private var _value3 = 0

  // 自定义 getter
  def value3: Int = _value3

  // 自定义 setter
  def value3_=(v: Int): Unit = {
    if (v > _value3) _value3 = v
  }

  // 【val】字段，只会生成 getter 方法
  private val value4 = 0

  // 符合 JavaBeans 规范的字段，额外生成 getXxx setXxx 方法
  // 生成下面 4 个方法
  // value5(): String
  // value_=(value: String): Unit
  // getValue5(): String
  // setValue5(value: String): String
  @BeanProperty var value5 = ""

  // 【私有】字段并不是对象私有的，可以被同类型的对象访问到，other.pvalue1 就访问不到
  def isLess(other: ClassCase): Boolean = value1 < other.value4
}
