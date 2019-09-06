package loveCoding;

import java.util.Scanner;

public class PrimeNUmber {
	
	//9 - 2 3 5 7
	
	public static void main(String args[] ) throws Exception {
		
		
		/*int flag=0;
		
        
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        
       for(int i = 2;i<n;i++)
       {
    	   if(n % i ==0)
    	   {
    		   System.out.println("not a prime");
    		   flag=1;
    		   break;
    		   
    	   }
    	   
       }
       
      if(flag==0){
    	  System.out.println("prime");
      }
      
	*/
		
		
		int num =0;
		String primenumbers = "";
		
		for(int i =1;i<=100;i++)
		{
			int counter = 0;
			for(num = i;num>=1;num --)
			{
				if(i%num == 0)
				{
					counter = counter +1;
					
				}
			}
			if(counter == 2)
			{
				primenumbers = primenumbers+ i+ " ";
				
									}
		}
		
	System.out.println(primenumbers);

}
}
