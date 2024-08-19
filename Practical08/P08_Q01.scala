object CaesarCiper {

    def Encrypt(shift:Int,text:String): String ={
    val newText = new StringBuilder
    val adjustedShift = shift % 26
    for (i <- 0 until text.length) {
      val textValue = text(i).toInt
      val textEncrypt = if (textValue >= 65 && textValue <= 90) { 
                        ((textValue - 65 + adjustedShift +26) % 26 + 65).toChar
                    }
                    else if (textValue >= 97 && textValue <= 122) { 
                        ((textValue - 97 + adjustedShift +26) % 26 + 97).toChar
                    } else { 
                        text(i)
                    }
      newText.append(textEncrypt)
    }
    newText.toString()
    }

    def Decrypt(shift:Int,text:String): String = {
    val newText = new StringBuilder
    val adjustedShift = shift % 26
    for (i <- 0 until text.length) {
      val textValue = text(i).toInt;
      val textDecrypt = if (textValue >= 65 && textValue <= 90) { 
                      ((textValue - 65 - adjustedShift + 26) % 26 + 65).toChar
                    } else if (textValue >= 97 && textValue <= 122) {
                      ((textValue - 97 - adjustedShift + 26) % 26 + 97).toChar
                    } else { 
                      text(i)
                    }
      newText.append(textDecrypt)
    }
    newText.toString()
    }

    def main(arg: Array[String]) : Unit = {
        val shift = 1;
        val text = "Av!@#";
        println("\n\n------------------------------------");
        
        val newString = Encrypt(shift,text); 
        println(s"The text after encryption is $newString");
        println("-----------------------------------");
        println("\n------------------------------------");
        val newString1 = Decrypt(shift,newString);
        println(s"the text after decryption is $newString1");
        println("------------------------------------");
    } 

}

