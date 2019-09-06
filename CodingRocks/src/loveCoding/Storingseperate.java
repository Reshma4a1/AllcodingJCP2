package loveCoding;

public class Storingseperate {
	
	static String word = "aah123*&^";
	
	public static void separating(){
		
		StringBuffer alpha = new StringBuffer(),
		num = new StringBuffer(),special = new StringBuffer();
		
for(int i =0;i<word.length();i++){
	
	if(Character.isDigit(word.charAt(i)))
	{
		num.append(word.charAt(i));
	}
		else if (Character.isAlphabetic(word.charAt(i)))
		{
			alpha.append(word.charAt(i));
		}
		
			else
				special.append(word.charAt(i));
			
		}
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(special);
}
	
	public static void main(String[] args){
		separating();
	}
	}


