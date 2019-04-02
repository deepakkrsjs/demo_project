//Scala Closure
/*Closure is a function which uses one or more variables
  declared outside the function*/
object Closure {

  var number = 10;
  //val add = (x: Int) => x + number;
  val add = (x: Int) => {
    number = x + number;
    number;
  }

  def main(args: Array[String]) {
    println(add(30));

    //number = 100;
    println(add(100));
  }

}
