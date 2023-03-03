package com.yang.scalalang.tour.companion

object CompanionCase {

  def test(): Unit = {

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
