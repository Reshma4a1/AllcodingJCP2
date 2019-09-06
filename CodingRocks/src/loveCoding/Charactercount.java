package loveCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Charactercount {
	
	static String a = " GOOGLLLLLEE";
	static Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	public static void main(String[] args) {
		int array[] ={1,2,3};
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);		
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(10);		
		list.add(3);
		list.add(1);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		char b[] = a.toCharArray();
		for(char c:b){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}


		for(int i =0;i<map.size();i++){
			if(map.containsKey(' ')){
				int val = map.get(' ');
				map.remove(' ');
		map.put('@', val);
			}
		}
		System.out.println(map);
		
	}
	
	
		
}