def Normal(normal:Int):Int={
	val Normal_Salary = normal*250;
	
	return Normal_Salary;
}

def OT(ot:Int):Int={
	val OT_Salary = ot*85;
	
	return OT_Salary;
}

def Total(h1:Int,h2:Int):Int={
	val total = Normal(h1)+OT(h2);
	
	return total;
}
def Tax(h1:Int,h2:Int):Double={
	val tax = Total(h1,h2)*12/100;
	
	return tax;
}

def LastSalary(h1:Int,h2:Int):Double={
	val last = Total(h1,h2)-Tax(h1,h2);
	
	println(s"The take home salary = Rs.$last");
	last
}