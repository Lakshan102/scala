object Fibonacci{
    def input():Int={
        print("Enter the number of terms: ")
        var number=scala.io.StdIn.readInt()
        return number
    }

    def fibonacci(n:Int):Int={
        if(n==0){
            return 0
        }
        else if(n==1){
            return 1
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2)
        }
    }
    
    def printFibonacci(n:Int):Unit={
        for(i<-0 to n-1){
            print(fibonacci(i)+" ")
        }
    }   
    
    def main(args: Array[String]):Unit={
        val number=input()  
        printFibonacci(number)
    }
}