package execution_Handling_Examples;

public class try_catch 
{

	public static void main(String[] args) 
	{
		
		try
		{  
		     int data=50/0; 		 
		     System.out.println("Result : "+data); 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
		   

	}

}
