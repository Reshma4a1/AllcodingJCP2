package loveCoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversenotFirstelement {
	
	//Input : Qapitol Qap
	//output : Qlotipa Qpa
	
	public static void reverse(){
	String s1 = "Qapitol Qap";
	
	Pattern p = Pattern.compile("Q");
	//Matcher m = p.matcher(s1);
	String[] temp = p.split(s1);
	String reverse = "";
	for(String s2:temp){
		
		//System.out.print(s2.charAt(0));
		for(int i=s2.length()-1;i>=0;i--)
		{
		reverse = reverse+s2.charAt(i);	
		
		}
		
		reverse = reverse+" ";
	
	}
	System.out.println(reverse);
	}
	
	public static void main(String[] args)
	{
		reverse();
		
	}

}
