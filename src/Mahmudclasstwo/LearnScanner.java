package Mahmudclasstwo;
import java.util.Scanner;
public class LearnScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System is a class
		Scanner sc = new Scanner(System.in);
System.out.println("enter first name");
       String firstname= sc.next();
       
       System.out.println("enter second name");
       
       String lastname= sc.next();
       System.out.println("enter full name:" +firstname+" "+lastname);
// to close scanner
       sc.close();
	}

}
