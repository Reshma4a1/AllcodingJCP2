package loveCoding;

import java.util.regex.Pattern;

public class ReversePlay {
	static String str = "This is java";	
	static String result = "";
	/**
	 * 1. java is This ---------------done 
	 * 2. sihT is avaj----------------done
	 * 3. avaj si sihT----------------done
	 * 4.Words - sdrow----------------done
	 */
	
	
	//Reverse words
	
public static void main(String[] args) {
	/*reverseWords();
	reverseWordsChar();
	reverseChar1();
	reverseChar();*/
	reversedecimalnumber();
}
	
	//1.code to reverse the words
	public static void reverseWords(){
	Pattern p = Pattern.compile("\\s");
	String temp[] = p.split(str);//temp[0]=this [1]=is [2]=java
	
	String result = "";
	for(int i = temp.length-1;i>=0;i--){
		 result =result+temp[i];
		 result = result+" ";
	}
	result.trim();
	System.out.println(result);
	
	}
	
	
	//4.reverse a string
	public static void reverseChar(){
		String str = "words";
		String reverse ="";
		for(int i = str.length()-1 ;i>=0;i--){
			reverse = reverse +str.charAt(i); 
			
		}
		System.out.println(reverse);
	}
	
	
	//3.reverse words and char
	public static void reverseWordsChar(){
	Pattern pattern = Pattern.compile("\\s");
	String[] temp = pattern.split(str);//temp -this -0,is-1,java-2
	String reverse =""; // StringBuilder 
	for(int i=temp.length-1;i>=0;i--){
		/*if(i==temp.length-1){
			result = temp[i]+result;
			for(int j = result.length()-1 ;j>=0;j--){
				reverse = reverse+str.charAt(j);
			}
		}*/
	
		
		result = " " + temp[i];
		for(int j = result.length()-1 ;j>=0;j--){
			reverse = reverse+result.charAt(j);
		
	}}
	
	System.out.println(reverse);
			
			
}
	
	//2.reverse only char
		public static void reverseChar1(){

			String sentence = "This is java";
			String[] words = sentence.split(" ");
			String invertedSentece = "";
			for (String word : words){
			    String invertedWord = "";
			    for (int i = word.length() - 1; i >= 0; i--)
			        invertedWord += word.charAt(i);
			    invertedSentece += invertedWord;
			    invertedSentece += " ";
			}
			invertedSentece.trim();
			System.out.println(invertedSentece);
	
}
		
		
	//5.Reverse a decimal number
		
public static void reversedecimalnumber(){
		String sentence = "1234.567.89";
		Pattern p = Pattern.compile("\\.");
		String[] words = p.split(sentence);
		String  reversenum = "";
		for (String word : words){
		    String invertedWord = "";
		    for (int i = word.length() - 1; i >= 0; i--)
		        invertedWord += word.charAt(i);
		    reversenum += invertedWord;
		    reversenum += ".";
		}
		
		
		
		//System.out.println(reversenum);
	for(int i = 0; i<reversenum.length()-1; i++) {
		System.out.print(reversenum.charAt(i));
	}

}
}

