object Inventory {
  var itemName: Array[String] = Array("Maliban Chocolate Biscuit", "Maggi Noodles", "Coca Cola Bottle", "Samaposha Packet")
  var quantity: Array[Int] = Array(50, 24, 62, 81)

  def displayInventory(): Unit = {
    println("Inventory:")
    for (i <- itemName.indices) {
      println(s"\n${itemName(i)}: ${quantity(i)}")
    }
  }

  def restockItem(item_name: String, qty: Int): Unit = {
    val index = itemName.indexOf(item_name)
    if (index >= 0) {
      quantity(index) += qty
      println(s"\nRestocked $qty of $item_name. New quantity: ${quantity(index)}")
    } else {
      println(s"Item $item_name does not exist in inventory.")
    }
  }

  def sellItem(item_name: String, qty: Int): Unit = {
    val index = itemName.indexOf(item_name)
    if (index >= 0) {
      if (quantity(index) >= qty) {
        quantity(index) -= qty
        println(s"\nSold $qty of $item_name. New quantity: ${quantity(index)}")
      } else {
        println(s"Not enough $item_name in inventory to sell. Current quantity: ${quantity(index)}")
      }
    } else {
      println(s"Item $item_name does not exist in inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Maggi Noodles", 10)
    sellItem("Coca Cola Bottle", 5)
    sellItem("Maliban Chocolate Biscuit", 60)
    restockItem("Oreo Biscuit", 20)
    sellItem("Maggi Noodles", 30)
    displayInventory()
  }
}
