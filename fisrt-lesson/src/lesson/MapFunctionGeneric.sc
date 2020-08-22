def map[A,B](f: (A) => B, list: Seq[A]) : Seq[B] = {
  for {
    x <- list
  } yield f(x); // apply f to each element x
}

val nums = List(1,2,3)
nums: List[Int]

def double(i: Int):Int = i * 2

map(double, nums)