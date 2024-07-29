import scala.io.StdIn.readLine

object InventoryManagementSystem {

  def getProductList: List[String] = {
    def promptProducts(products: List[String]): List[String] = {
      println("Enter a product name (or type 'done' to finish):")
      val input = readLine().trim
      if (input.equalsIgnoreCase("done")) products
      else promptProducts(products :+ input)
    }
    promptProducts(Nil)
  }

  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.size
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList
    println("Product List:")
    printProductList(productList)
    val totalProducts = getTotalProducts(productList)
    println(s"Total number of products: $totalProducts")
  }
}


