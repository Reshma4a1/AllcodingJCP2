package loveCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPlay {
	
	/*
	 * 1.Linked list - sort
	 * 2.Linked list -  reverse
	 * 3.Linked list - Length
	 * 4.Linked list - middle element
	 *
	 */
	
	
	//Linked list - sort
	
	static Integer a[] = {1,2,10,3,13,4,14};
	static List<Integer> list = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		
	list =	Arrays.asList(a);
		System.out.println("List elements " +list);
		Collections.sort(list);
		System.out.println("After sorting" +list);
		Collections.reverse(list);
		System.out.println("After reversing" +list);
	int size = list.size();
	System.out.println("Length of list : " + size);
	
		int middle = list.size()/2;
		int midelement = list.get(middle);
		System.out.println("Middle element :"+midelement );
		
	}
		
	
	

}
