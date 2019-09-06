package arrayManipulation;

public class ArrayComparision {
	
	
	/*
	 *output expected
	 *1.Missing elements in b compared to a
	 *2.Common elements in both the arrays
	 *
	 */
	public static void main(String[] args){
		arrayComp();
	}
	
	
 
	static int a[] = { 1, 2, 6, 3, 4, 5 }; 
	static  int b[] = { 2, 4, 3, 1, 6}; 
	
	public static void arrayComp(){
		int n = a.length; 
        int m = b.length; 
		
        /*for (int i = 0; i < n; i++) 
        { 
            int j; 
              
            for (j = 0; j < m; j++) 
                if (a[i] == b[j]) 
                    break; 
  
            if (j == m) 
                System.out.print(a[i] + " "); 
        } 
    } */
        
        for (int i = 0; i < n; i++) 
        { 
            int j; 
              
            for (j = 0; j < m; j++) 
                if (a[i] == b[j]) 
                     System.out.println(a[i]);
        } 
    } 
		}
		
	


