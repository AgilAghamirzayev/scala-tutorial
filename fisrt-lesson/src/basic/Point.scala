package basic

/**
 * Scala has a special type of class called a “case” class. By default, instances of
 * case classes are immutable, and they are compared by value (unlike classes, whose
 * instances are compared by reference). This makes them additionally useful for pattern matching.
 */
case class Point(x: Int, y: Int) {

  val point: Point = Point(1, 2)
  val anotherPoint: Point = Point(1, 2)
  val yetAnotherPoint: Point = Point(2, 2)

  if (isSame(point, anotherPoint))
    println(printIsSame(point, anotherPoint))   // Point(1,2) and Point(1,2) are the same.
  else
    println(printIsDifferent(point, anotherPoint))

  if (isSame(point, yetAnotherPoint))
    println(printIsSame(point, anotherPoint))
  else
    println(printIsDifferent(point, anotherPoint)) // Point(1,2) and Point(2,2) are different.

  def printIsSame(first: Point, second: Point): String = String.format("%s and %s are the same.", first, second)

  def printIsDifferent(first: Point, second: Point): String = String.format("%s and %s are the same.", first, second)

  def isSame(first: Point, second: Point): Boolean = first == second
}
