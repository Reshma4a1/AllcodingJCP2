package loveCoding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		anagrammethod("peek","keep");
		anagrammethod("mother ", "remoth ");
		
	}

	public static void anagrammethod(String str1,String str2){
		
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length()!=s2.length()){
			status = false;
		}
		else {
			char[] b1 = str1.toLowerCase().toCharArray();
			char[] b2 = str2.toLowerCase().toCharArray();
			Arrays.sort(b1);
			Arrays.sort(b2);
			status = Arrays.equals(b1, b2);
			
		}
		if(status){
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}
		else{
			System.out.println(s1 + " and " + s2 + " are not anagrams ");	
		}
		
	}
}
