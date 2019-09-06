package loveCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
	
	
	public static void main (String[] args)
	
	{
		List<Comparablelaptop> list = new ArrayList<Comparablelaptop>();
		list.add(new Comparablelaptop(4,"lenovo",12000));
		list.add(new Comparablelaptop(6,"dell",10000));
		list.add(new Comparablelaptop(8,"intel",8000));
		
		Comparator<Comparablelaptop> com = new Comparator<Comparablelaptop>(){
			public int compare(Comparablelaptop l1,Comparablelaptop l2)
			{
				
				if(l1.getPrice() > l2.getPrice())
					return 1;
				else
							
				return -1;
				
			}
		};
		
		Collections.sort(list,com);
		

		for(Comparablelaptop lap:list){
			
			System.out.println(lap);
		}
		
		/*
		 * 
		 * using comparable interface
		 * if u want use this implement comparable in comparablelaptop class
		 * 
		List<Comparablelaptop> list = new ArrayList<Comparablelaptop>();
		list.add(new Comparablelaptop(4,"lenovo",12000));
		list.add(new Comparablelaptop(6,"dell",10000));
		list.add(new Comparablelaptop(8,"intel",8000));
		
		Collections.sort(list);
		
		
		for(Comparablelaptop lap:list){
			
			System.out.println(lap);
		}*/
		
		
		
		/*just using sort method
		 * 
		 * List<String> list = new ArrayList<String>();
		list.add("reshma");
		list.add("Lopa");
		list.add("radhika");
		
		Collections.sort(list);
		
		System.out.println(list);*/
		
		
		
		

}
}
