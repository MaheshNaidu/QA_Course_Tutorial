package methods_examples;

public class No_Parameter_With_Return_Type 
{
	public double Area_Rectangle()
	{
		// Declare the input length and breadth  variables
		double l=16.5;
		double b=6.6;
		
		// Find area of rectangle 
		double a=l*b;
		
		// Return the area result value
		return a;
		
		
	}

	public static void main(String[] args) 
	{
		// Declare class instance
		No_Parameter_With_Return_Type obj=new No_Parameter_With_Return_Type(); 
		// here obj is class object
		
		
		//we are calling  method which does not take any parameters 
		//but it catch return value and store here	in result variable	
		double result=obj.Area_Rectangle();	
		
		
		// Display the return value using o/p
		System.out.println("Area of the rectange : "+result);
		
		

	}

}
