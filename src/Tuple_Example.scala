

object Tuple_Example {

  val mytuple = (1, 2, "Hi Deepak", true);
  val mytuple2 = new Tuple3(4, 5, "Hello");
  val mytuple3 = new Tuple4(44, 5, "Hello", (2, 3));

  def main(args: Array[String]) {

    println(mytuple);
    println(mytuple._1);
    println(mytuple._2);
    println(mytuple._3);
    println(mytuple._4 + "\n");

    mytuple.productIterator.foreach {
      i => println(i)
    }

    println(1 -> "Tom");
    println(1 -> "Tom" -> true);
    println(mytuple3._4);
    println(mytuple3._4._2);
    //mytuple.productIterator.foreach(println);

  }
}