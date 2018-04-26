package methods_examples;

public class With_Parameter_With_Return_Type 
{

	public double Area_Rhombus(double p,double q)
	{		
		// Find area Rhombus
		double a=(p*q)/2;
				
		// Return the area result value
		return a;
				
		
	}

	public static void main(String[] args) 
	{
		// Declare class instance
		With_Parameter_With_Return_Type obj=new With_Parameter_With_Return_Type(); 
		// here obj is class object
			
		
		//we are calling  method which take parameters 
		//and it catch return value and store here	in result variable
		double result=obj.Area_Rhombus(6.9,9.5);		
		
		
		// Display the result with using o/p statement
		System.out.println("Area of the Triangle : "+result);	
				

	}

}
