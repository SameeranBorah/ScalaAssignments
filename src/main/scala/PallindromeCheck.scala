object PallindromeCheck {

  def main(args: Array[String]): Unit = {
    def palindromCheck (f1:(String,String)=>Boolean, f: (String)=>String,C:String): Boolean=f1(f(C),C)
    val check =(x:String,y:String) =>x==y
    val Reverse = (x: String) => x.reverse.toString()
    print(palindromCheck(check,Reverse,"10101101"))

  }
}


