package loveCoding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ASCIIcode {
	
	//Input: AcBCbDEdea
	//Output: ABCDEabcde
	
	/**
	 * 1.Convert the string into char array
	 * 2.get the ascii of char
	 * 3.store and sort the values
	 * 4.get the values of ascii values
	 *
	 */
	

		
		/*String input = "AcBCbDEdea";
		String output = "";
		
		System.out.println(input);
		char[] b = input.toCharArray();
		int ascii_values[] = new int [b.length];
		for(int i=0;i<b.length;i++){
			
			ascii_values[i] = (int)b[i];
			//System.out.println(ascii_values[i]);
			
		}
		Arrays.sort(ascii_values);
		
		for(int j =0;j<ascii_values.length ;j++){
		//System.out.println(ascii_values[j]);
		output = output+(char)ascii_values[j];
		
		}
		System.out.println(output);
	}*/
	
		/*
		int[] array = new int[4];
		Scanner scan = new Scanner(System.in);
		
		for(int i =0;i<array.length; i++)
		{
			
			array[i] = scan.nextInt();
		}
		
		int sum =0;
		
		for(int j=0;j<array.length;j++)
		{
			sum = sum+array[j];
		}
		
		
		System.out.println(sum);*/
		/*
			Scanner scan = new Scanner(System.in);
			int L = scan.nextInt();
			int R = scan.nextInt();
			
			for(int i = L ;i<= R;i++){
				System.out.println(i + " ");
			}*/
	

		
		
		    public static void main(String args[] ) throws Exception {
		        
		        Scanner br = new Scanner(System.in);
		        int n = br.nextInt();
		      //  int t = br.nextInt();
		        
		     if(n==1)   
		     {
		    	 System.out.print("Yes");
		     }
		       
		      if(n!=1)
		            {
		                if(n%2==0)
		                {
		                    n = n/2;
		                   System.out.println(n);
		                }
		                else
		                {
		                n = (3*n)+1;
		                System.out.println(n);
		                
		                }
		                
		            }
		            
		      
}

}