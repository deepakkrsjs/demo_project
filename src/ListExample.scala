

object ListExample {

  val myList: List[Int] = List(1, 2, 4, 55, 33, 44);
  val names: List[String] = List("Diwakar", "Pratik", "Deepak");

  def main(args: Array[String]) {
    println(myList);
    println(0 :: myList);
    println(myList);
    println(10 :: 20 :: 30 :: Nil);
    println(myList.head);
    println(myList.tail);
    println(names.isEmpty);
    println(names.reverse);
    println(List.fill(5)(2));
    println(myList.max);

    myList.foreach(println);
    var sum = 0;
    myList.foreach(sum += _);
    println("sum of all values of myList = "+sum);
    
    for (name <- names) print(name + " ");
    print(" are roommates");

  }
}