package helloworld;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		
		// data conversion string to int
	int i=	Integer.parseInt(x);
		System.out.println(i);
		// data conversion string to double
		
		String y="12.25";
	double k=	Double.parseDouble(y);
     System.out.println(k+10);
	
	
	// data conversion not full string to int 
     String o="1000aa";
    // it will give an numberformatexception
    
	
	}

}
