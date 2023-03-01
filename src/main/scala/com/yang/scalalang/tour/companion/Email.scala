package com.yang.scalalang.tour.companion

class Email(val userName: String, val domainName: String)

object Email {

  def fromString(emailString: String): Option[Email] = {

    emailString.split("@") match {
      case Array(userName, domainName) => Some(new Email(userName, domainName))
      case _ => None
    }
  }
}
