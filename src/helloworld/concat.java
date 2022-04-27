package helloworld;

public class concat {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=30;
		String c="hello";
		String d="world";
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(c+d+a+b);
		System.out.println(c+d+(a+b));
		System.out.println("hi i am " + " " +a+b);

		System.out.println("hi i am " + " " +(a+b));
		
		int j=90;
		int k=100;
		int l=100;
		
		if (j==k && j==l) {
			System.out.println(a+b);

		}
		else if (j==k || k==l) {
		
			System.out.println("Nabila");
		}
		
		else {
			System.out.println(c+d);

			
		}


	
	}

}
