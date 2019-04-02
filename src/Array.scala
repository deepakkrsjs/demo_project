
import Array._
object ArrayExample {

  val myArray: Array[Int] = new Array[Int](4);
  val myArray2 = new Array[Boolean](5);
  val myArray3 = Array(1,2,3,4,5,6,7,8);
  //val myArray4 = new Array("Deepak","Pratik");

  def main(args: Array[String]) {
    myArray(0) = 10;
    myArray(1) = 20;
    myArray(2) = 30;
    myArray(3) = 40;
    println(myArray);
    for(x <- myArray) println(x);
    for(i <- 0 to myArray.length - 1) println(myArray(i))
    for(x <- myArray2) println(x);
    println(myArray3.length);
    val result=concat(myArray, myArray3);
    for(x <- result) println(x);
  }
}