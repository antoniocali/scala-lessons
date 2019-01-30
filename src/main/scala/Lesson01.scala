object Lesson01 {

  def factorial(num: Int): Int = ???

  def gcd(a: Int, b: Int): Int = ???

  def fib(elem: Int): Int = {
    def loop(elem: Int, prev: Int, cur: Int): Int = ???
    loop(elem, 0, 1)
  }

  private def sqrtNewton(guess: Double, num: Double): Double = ???

  //Usefull Functions for sqrtNewton
  def sqrt(n: Double): Double = sqrtNewton(1.0, n)

  private def improve(guess: Double, num: Double): Double = ???

  private def isGoodEnough(guess: Double, num: Double): Boolean =
    math.abs(guess * guess - num) < 0.001

}
