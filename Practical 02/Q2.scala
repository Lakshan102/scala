def Math2={
	var a:Int=2;
	var b:Int=3;
	var c:Int=4;
	var d:Int=5;
	var k=4.3F;
	
	b -= 1;//pre decrement b
	val D:Int =5;
	d -= 1; //post decrement d
	val result1:Int=b * a + c *D;
	
	println( "--b * a + c *d-- ="+ result1);
	
	val A:Int =2;
	a += 1;//post increment a
	val result2:Int = A;
	
	println("a++ = "+A);
	
	//val result3:Int = (-2)*(g-k)+c;
	//println ("–2*(g–k)+c =" + result3); //Not found: g  
	
	val C:Int =4;
	c += 1;//c post increment
	
	println ("c=c++  ="+C);
	
	c += 1;//c pre increment
	val A2:Int= a;
	a += 1;//a post increment
	c=c*A2;
	println ("c=++c*a++ ="+c);
}