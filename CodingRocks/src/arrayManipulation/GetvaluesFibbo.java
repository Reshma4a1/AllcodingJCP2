package arrayManipulation;

import java.util.Arrays;

public class GetvaluesFibbo {
	
	//Input = [1,3,4,7,8,0];
	//fibnoacci = [0,1,1,2,3,5,8,13]
	//output =[1,3,3,4,7,0]
	
	/*
	 * Algorithm:
	 * 1.code to fibnoacci
	 * 2.
	 * 
	 */
	
	public static void main(String[] args){
		int input[] = {11,12,13,14,15,16,17,18,19,20};
		int fib[] = new int[input.length];
		fib[0] = 0;
		fib[1] = 1;

		for(int  i=2 ;i<fib.length;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		System.out.println(Arrays.toString(fib));
		
		for(int i = 0; i<fib.length; i++) {
			if(input[i] < fib[fib.length-1]) {
				System.out.println(input[fib[i]]);
			}
			else {
				System.out.println("No elements in input array matching the fibonacci index");
			}
		}
	}

}
