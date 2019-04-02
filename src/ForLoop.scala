

object ForLoop {

  def main(args: Array[String]) {

    for (i <- 1 to 5) { //for (i <- 1.to(5))
      println(i)
    }
    println("using untill")
    for (i <- 1 until 6) { //for (i <- 1.until(5))
      println(i)
    }

    for (m <- 1 to 5; n <- 1 to 3) {
      println(m + "\t" + n)
    }
    println("iterataing over a list")
    val lst = List(1, 2, 3, 44, 51, 78, 92, 66, 3)
    for (i <- lst) {
      println(i) // iterating over list
    }

    println("using filter before iterataing")
    for (i <- lst; if i < 70) {
      println(i)
    }

    println("using for loop as an expression")
    val result = for { i <- lst; if i < 60 } yield {
      i * i
    }
    println("filtered result = " + result)
  }
}