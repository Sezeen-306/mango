package Mahmudclasstwo;

public class LearnCasting {

	public static void main(String[]args) {
	int i= 119;
	double dub= (double)i;
	System.out.println("int to double "+ dub);
	
	double pricedouble= 78.90;
	int priceint= (int)pricedouble;
	System.out.println("double to int " + priceint);
	
	int number= 56;
	byte total=(byte)number;
	System.out.println("int to byte " +total);
	
	// different casting
	String name="567";
	int l=Integer.valueOf(name);
	//int l= Integer.parseInt(name);
	System.out.println("string to int "+ l);
	
	String address="9833747";
	double db= Double.parseDouble(address);
	System.out.println("string to double "+ db);
	
	//data conversion will give exception when string has number with words
	
	String bus="7685abc";
	int car= Integer.parseInt(bus);
	System.out.println("exception "+ car);

	

}
}