package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checkvalidmobilenumber {
	
	//regular expression for mobile number  - (0|91)?[7-9][0-9]{9}
	
	//mail id regular expression - [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-z0-9]+([.][a-zA-Z]+)+

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher("reshma4a1@gma122il.com");
		if(m.find()&&m.group().equals("reshma4a1@gma122il.com"))
		{
			System.out.println("Valid mail id  ");
		}
		else{
			System.out.println("invalid mail id ");
		}
		
	}

}
