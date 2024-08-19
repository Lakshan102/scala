import scala.io.StdIn
object patternMatching{
    val input =(value:Int) => value match{
        case value if value <= 0 => println("Negative/Zero")
        case value if value % 2 == 0 => println("Even number")
        case value if value % 2 != 0 => println("Odd number")
    }
    def main(args: Array[String]): Unit = {
        println("Enter integer value:")
        val getInput=StdIn.readInt()

        input(getInput);
    }
}