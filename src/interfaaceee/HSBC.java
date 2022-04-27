package interfaaceee;

public class HSBC implements Usbank, Brazilbank{
	
	
public void cash(){
	
	System.out.println("cash");
	
}
	

	public void credit()
	{
		System.out.println("credit");

	}
	
	
	public void debit()
	{
		System.out.println("debit");

	}
	
	
	
	public void close() {
		System.out.println("close");
		
	}


}
