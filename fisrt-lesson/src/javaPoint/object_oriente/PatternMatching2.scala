package javaPoint.object_oriente

object PatternMatching2 {

  def main(args: Array[String]): Unit = {
    val result = search("Hello")
    println(result)
  }

  def search(data: Any): Any = data match {
    case 1 => println("One")
    case "Two" => println("Two")
    case "Hello" => println("Hello")
    case _ => "None"
  }

}
