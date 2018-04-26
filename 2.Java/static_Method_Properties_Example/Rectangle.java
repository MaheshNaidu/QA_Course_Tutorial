package static_Method_Properties_Example;

public class Rectangle 
{
	
	// Member fields
	 static int length;  
	 static int width;  
		 
		 
	 // Member Methods
	 static void insert(int l, int w)
	 {  
		 length=l;  
		 width=w;  
	 }  
		 
	 static void calculateArea()
	 {
		 System.out.println(length*width);
	 }
		 

	public static void main(String[] args) 
	{
		// The Static method are access directly with in the class main method with out object
		
		insert(10,20);
		calculateArea();
		

	}

}
