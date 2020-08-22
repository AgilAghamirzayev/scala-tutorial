package javaPoint.object_oriente

object PatternMatching1 {
  def main(args: Array[String]): Unit = {
    var a = 1;
    a match {
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("None")
    }
  }
}
