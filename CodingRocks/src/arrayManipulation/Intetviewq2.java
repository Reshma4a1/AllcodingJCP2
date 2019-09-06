package arrayManipulation;

public class Intetviewq2 {

	public static void main(String[] args) {

		/*String s1 = new String("Reshma");
		String s2 = "abc";
		s1= s1+s2;
		System.out.println(s1);*/
		
		String s1="sapient";
		String s2 = new String("sapient");
		String s3 = "sapient";
		
		if(s1==s2)
		{
			System.out.println("s1 and s2 are equal");
		}
		else{
			System.out.println("s1 and s2 are not equal");
		}
		
		if(s2==s3)
		{
			System.out.println("s2 and s3 are equal");
		}
		else{
			System.out.println("s2 and s3 are not equal");
		}
	}

}
//string intern
//string pool - optimised and faster
