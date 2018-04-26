package methods_examples;

public class With_Parameter_No_Return_Type 
{
	public void Area_Triangle(int base,double height)
	{		
		// Find area 
		double a=0.5*base*height;
		
		// Display the result with using o/p statement
		System.out.println("Area of the Triangle : "+a);	
		
		
	}

	public static void main(String[] args) 
	{
		// Declare class instance
		With_Parameter_No_Return_Type obj=new With_Parameter_No_Return_Type(); 
		// here obj is class object
			
		
		//we are calling method which take parameters and send to method building
		obj.Area_Triangle(6,9.5);		

	}

}
