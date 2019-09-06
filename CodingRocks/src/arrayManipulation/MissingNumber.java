package arrayManipulation;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		//1.perform sum of numbers
		//2.do sum of the sequence
		
		//int a[] ={1,2,3,4,5,6,7,8};
		
		
		int a[] ={1,3,5,6,7,8,4,2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		
		int sum1=0;
		for( int j=1;j<=9;j++)
		{
			sum1 = sum1+j;
		}
		
		int sum2 = sum1-sum;
		System.out.println(sum2);
		
		
		
	}

}
