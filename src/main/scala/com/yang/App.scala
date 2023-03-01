package com.yang

import com.yang.scalalang.tour.companion.Email

/**
 * Hello world!
 *
 */
object App {
  
  def main(args: Array[String]): Unit = {
    
    println( "Hello World!" )

    /**
     * # 伴生对象
     * 伴生对象里的 __变量__，__方法__，可以看作是 java 里的 __类变量__， __类方法__；所有实例共享，即 __static__ 修饰的
     */
    val email = Email.fromString("tankeryang@yang.com")
    email match {
      case Some(e) => println(
        s"""Show Email
           |Username: ${e.userName}
           |Domain name: ${e.domainName}
           |""".stripMargin
      )
      case None => println("Err: could not parse email string")
    }
  }
}
