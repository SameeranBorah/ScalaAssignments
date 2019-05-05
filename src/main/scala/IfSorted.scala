object IfSorted {

  def main(args: Array[String]): Unit = {
    def SortCheck[A](as: Array[A], gt: (A,A) => Boolean): Boolean = {
      //@annotation.tailrec
      def iter(i: Int): Boolean = {
        if (i >= as.length - 1) true
        else !gt(as(i), as(i + 1)) && iter(i + 1)
      }
      iter(0)
    }
    print( SortCheck(Array(0,1,3,6), (a: Int, b: Int) => a > b))
  }


}
