package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurncesofword {
	
	public static void main(String[] agrs){
		
		//1.Pattern matching 
		/*int count =0;
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abaabaaab");
		while(m.find()){
			count++;
			System.out.println(m.start() + "......."+ m.end() + "....." + m.group());
		}
		
		System.out.println("Total number of occurrences : "+count);*/
		
		//2.Using split method
		Pattern p = Pattern.compile("[.]");
		String[] s = p.split("Durga.software.solutions");
		for(String s1:s){
			System.out.println(s1);
		}
		
		
		
	}

}
