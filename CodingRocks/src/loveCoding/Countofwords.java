package loveCoding;

import java.util.HashMap;
import java.util.Map;

public class Countofwords {

	static String[] str = { "words", "places", "words", "places", "once" };

	static Map<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args) {
		try{
			
		
		
		for(int i =0;i<=str.length;i++){
			
			if(map.containsKey(str[i])){
				map.put(str[i], map.get(str[i])+1);
				
				
			}else{
				map.put(str[i], 1);
			}
			
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound");
		}
		System.out.println(map);

		/*for (String s : str) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}
		System.out.println(map);
	}*/

}
}
