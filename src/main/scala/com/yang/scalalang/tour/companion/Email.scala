package com.yang.scalalang.tour.companion


/**
 * # 伴生类/对象
 * 伴生对象里的 __变量__，__方法__，可以看作是 java 里的 __类变量__， __类方法__；所有实例共享，即 __static__ 修饰的
 */
class Email(val userName: String, val domainName: String)

object Email {

  def fromString(emailString: String): Option[Email] = {

    emailString.split("@") match {
      case Array(userName, domainName) => Some(new Email(userName, domainName))
      case _ => None
    }
  }
}
