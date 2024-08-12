object NumberCategorizer extends App {

  // Function to categorize the number
  val categorizeNumber: Int => String = {
    case n if n % 3 == 0 && n % 5 == 0 => "Multiple of Both Three and Five"
    case n if n % 3 == 0 => "Multiple of Three"
    case n if n % 5 == 0 => "Multiple of Five"
    case _ => "Not a Multiple of Three or Five"
  }

  // Prompt the user to enter a number
  print("Please enter an integer: ")
  val input = scala.io.StdIn.readLine()

  // Try to convert the input to an integer
  try {
    val inputNumber = input.toInt
    // Categorize and print the result
    println(categorizeNumber(inputNumber))
  } catch {
    case _: NumberFormatException => println("Please provide a valid integer.")
  }
}

