

object Functions {

  object Math {

    def add(x: Int, y: Int): Int = {
      return x + y
    }

    def square(x: Int) = x * x;

  }
  def substract(x: Int, y: Int): Int = {
    x - y;
  }

  def multiply(x: Double, y: Int) = x * y;

  def divide(x: Int, y: Int) = x / y;

  def print(x: Int, y: Int): Unit = { //doesn't return anything like return void
    println(x + y);
  }

  def main(args: Array[String]) {

    var add = (x: Int, y: Int) => x + y;  //Anonymous function without defining the function seperately
    println(add(4, 5));
    println(Math.add(400, 500));
    println(Math.square(3));
    println(Math square 4);
    println(substract(400, 500));
    println(multiply(4.5, 500));
    println(divide(54, 4));
    print(100, 200);

  }
}