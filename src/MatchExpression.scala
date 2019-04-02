

object MatchExpression {

  def main(args: Array[String]) {

    val age = 22

    age match {
      case 18 => println(age)
      case 19 => println(age)
      case 20 => println(age)
      case 21 => println(age)
      case _  => println("default")
    }

    var result = age match {
      case 18 => age
      case 19 => age
      case 20 => age
      case 21 => age
      case _  => "default case"
    }

    println(result)

    var number = 8
    number match {
      case 1 | 3 | 5 | 7 | 9  => println("ODD")
      case 2 | 4 | 6 | 8 | 10 => println("EVEN")
    }

  }
}