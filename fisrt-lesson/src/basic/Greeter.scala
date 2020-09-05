package basic

class Greeter(prefix: String, suffix: String) {
  def greet(name: String): Unit = println(String.format("%s %s %s",prefix, suffix, prefix))

  def main(args: Array[String]): Unit = {
    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Aqil")
  }

}
