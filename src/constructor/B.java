package constructor;


public class B extends A{

	public B() {
		super();
	}
	
	public B(int i) {
		super(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ChildConstructor cs=new ChildConstructor();		
		B ci=new B(100);
//		
		B cij=new B();
	
}}
