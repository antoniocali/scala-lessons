import org.scalatest.FunSuite

class Lesson01Test extends FunSuite {


  val factorialList = List((3,6),(0,1),(1,1),(5,120))
  factorialList.foreach {
    case (input, output) =>
      test(s"$input! equals to $output") {
        assert(Lesson01.factorial(input) == output)
      }
  }

  val sqrtList = List((4.0, 2.0), (1.0, 1.0), (16.00, 4.0))
  sqrtList.foreach {
    case (input, output) =>
      test(s"Square Root of $input equals to $output") {
        assert(math.abs(Lesson01.sqrt(input) - output) < 0.001)
      }
  }

  val fibList = List((4, 3), (5, 5), (6, 8), (0, 0), (1, 1))
  fibList.foreach {
    case (input, output) =>
      test(s"$input-th Fibonacci Number equals to $output") {
        assert(Lesson01.fib(input) == output)
      }
  }

  val gdcList = List((52,100,4), (6,6,6), (3,2,1), (10,5,5), (36,12,12))

  gdcList.foreach {
    case (input1, input2, output) =>
      test(s"Greatest Common Divisor between $input1 and $input2 should be $output") {
        assert(Lesson01.gcd(input1,input2) == output)
      }
  }
}
