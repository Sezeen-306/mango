package Mahmudclasstwo;

public class LearnConstructor {
	String straddres;
	String ssn;
	int age;
	double coursefee;
	String phoneNumber;
	String coursediscount;
	
	public LearnConstructor() {
		System.out.println("this is default constructor");
	}
	
	public LearnConstructor(String name) {
		System.out.println("name of student " + " " +name);
	}
	
	
	public LearnConstructor(String stname, String address) {
	String add=	this.straddres=stname;
		this.ssn=address;
		
		System.out.println("name of stadress " +add+ " ssn number is " +this.ssn);
	}
	
	public LearnConstructor(String addr, String ssn, int age, double coursefee, String phoneNumber) {
       
	this.straddres= addr;
	this.ssn= ssn;
	this.age= age;
	this.coursefee= coursefee;
	this.phoneNumber= phoneNumber;
	
	
	System.out.println("name of stadress " +this.straddres+ " ssn number is " +this.ssn+ " student age is " +this.age+ 
			" coursefee is " +this.coursefee+ " phonenumber is" +this.phoneNumber);

	
	}

	
	
// we can do some calculations	
	
	public LearnConstructor(int coursefee) {
		
		this.coursefee= coursefee;
		
		double afterdiscount=this.coursefee*.90;
		
		System.out.println("after discount course fee is  "+afterdiscount);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	LearnConstructor lc= new LearnConstructor();
		
	//	LearnConstructor nm= new LearnConstructor("nabila");
		//LearnConstructor nm2= new LearnConstructor("shishir");

		
		//LearnConstructor nm3= new LearnConstructor("Jamaica", "11234");

		LearnConstructor nm4= new LearnConstructor("queens", "76543", 34, 5000.500, "9292319188" );
		LearnConstructor nm5= new LearnConstructor(5000);

	}

}
