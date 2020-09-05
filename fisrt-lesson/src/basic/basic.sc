val x = 1 + 1
println(x)

val y: Int = 1+1
// val we can't declared again
// var we can declare again

var z = 1 + 1
z=1+1+1
println(z)

println({
  val x = 1 + 1
  x + 3
})


// Functions
// Functions are expressions that have parameters, and take arguments.
val addOne = (x: Int) => x + 1
println(addOne(7))

val add = (x: Int, y: Int) => x+y;
println(add(1,1))

// Methods
// Methods look and behave very similar to functions, but there are a few key differences between them.
def add01(x: Int, y: Int): Int = x + y;
println(add01(1,1))


def addThenMultiply(x: Int, y:Int)(multiplier: Int): Int = (x+y) * multiplier
println(addThenMultiply(1,2)(3))

def name: String = System.getProperty("user.name")
println(String.format("Hello, %s!", name))

def getSquareString(input: Double): String = {
  val square = input * input;
  square.toString
}

println(getSquareString(44.02))