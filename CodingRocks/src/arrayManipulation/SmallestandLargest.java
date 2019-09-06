package arrayManipulation;

import java.util.Arrays;

public class SmallestandLargest {

	public static void main(String[] args) {
		
		int numbers [] = {12,20,30,80,-1,-10};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
		
			else if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
		}
		
		System.out.println("The given array is : " + Arrays.toString(numbers));
		System.out.println(largest);
		System.out.println(smallest);
	}

}
