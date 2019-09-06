package loveCoding;

public class Indexofcharacter {
	
	public static void main(String[] args) {

		Indexofcharacter.FindNthIndexOfACharacter('s', "The rains have started here in selenium", 3);
		Indexofcharacter.FindNthIndexOfACharacter('s', "The rains have started here in selenium", 1);
		
		/*Indexofcharacter obj = new Indexofcharacter();
		obj.FindNthIndexOfACharacter('s', "The rains have started here in selenium", 3);
		obj.FindNthIndexOfACharacter('s', "The rains have started here in selenium", 1);*/
		 }

		 private static void FindNthIndexOfACharacter(char c, String str, int position) {

		 /*int count = 0;
		  //str = str.replaceAll("\\s", ""); -- uncomment this line if you want to remove spaces
		  for (int i = 0; i < str.length(); i++) {
		   if (str.toUpperCase().charAt(i) == Character.toUpperCase(c)) {
		    count += 1;
		    if (count == position) {
		     System.out.println(i);
		     break;
		    }
		   }

		  }
*
*
*/
			 
		int count =0;
		for (int i=0;i<str.length();i++){
			if(str.toUpperCase().charAt(i) == Character.toUpperCase(c))
			{
				count = count+1;
				if(count ==position)
				{
					System.out.println(i);
				}
				
			}
			
			
			
		}
			 
			 
			 
		
}
}
