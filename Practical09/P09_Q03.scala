object printName{
    val toUpper= (name:String) => name.toUpperCase()
    val toLower= (name:String) => name.toLowerCase()

    def formatNames(name:String)(formatFunction:String => String):String = formatFunction(name)

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny")(toUpper))
        println(formatNames("Niroshan")(name => name.substring(1,2).toUpperCase() + name.substring(2).toLowerCase()))
        println(formatNames("Saman")(toLower))
        println(formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1) + name.substring(name.length - 1).toUpperCase)) 
    }
}