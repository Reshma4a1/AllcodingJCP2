package arrayManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dupplicateelements {

	//static String[] s= {"Java","JavaScript" ,"Java","C","C++","Java"};
	
	static Integer[] s ={1,1,2,2,2,2,2,2,2,3};
	
	public static void main(String[] args) {
		
		//usingloops();
		//usingset();
		usingMap();
		
		
	}
	
	/*//1.using for loops

	public static void usingloops() {

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i].equals(s[j])) {
					System.out.println(s[i]);
				}
			}
		}

	}
	
	//2.using hash set - Hash set displays only unique elements
	public static void usingset(){
	Set<String> data = new HashSet<String>();
	for(String data1:s)
	{
		if(data.add(data1) == false)
		System.out.println(data1);
	}
	
	
	}*/
	
	/*//3.using hash map
	public static void usingMap(){
	Map<String,Integer> map = new HashMap<String,Integer>();
	for(String name : s)
	{
		Integer count = map.get(name);
		if(count ==null){
			map.put(name, 1);
		}
		else{
			map.put(name, ++count);
		}
	}
	
	//get the values from this hashmap
	
	Set<Entry<String,Integer>> entryset = map.entrySet();
	for(Entry<String,Integer> entry : entryset)
	{
		if(entry.getValue()>1){
			System.out.println("Duplicate elemnet is :: "+entry.getKey());
		}
	}
	
	
	}*/
	
	public static void usingMap(){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(Integer name : s)
		{
			Integer count = map.get(name);
			if(count ==null){
				map.put(name, 1);
			}
			else{
				map.put(name, ++count);
			}
		}
		
		//get the values from this hashmap
		
		Set<Entry<Integer,Integer>> entryset = map.entrySet();
		for(Entry<Integer,Integer> entry : entryset)
		{
			if(entry.getValue()>1){
				System.out.println("Duplicate elemnet is :: "+entry.getKey());
			}
		}
	
	
}
}
