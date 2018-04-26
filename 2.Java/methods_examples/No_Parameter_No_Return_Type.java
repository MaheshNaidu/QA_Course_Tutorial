package methods_examples;

public class No_Parameter_No_Return_Type 
{
	
	public void Area_Circle()
	{
		// Declare the input radius variable
		int r=10; 
		
		// Find area 
		double a=3.14*r*r;
		
		// Display the result with using o/p statement
		System.out.println("Area of the Circle : "+a);	
		
		
	}

	public static void main(String[] args) 
	{
		// Declare class instance
		No_Parameter_No_Return_Type obj=new No_Parameter_No_Return_Type(); 
		// here obj is class object
		
		
		//we are calling draw method which does not take any parameters
		obj.Area_Circle();		

	}

}
