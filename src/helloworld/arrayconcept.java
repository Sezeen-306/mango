package helloworld;

public class arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i[]= new int[4];
		i[0]=2;
		i[1]=3;
		i[2]=4;
		i[3]=5;
		
		//System.out.println(i[3]);
		System.out.println(i.length);
		
		for(int j=0; j<i.length; j++ ) {
			System.out.println(i[j]);
		}
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);
		
		System.out.println(b.length);
        for(int k=0;k<b.length;k++) {
	
	    System.out.println(b[k]);
	
	    
	    // array is static we can store same data type. yo overcome this issue we use Object array
	    // Object is a super class which starts with capital O
	    
	    Object ob[]= new Object[3];
	    
	    ob[0]=2;
	    ob[1]="Shishir";
	    ob[2]='S';
	    System.out.println(ob[1]);
	    
	    System.out.println(ob.length);
	    for(int p=0; p<ob.length; p++)
	    {
		    System.out.println(ob[p]);

	    }


	
}
		
		
	}

}
