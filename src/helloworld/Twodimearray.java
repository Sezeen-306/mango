package helloworld;

public class Twodimearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String i[][]= new String[2][3];
		
		// row of array
        System.out.println(i.length);
         // Col of array
        System.out.println(i[0].length);
		
        i[0][0]="Cat";
        i[0][1]="dog";
        i[0][2]="car";
      
        
        i[1][0]="peter";
        i[1][1]="nab";
        i[1][2]="shi";
       
        
        // all values print out
        
        for(int row=0;row<i.length;row++) {
        	for(int col=0;col<i[0].length; col++) {
        		System.out.println(i[row][col]);
        	}
        }


	}

}
