import scala.io.StdIn.readInt;
object PatternMatching {
  def main(args: Array[String]): Unit = {
        println("Enter an Integer: ")
        val input = readInt()
        input match {
          case x if x <= 0 => println("Negative/Zero is input")
          case x if x % 2 == 0 => println("Even number is given")
          case _ => println("Odd number is given")
        }
    } 
}