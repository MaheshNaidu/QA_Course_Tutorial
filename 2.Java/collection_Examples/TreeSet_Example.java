package collection_Examples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example 
{
	
	public static void main(String[] args)
	{
		// Declare the tree set 
		TreeSet<String> alp = new TreeSet<String>(); 

		//Add Items
		
		alp.add("A");
		alp.add("B");
		alp.add("C");

		//Read Item:
		Iterator<String> i = alp.iterator();
		while(i.hasNext()){
		    System.out.println(i.next());
		}

		System.out.println(alp);

		//Delete item:
		alp.remove("B");
		
		for(String n : alp)
		{
			System.out.println(n);
		}

		
		
	}

}
