package helloworld;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ml= new Methodoverloading();
		ml.sum();
	    ml.sum(20);
	    ml.sum(40, 50);
	    
		
	}
	
	public static void main(String a) {

		System.out.println("abc");
	}
	
	public void sum() {
		System.out.println("sum1");
	}

	public void sum(int i) {
		System.out.println("sum1");

		
	}
	
	public void sum(int i, int k) {
		System.out.println("sum1");

		
	}
}
