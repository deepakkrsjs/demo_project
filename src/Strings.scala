

object Strings {

  val str1 = "Hello world";
  val str2 = " Deepak";
  val num1 = 75;
  val num2 = 100.25;

  def main(args: Array[String]) {
    println(str1.length());
    println(str1.concat(str2));
    println(str1 + str2);
    val result = printf("%d  -- %f -- %s", num1, num2, str2);

    println(result);
    println(("%d  -- %f -- %s").format(num1, num2, str2));
    printf("%d  -- %f -- %s", num1, num2, str2);
  }
}