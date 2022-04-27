package interfaaceee;

import inheritance.Car;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Usbank.i=78;
		
		System.out.println(Usbank.i);
		

		
		HSBC hs= new HSBC();
		hs.cash();
		hs.credit();
		hs.debit();
		
		System.out.println("dynamic polymorphism");
		
		Usbank us=new HSBC();
		us.cash();
	    //us.debit();
		
		
		
	}

}
