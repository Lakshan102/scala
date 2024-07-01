object EvenSum {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    val sumOfEvens = sumEvenNumbers(numbers)
    println(s"The sum of even numbers in the list is $sumOfEvens")
  }

  def sumEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }
}