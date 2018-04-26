package collection_Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example 
{

	public static void main(String[] args) 
	{
		
		//Creating object:
		HashMap<String, Integer> marks= new HashMap<>();
		
		//Add Item:
		marks.put("java", 80);
		marks.put("selenium",90);
		marks.put("appium",85);

		//Read Item:
		marks.get("java");

		//Update Item:
		marks.put("java",88);

		//loop through items in hashmap
		for (Map.Entry<String, Integer> entry : marks.entrySet()) 
		{
			System.out.println("Item : " + entry.getKey() + " Value : " + entry.getValue());
		}

				


	}

}
