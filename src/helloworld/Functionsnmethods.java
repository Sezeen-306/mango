package helloworld;

public class Functionsnmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functionsnmethods fm= new Functionsnmethods();
		int h=fm.bus();
		System.out.println(h);
		fm.car();
		int u=fm.van(20, 50);
		System.out.println(u);
	}
	
	
	public void car() {
		System.out.println("boom");
	}

	public int bus() {
		int i=3;
		int b=4;
		int c=i+b;

	return c;
	}
	
	public int van (int j,int k) {
		System.out.println("boom 3");
		int p=j+k;
		return p;
		
	}
	
	
}
