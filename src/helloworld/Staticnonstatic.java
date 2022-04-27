package helloworld;

public class Staticnonstatic {

	
	  String name="Tom";
	    static int k=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticnonstatic st=new Staticnonstatic();
		System.out.println(st.name);
		System.out.println(k);
		st.sum();
		rum();

	}
	
	public static void rum()
	{
		System.out.println("abc");
	}
	public void sum() {
		System.out.println("def");

	}

}



