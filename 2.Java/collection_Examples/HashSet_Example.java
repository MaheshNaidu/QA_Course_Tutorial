package collection_Examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example 
{
	// HashSet implements set interface, doesn’t allow duplicate items.

	public static void main(String[] args) 
	{
		// Declare the Hash Set Object
		HashSet<String> set=new HashSet<String>();  
		
		// Add items in hash set
		 set.add("Ravi");  
		 set.add("Vijay");  
		 set.add("Ravi");  
		 set.add("Ajay");  
		 
		 //Traversing elements  
		 Iterator<String> itr=set.iterator();  
		 while(itr.hasNext())
		 {  
			 System.out.println(itr.next());		 
		 }
		 
		//Delete item:
		set.remove("Vijay");
		for(String name : set)
		{
			System.out.println(name);
		}
			
			
	}
	
	

}
