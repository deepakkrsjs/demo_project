

object Reduce_Example {
  val lst = List(1, 2, 3, 5, 7, 10, 13);
  val list2 = List("A", "B", "C");

  def main(args: Array[String]) {

    println(lst.reduce(_ + _));
    println(lst.reduceLeft(_ + _));
    println(list2.reduceLeft(_ + _));

    println(lst.reduceLeft((x, y) => { println(x + " , " + y); x + y; }));
    println(lst.reduceRight((x, y) => { println(x + " , " + y); x - y; }));
    println(lst.reduceLeft(_ - _));
    println(lst.reduceRight(_ - _));

    println(lst.foldLeft(0)(_ + _));
    println(lst.foldLeft(100)(_ + _));
    println(list2.foldLeft("z")(_ + _));

    println(lst.scanLeft(100)(_ + _));
    println(list2.scanLeft("z")(_ + _));

  }
}