

object Map_Example {

  val mymap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "July");
  val mymap1: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "July", 803 -> "Deepak");
  val mymap2: Map[Int, String] = Map(806 -> "Allen");

  def main(args: Array[String]) {

    println(mymap);
    println(mymap(801));
    println(mymap1);
    println(mymap.keys);
    println(mymap1.values);
    println(mymap.isEmpty);

    //mymap.keys.foreach(println);
    mymap.keys.foreach {
      key => println("key: " + key + "\t\tValue: " + mymap(key));
    }
    println(mymap.contains(804));
    println(mymap ++ mymap2);
    println((mymap ++ mymap2).size);
  }
}