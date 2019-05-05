object PatternQn2 {

  def main(args: Array[String]): Unit = {
    print("Enter a Number:- ");
    val n: Int =scala.io.StdIn.readInt();
    for (a<-1 to n){
      print(a+" ")
    }
    println()
    for (c<-2 to 4) {
      for (i <- n*c to n*c-6 by -1)
      {
        print(i+" ");
      }
      println()
    }
  }
}
