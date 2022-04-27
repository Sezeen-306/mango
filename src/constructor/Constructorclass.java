package constructor;

public class Constructorclass {

	
	String name;
	int age;
	
	
	public Constructorclass() {
	      System.out.println("lll");

	}
	public Constructorclass(String name, int age) {
      this.name=name;
      this.age=age;
       
  // printing with global var     
       System.out.println(this.name);
       System.out.println(this.age);
  
       // printing only parameter 
       System.out.println(name);
       System.out.println(age);

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorclass s= new Constructorclass();


		Constructorclass cs= new Constructorclass("ioe", 34);
		
		
	}

}
