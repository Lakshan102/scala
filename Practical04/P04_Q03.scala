import scala.io.StdIn.readLine

object StringFormatter {
  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input: String): String = {
    input.toLowerCase
  }

  def formatName(a: String, b: String => String): String = {
    b(a)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a string: ")
    val input = readLine()

    println("Choose an option (1 for upper case, 2 for lower case): ")
    val option = readLine()

    val formattedString = option match {
      case "1" => formatName(input, toUpper)
      case "2" => formatName(input, toLower)
      case _ => "Invalid option"
    }

    println(s"Formatted string: $formattedString")
  }
}
