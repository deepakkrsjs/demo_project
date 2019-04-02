import java.util.Date;

object PartiallyAppliedFunc {

  def log(date: Date, message: String) {
    println(date + "   " + message)
  }
  def main(args: Array[String]) {

    val sum = (a: Int, b: Int, c: Int) => a + b + c;
    println(sum(20, 30, 40)); //Fully applied Func as we r passing all args

    val f = sum(20, 30, _: Int)
    println(f(50)); //Partially applied func

    val date = new Date;
    val newLog = log(date, _: String)
    newLog("The Message1") ;
    newLog("The Message2") ;
    
  }
}