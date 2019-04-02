

object IfElse {

  def main(args: Array[String]) {

    val x = 20
    var result1 = ""
    var result2 = ""
    if (x == 20) {
      result1 = "x is equal to 20"
    } else {
      result1 = "x is not equal to 20"
    }
    println(result1)

    result2 = if (x == 20) "x is equal to 20" else "x is not equal to 20"
    println(result2)

    println(if (x == 20) "x = 20" else "x != 20")

  }
}