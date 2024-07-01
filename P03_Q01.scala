object reverse_string{
    def get_input():String={
        println("Enter String : ");
        val text= scala.io.StdIn.readLine();
        return text;
    }
    def reverse(txt:String): String={
        if (txt.isEmpty){
            ""
        }
        else{
            reverse(txt.tail) + txt.head
        }
    }
    def main(arr:Array[String]):Unit={
        val Text=get_input();
        
        val reverse_txt=reverse(Text);
        println("Reverse String: "+reverse_txt);
    }
}