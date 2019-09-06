package loveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class CodingPractice {
/*	
	//Write a program to print the count of words
	
	static String[] a = {"apps" ,"apps","demo" ,"demo","test"};
	static Map<String,Integer>  map = new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		
		for(int i=0;i<a.length;i++){
			
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}else{
				map.put(a[i], 1);
			}
			
		}
		System.out.println(map);

		
	}*/
	
	//write a program to display the count of characters
	
	/*static String a = "red s sh ma";
	static Map<Character ,Integer> map = new HashMap<Character, Integer>();
	public static void main(String[] args) {
		char arr[] = a.toCharArray();
		for(char b : arr){
			if(map.containsKey(b)){
				map.put(b, map.get(b)+1);
				
			}else{
				map.put(b, 1);
			}
		}
		//System.out.println(map);
		for(int i=0;i<map.size();i++){
			if(map.containsKey(' ')){
				int value = map.get(' ');
				map.remove(' ');
				map.put('@', value);
				
			}
			
			
		}
		System.out.println(map);
	}*/
	
	//Reverse a string - word - drow
	//this is java - java is this
	//siht si avaj
	//avaj si siht
	
	/*static String str = "reshma";
	static String reverse = "";
	public static void main(String[] args) {
		for(int i = str.length()-1;i>=0;i--){
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
	}*/
	
	static String str = "this is java";
	static String result = " ";
	static String reverse = " ";
	/*static Pattern pattern = Pattern.compile("\\s");
	static String[] temp = pattern.split(str);//temp == this-0,is-1,java-2
	public static void main(String[] args) {
		for(int i=0;i<temp.length;i++){
			if(i== temp.length-1){
				result = temp[i] + result;
				
			}
			else{
				result = " "+ temp[i]+result;
				
			}
		}
	
	
		System.out.print(result);


	}
	
	*/
	
	static Pattern pattern = Pattern.compile("\\s");
	static String[] temp = pattern.split(str);
	public static void main(String[] args) {
		for(int i =0;i<=temp.length-1;i++){
			result = " "+temp[i]+result;
		}
			for(int j=result.length()-1;j>=0;j--){
				reverse = reverse +result.charAt(j);
			}

	
		System.out.println(reverse);
	}
	
	
	

}
