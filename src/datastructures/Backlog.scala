package datastructures

class Backlog[A](fun: A => Unit) {
  var list: List[A] = List()
  def addTask(task: A): Unit = {
    list = list :+ task
    println(list)
  }
  def completeTask(): Unit = {
    if(list.nonEmpty) {
      fun(list.head)
      list = list.drop(1)
    }
    println(list)
  }
}
