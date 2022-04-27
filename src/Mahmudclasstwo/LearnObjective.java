package Mahmudclasstwo;

public class LearnObjective {

	int sch=20;
	int cls=90;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnObjective ob= new LearnObjective();
		System.out.println(ob.sch);
	// can we create another class object in diff class:: YES	
		LearnEscapeSequence obj= new LearnEscapeSequence();
		obj.road();
	int u=obj.rd=50;
	System.out.println(u);
	}

}
