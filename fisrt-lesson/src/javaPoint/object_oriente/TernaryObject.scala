package javaPoint.object_oriente

object TernaryObject {

  def checkIt(value: Int): Int = if (value > 0) 1 else -1

  def main(args: Array[String]): Unit = {
    val result = checkIt(-10)
    println(result)
  }
}
