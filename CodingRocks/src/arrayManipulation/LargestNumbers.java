package arrayManipulation;

public class LargestNumbers {
	
	public static void main(String[] args)
	{

		largestmethod();
		
	}
	
	//First largest number
	
	public static void largestmethod() {

		int a[] = { 11, 12, 8, 13};
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					max = a[i];
					

				}
			}
		}
		System.out.println(max);
		
	}
	
	//second largest numbers
	public static void Secondlargestmethod()
	{
		int a[] = { 11, 12, 8, 13, 22, 3 };
		int secondmax =0;
		
		//for()
		
		
	
	}
	
}
