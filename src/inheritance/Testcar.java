package inheritance;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(Car.i);
		
		BMW bm= new BMW();
		bm.start();
		bm.honk();
		bm.wheel();
        bm.stop();
        System.out.println(bm.i);
		
		System.out.println("xxxxxxxxxx");
		
		Car c= new Car();
		c.start();
		c.honk();
	//	c.wheel();

		//dynamic polymorphism or top casting
		
		Car d= new BMW();
		d.start();
		d.honk();
		//d.wheel();\
		
		// down casting but it will give a cast exception
		
	//	BMW bb= (BMW)new Car();
         
		
		
	}

}
