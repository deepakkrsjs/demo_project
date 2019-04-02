

object HigherOrderFunc {

  //def Math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y);
  //def Math(x: Double, y: Double, z: Double, f: (Double, Double) => Double): Double = f(f(x, y), z);
  def Math(x: Double, y: Double, z: Double, g: (Double, Double) => Double, f: (Double, Double) => Double): Double = g(f(x, y), z);

  def main(args: Array[String]) {

    //var result = Math(50, 40, (x, y) => x * y);
    //var result = Math(50, 40, 30, (x, y) => x min y);
    var result = Math(50, 40, 30, _ + _, _ min _);
    println(result);
  }
}