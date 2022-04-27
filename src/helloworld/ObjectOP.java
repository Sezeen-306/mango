package helloworld;

public class ObjectOP {
	
	int i;
	int j;
	int k;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// new ObjectOP() is an object of ObjectOP class
		// car is a object reference variable 
		
		ObjectOP a= new ObjectOP();
		ObjectOP b= new ObjectOP();
		ObjectOP c= new ObjectOP();

		a.i= 10;
		b.j=30;
		c.k=40;
		System.out.println(a.i);
		System.out.println(b.j);
		
		// object reference variable is sharing value
		
		a=b;
		b=c;
		c=a;
		
		a.i=100;
	    System.out.println(a.i);
	    c.i=200;
		System.out.println(a.i);
 
				
          
		
		
	}

}
