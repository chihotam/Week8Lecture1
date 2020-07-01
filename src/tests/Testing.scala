package tests

import org.scalatest._
import datastructures.Backlog

class Testing extends FunSuite {
  test("") {
    class Email {
      var checked = false
    }
    def checkEmail(email: Email): Unit = {
      email.checked = true
      println("Checked an email")
    }
    val backlog = new Backlog[Email](checkEmail)
    // 7 new emails hit the inbox
    backlog.addTask(new Email) // 1
    backlog.addTask(new Email) // 2
    backlog.addTask(new Email)
    backlog.addTask(new Email)
    backlog.addTask(new Email)
    backlog.addTask(new Email)
    backlog.addTask(new Email)
    // Only time to check 2 emails
    backlog.completeTask() // checks the email marked 1
    backlog.completeTask() // checks the email marked 2
  }
}
