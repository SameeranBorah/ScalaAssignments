object ReversingTailRecur {

  def main(args: Array[String]): Unit = {
    def reverse_tail(s: String): String = {
      @scala.annotation.tailrec
      def impl(ss: String, r: String): String = {
        if (ss == null) return null
        if (ss.tail.isEmpty) return ss.head + r
        impl(ss.tail, ss.head + r)
      }
      impl(s, "");
    }
    print(reverse_tail("3698547895"))
  }
}
