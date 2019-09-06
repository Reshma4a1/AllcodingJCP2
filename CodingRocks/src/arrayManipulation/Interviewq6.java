package arrayManipulation;

public class Interviewq6 extends Interviewq5 {
	
	
	public void m1(){
		System.out.println("m1 child  method");
	}
	
	public void m2(){
		System.out.println("m2 child method");
	}
	
	public void m3(){
		System.out.println("m3 child method");
	}

	public static void main(String[] args) {
		
		//Interviewq5 obj = new Interviewq6();
		//obj.m3();
		
		Interviewq5 obj = new Interviewq5();
		
		Interviewq6 obj1 = (Interviewq6) obj;
		obj1.m3();
	
	}

}
