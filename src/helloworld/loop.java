package helloworld;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//disadvantage of while loop os if you dont have incremental part then it will infinite loop
		
		
		int i=0;// initialization
		
		while(i<10) { // conditional
		//    System.out.println(i);
		    i++;// incremental

		}
//pre increment
		int j=5;
		int k=++j;
	  System.out.println(j);

	    System.out.println(k);

	// post increment    
		int h=9;
		int u=h++;
		  System.out.println(h);
		  System.out.println(u);
		
		  
// post decrement
		  int f=6;
		  int t= f--;
		  System.out.println(f);
		  System.out.println(t);
		  
		  //pre decrement
		  
		  int d=6;
		  int c= --d;
		  System.out.println(d);
		  System.out.println(c);
		  


		
}

}
