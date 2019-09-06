package loveCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateNumbers {

	/*static Integer a[] = {1,2,2,3,3,3,4,5,6};
	
	public static void main(String [] args){
		
	
		Map<Integer,Integer>  map = new HashMap<Integer,Integer>();
		
		for(Integer b:a){
		if(map.containsKey(b)){
			
			map.put(b, map.get(b)+1);
		}
		else{
			map.put(b, 1);
		}
		
		
		
		
		
	}
		
		System.out.println(map);
		
			
	}
	*/
	
	
	
/*	public static void main(String[] args) {
	Set<Integer > set = new HashSet<Integer>();
	for(Integer b : a){
		
		if(set.add(b)==false){
		System.out.println(b);
		}
	}
		*/	
	
	
	
	
	
	/*static List<Integer> list = Arrays.asList(a);
	
	
	System.out.println(list);
	*/
	
	
	
	static int a[] = {1,3,4,4,5,5,5,2,3};
	static int count =0;
	public static void main(String[] args) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]== a[j])
				{
					count++;
					System.out.println(a[i]);
				}
			}
		}
	}
	
	/*static String a[] ={"apps" ,"apps","test","done" ,"done"};
	public static void main(String[] args) {
	
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println(a[i]);
				}
			}
		}
	}*/
	
	}	
	

