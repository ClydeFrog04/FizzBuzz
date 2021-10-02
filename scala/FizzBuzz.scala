object FizzBuzz {
  
  var fizz = Array(0x46, 0x75, 0x63, 0x6b);
  var buzz = Array(0x54, 0x68, 0x69, 0x73);
  def main(args: Array[String]): Unit = {
      for(i <- 1 to 100){
        println(getFizzBuzz(i));
      }
  }
  
  def getFizzBuzz(n: Int): String = {
    var out: String = "";
    val test1: Int = 3;
    val test2: Int = 5;
    
    if(n % test1 == 0){
      out += charArrToString(fizz);
    }
    if(n % test2 == 0){
      out += charArrToString(buzz);
    }
    
    if(out.length == 0) out += n;
    
    return out;
  }
  
  def charArrToString(input: Array[Int]): String ={
    var out: String = "";
    for(n <- input){
      out += n.toChar;
    }
    return out; 
  }
}