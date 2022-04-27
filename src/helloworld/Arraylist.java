package helloworld;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //my try ignore

		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add("sayeed");
		ar.add(30.55);
		ar.add(true);
		
	System.out.println(ar.size());
		
	System.out.println(ar.get(1));
	
	for(int i=0; i<ar.size();i++) {
		
		System.out.println(ar.get(i));

	}

	ArrayList<Integer>al=new ArrayList<Integer>();
       al.add(8);
		
	}

}
