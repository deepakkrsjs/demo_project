

object WhileLoop {

  def main(args: Array[String]) {

    var x = 0;
    while (x < 10) {
      println(x)
      x += 1
    }

    var y = 0;
    do {
      println("2 * " + y + " = " + 2 * y)
      y += 1
    } while (y <= 10)

  }
}