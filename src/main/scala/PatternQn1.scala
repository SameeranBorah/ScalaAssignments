object PatternQn1 {
  def main(args: Array[String]): Unit = {
    print("Enter a Number:- ");
    val n=scala.io.StdIn.readInt();

    for (a<-1 to n){
      var num = 65;

      for (b<-1 to a){

        print(num.toChar+" ");
        num = num +1;
      }
      println();
    }

  }
}
