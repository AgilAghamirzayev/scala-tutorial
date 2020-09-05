package rockthejvm

object TypeLevelProgramming {


  // boilerplate
  import scala.reflect.runtime.universe._
  def show[T](value: T)(implicit tag: TypeTag[T]) = tag.toString().replace("content.TypeLevelProgramming.","")

  // type-level programming
  

  def main(args: Array[String]): Unit = {
    println(show(List(1,2,3)))
  }
}
