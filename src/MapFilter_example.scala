

object MapFilter_example {

  val lst = List(1, 2, 3, 44, 55, 6, 8, 10);
  val mymap = Map(1 -> "Tom", 2 -> "John", 3 -> "Peter");

  def main(args: Array[String]) {

    println(lst.map(_ * 2));
    println(lst.map(x => x / 0.2));
    println(lst.map(x => "hi" * x));
    println(mymap.map(x => "hi" + x));
    println(mymap.mapValues(x => "hi " + x));
    println("hello".map(_.toUpper));

    println(List(List(1, 2, 3), List(3, 4, 5)));
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten);

    println(lst.flatMap(x => List(x, x + 2)));
    println(lst.flatMap(x => List(x, x + 2)));

    println(lst.filter(_ % 2 == 0));
    println(lst.filter(x => x % 2 != 0));

  }
}