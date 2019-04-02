//Scala currying
/* Currying is a technique of transforming a function
 * that takes multiple arguments into a function
 * that takes a single argument */

object Currying {

  def add(x: Int, y: Int) = x + y;
  def add2(x: Int) = (y: Int) => x + y;
  def add3(x:Int)(y:Int) = x+y

  def main(args: Array[String]) {
  println(add(10,20))
  println(add2(10)(20))
  val sum40=add2(40)
  println(sum40(100))
  println(add3(100)(200))
  val sum50 = add3(50)_
  println(sum50(400))
      
  }
}