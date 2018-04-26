package class_Objects_Examples;


class Rectangle 
{
	 // Member fields
	 int length;  
	 int width;  
	 
	 
	 // Member Methods
	 void insert(int l, int w)
	 {  
		 length=l;  
		 width=w;  
	 }  
	 
	 void calculateArea()
	 {
		 System.out.println(length*width);
	 }

}

public class TestRectangle1 
{

	public static void main(String[] args) 
	{
		 // Create object
		 Rectangle r1=new Rectangle();  
		 Rectangle r2=new Rectangle();
		 
		 // Access Method 
		 r1.insert(11,5);  
		 r2.insert(3,15);  
		 r1.calculateArea();  
		 r2.calculateArea();
		  

	}

}
