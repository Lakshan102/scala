error id: file://<HOME>/Documents/UCSC%202024/scala/Practicalo6/P06_Q01.scala:[4430..4433) in Input.VirtualFile("file://<HOME>/Documents/UCSC%202024/scala/Practicalo6/P06_Q01.scala", "/* object InventorySystem extends App {

  // Define the inventory as a Map with product ID as key and a tuple of (name, quantity, price)
  var inventory1: Map[Int, (String, Int, Double)] = Map(
    101 -> ("ProductA", 50, 29.99),
    102 -> ("ProductB", 30, 19.99),
    103 -> ("ProductC", 20, 39.99)
  )

  var inventory2: Map[Int, (String, Int, Double)] = Map(
    102 -> ("ProductB", 10, 21.99),
    104 -> ("ProductD", 25, 49.99)
  )

  // I. Retrieve all product names from inventory1
  def getProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
    inventory.values.map(_._1).toList
  }

  // II. Calculate the total value of all products in inventory1
  def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  // III. Check if inventory1 is empty
  def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
    inventory.isEmpty
  }

  // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
  def mergeInventories(inventory1: Map[Int, (String, Int, Double)],inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    inventory2.foldLeft(inventory1) { case (acc, (id, (name, quantity, price))) =>
      acc.get(id) match {
        case Some((existingName, existingQuantity, existingPrice)) =>
          acc.updated(id, (existingName, existingQuantity + quantity, Math.max(existingPrice, price)))
        case None =>
          acc + (id -> (name, quantity, price))
      }
    }
  }

  // V. Check if a product with a specific ID (e.g., 102) exists and print its details
  def checkProductExists(inventory: Map[Int, (String, Int, Double)], id: Int): Unit = {
    inventory.get(id) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $id, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product ID: $id does not exist in the inventory.")
    }
  }
  println(inventory1);

  // Test the functions
  println("I. Product names in inventory1:")
  println(getProductNames(inventory1))

  println("\nII. Total value of all products in inventory1:")
  println(calculateTotalValue(inventory1))

  println("\nIII. Is inventory1 empty?")
  println(isInventoryEmpty(inventory1))

  println("\nIV. Merged inventory of inventory1 and inventory2:")
  val mergedInventory = mergeInventories(inventory1, inventory2)
  println(mergedInventory)

  println("\nV. Check if product ID 102 exists in inventory1:")
  checkProductExists(inventory1, 102)
}
 */
object Inventory{

  val inventory1: Map[Int,(String,Int,Double)] = Map(
    101 -> ("ProductA",50,29.99),
    102 -> ("ProductB",30,19.99),
    103 -> ("ProductC",20,39.99)
  )

  val inventory2:Map[Int,(String,Int,Double)]=Map(
    102 -> ("ProductB",10,21.99),
    104 -> ("ProductD",25,49.99)
  )
  def printInventory(inventory:Map[Int,(String,Int,Double)]):Unit={
    for((_,(name,_,_))<-inventory){
      println(s"Name: $name");
    }
  }
  def calculateTotalValue(inventory:Map[Int,(String,Int,Double)]):Unit={
    var totalValue:Double=0;
    for((_,(_,qty,price))<-inventory){
      totalValue += qty*price;
    }
    println("\nTotal value: Rs." + totalValue);
  }
  def checkEmpty(inventory:Map[Int,(String,Int,Double)]):Unit={
    if(inventory.isEmpty){
      println("\nInventory is empty\n");
    }else{
      println("\nInventory is not empty\n");
    }
  }
/*   def mergedInventory(inventory1:Map[Int,(String,Int,Double)],inventory2:Map[Int,(String,Int,Double)]):Unit={
    for((id,(name,qty,price))<-inventory1){
      for((id,(name,qty,price))<-inventory2){
        if(inventory1.id == inventory2.id){
          
        }
      }
    }
  } */
   def mergedInventory(inventory1: Map[Int, (String, Int, Double)],inventory2: Map[Int, (String, Int, Double)]): Unit = {
    var mergedInventory = inventory1

    for ((id2, (name2, qty2, price2)) <- inventory2) {
      if (mergedInventory.contains(id2)) {
        val (name1, qty1, price1) = mergedInventory(id2)
        mergedInventory = mergedInventory.updated(id2, (name1, qty1 + qty2, Math.max(price1, price2)))
      } else {
        mergedInventory += (id2 -> (name2, qty2, price2))
      }
    }
    for((id,(name,qty,price))<-mergedInventory){
      println(s"Id: $id  Name: $name  Qty: $qty  Price:$price");
    }
  }
  def 

  def main(args:Array[String]):Unit ={
    printInventory(inventory1);
    calculateTotalValue(inventory1);
    checkEmpty(inventory1);
    mergedInventory(inventory1,inventory2 );
  }
}

")
file://<HOME>/Documents/UCSC%202024/scala/Practicalo6/P06_Q01.scala
file://<HOME>/Documents/UCSC%202024/scala/Practicalo6/P06_Q01.scala:128: error: expected identifier; obtained def
  def main(args:Array[String]):Unit ={
  ^
#### Short summary: 

expected identifier; obtained def