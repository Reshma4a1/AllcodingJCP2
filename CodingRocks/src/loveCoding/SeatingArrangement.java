package loveCoding;


import java.util.*;
import static java.lang.System.out;
public class SeatingArrangement {
  
       
    public static void main(String args[] ) throws Exception {
           Scanner s = new Scanner(System.in);
           
     
 
    int t, n;
    t = s.nextInt();
  
    while(t != 0)
    {
       
         n = s.nextInt();
 
        switch(n%12)
        {
            case 1: out.printf("%d WS\n",n+11);
                    break;
            case 2: out.printf("%d MS\n",n+9);
                    break;
            case 3: out.printf("%d AS\n",n+7);
                    break;
            case 4: out.printf("%d AS\n",n+5);
                    break;
            case 5: out.printf("%d MS\n",n+3);
                    break;
            case 6: out.printf("%d WS\n",n+1);
                    break;
            case 7: out.printf("%d WS\n",n-1);
                    break;
            case 8: out.printf("%d MS\n",n-3);
                    break;
            case 9: out.printf("%d AS\n",n-5);
                    break;
            case 10: out.printf("%d AS\n",n-7);
                    break;
            case 11: out.printf("%d MS\n",n-9);
                    break;
            case 0: out.printf("%d WS\n",n-11);
                    break;        
        }
    t--;
   
}
    } 
    
    }
