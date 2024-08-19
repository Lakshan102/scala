object NewList {
  def main(args: Array[String]): Unit = {
    val strings = getInput()
    val filteredStrings = filterStrings(strings)
    println(s"Filtered strings: ${filteredStrings.mkString(", ")}")
  }

  def getInput(): List[String] = {
    println("How many strings are you entering?")
    val size = scala.io.StdIn.readInt()
    var strings = List[String]()
    
    for (_ <- 1 to size) {
      println("Enter a string:")
      val str = scala.io.StdIn.readLine()
      strings = strings :+ str
    }
    
    strings
  }

  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

}