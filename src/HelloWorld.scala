

object HelloWorld {

  def main(args: Array[String]) {

    val name = "Deepak"
    val age = 25
    println("Hello, world!")
    println(name + " is " + age + " years old.")
    println(s"$name is $age years old.")
    println(f"$name%s is $age%d years old.")
    println(s"Hello,\n world!")
    println(raw"Hello, \nworld!")

  }

}