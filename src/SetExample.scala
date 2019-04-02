

object SetExample {

  val myset: Set[Int] = Set(1, 2, 3, 4, 5, 6, 8, 9, 4, 5);
  var myset1: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1, 2, 3, 4, 5, 6, 8, 9);
  val myset2: Set[Int] = Set(11, 32, 43, 4, 56, 6, 86, 92, 64, 5);
  val names = Set("Max", "Tom", "John");

  def main(args: Array[String]) {
    
    println(myset + 10);
    println(myset);
    println(myset1(9));
    println(names("Maxxx"));
    
    println(myset.head);
    println(myset.tail);
    println(myset.isEmpty);
    
    println(myset++myset2);
    println(myset.++(myset2));
    
    println(myset.&(myset2));
    println(myset.intersect(myset2));
    println(myset.max);
    println(myset.min);
    myset.foreach(println);
    for(x<-names) println(x);
    
  }

}