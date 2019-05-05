object IndexNumber {
  def main(args: Array[String]): Unit = {

    def findFirst(as: List[Int], f: Int => Int): Int = {
      var x = scala.io.StdIn.readInt()

      if (as.contains(f(x))) {
        as.indexOf(f(x))
      }
      else {
        return -1
      }
    }

    val r = findFirst(List(1, 3, 5, 7, 27), x => x)
    println("the Index is = " + r)
  }
}
