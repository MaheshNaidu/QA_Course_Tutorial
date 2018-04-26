package collection_Examples;

import java.util.*;

public class ArrayList_Example 
{

	public static void main(String[] args) 
	{
		// Declare the ArrayList object
		ArrayList<String> fruits = new ArrayList<String>();
		
		
		 // Add item: add at end of lists
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");

		//add at specified index
		fruits.add(3,"pineapple");
		fruits.add(4,"berry");
		fruits.add("apple");

		
		// retrieve a particular item at index
		fruits.get(0);      //apple
		fruits.get(2);     // orange

		//retrieve all the items in list	
		for(String item : fruits)
		{
			System.out.println(item);
		}

		//Update Item: 
		//replace banana with strawberry.
		fruits.set(2,"strawberry");  

		//Delete Item:
		//to remove at particular index
		fruits.remove(0);   //apple is removed


		//to remove a particular item if we don’t know index.
		fruits.remove(new String("orange")); 
		//orange is removed.
		
		
		//retrieve all the items in list	
		for(String item : fruits)
		{
			System.out.println(item);
		}

			
		

	}

}
