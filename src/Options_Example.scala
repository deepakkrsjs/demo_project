

object Options_Example {

  val mylist = List(11, 2, 44, 55);
  val mymap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "July");
  val opt1: Option[Int] = None;
  val opt2: Option[Int] = Some(55);

  def main(args: Array[String]) {

    println(mylist.find(_ > 60));
    println(mylist.find(_ > 40));
    println(mylist.find(_ > 40).get);
    println(mymap.get(5).getOrElse("No name found"));
    println(mylist.find(_ > 60).getOrElse(0));

    println(opt1.isEmpty);
    println(opt2.isEmpty);
    println(opt2.getOrElse(0));
  }

}