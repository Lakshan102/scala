import scala.io.StdIn
object interest{
    val flat=(deposit:Double,flat:Double) => deposit * flat/100;

    def chooseFlat(amount:Double):Double={
        amount match{
            case amount if amount <= 20000 => flat(amount,2.0)
            case amount if amount <= 200000 => flat(amount,4.0) 
            case amount if amount <= 2000000 => flat(amount,3.5)
            case _ => flat(amount,6.5)
        }
    }
    
    def main(args: Array[String]): Unit = {
        println("Enter amount of deposite:");
        val amount= StdIn.readDouble()

        println("The actual amount of interest that the money earns in a year: Rs." + chooseFlat(amount))
    }
}