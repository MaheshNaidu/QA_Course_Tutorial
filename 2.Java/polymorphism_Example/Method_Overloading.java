package polymorphism_Example;

public class Method_Overloading 
{
	
	public double Area(double r)
	{
		return 3.14*r*r;
	}
	
	public double Area(double l,double b)
	{
		return l*b;
	}
	
	
	public static void main(String[] args) 
	{
		
		// Declare the class instance
		Method_Overloading obj=new Method_Overloading();
		
		
		// Call and Display Methods
		System.out.println("Area : "+obj.Area(12.5));
		System.out.println("Area : "+obj.Area(16.5,9.6));
		
		

	}

}
