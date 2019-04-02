//Scala Classes
//var     getter    setter
//val     getter    ----
//default    --      ----


class User(private var name: String, var age: Int){
  def printName{println(name)}
};

object Class_Example {

  def main(args: Array[String]) {
    var user = new User("Deepak", 24);
    user.printName ;
    println(user.age);
    
  }
}