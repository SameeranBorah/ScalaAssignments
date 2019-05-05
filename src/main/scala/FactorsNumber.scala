import scala.annotation.tailrec
object FactorsNumber {
  def main(args: Array[String]): Unit = {
    def factorize(x: Int): List[Int] = {
      @tailrec
      def foo(x: Int, a: Int = 2, list: List[Int] = Nil): List[Int] = a * a > x match {
        case false if x % a == 0 => foo(x / a, a, a :: list)
        case false => foo(x, a + 1, list)
        case true => x :: list
      }

      foo(x)
    }
    print(factorize(15))
  }
}
