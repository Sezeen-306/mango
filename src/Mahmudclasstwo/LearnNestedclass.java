package Mahmudclasstwo;

import Mahmudclasstwo.LearnNestedclass.Computer.Mobile;

public class LearnNestedclass {
	
	int num=20;
	int num1=30;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnNestedclass cm= new LearnNestedclass();
		System.out.println(cm.num);
		
		
		Computer com=new Computer();
		System.out.println(com.comprice);
		com.computerdisplay();
		
		
		Computer.Mobile mb= new Mobile();
		
	}
	
	public static class Computer{
		
		String computername="HP";
		static String comprice="2000";
		
		public static void computerdisplay() {
			System.out.println("computerdisplay");
		}
		
		
		public  static class Mobile {
			static String mobilebrand="brand";
			
		}
		
		}
		
	
	
	



}
