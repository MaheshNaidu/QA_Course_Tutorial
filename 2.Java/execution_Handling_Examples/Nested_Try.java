package execution_Handling_Examples;

public class Nested_Try 
{

	public static void main(String[] args) 
	{
		
		try
		{  
		    try
		    {  
		    	System.out.println("going to divide");  
		    	int b =39/0;  
		    	System.out.println("Result : "+b); 
		    }
		    catch(ArithmeticException e)
		    {
		    	System.out.println(e);
		    }  
		   
		    try
		    {  
		    	int a[]=new int[5];  
		    	a[5]=4;  
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println(e);
		    }  
		     
		    System.out.println("other statement");  
		}
		catch(Exception e)
		{
			System.out.println("handeled");
		}  
		  
		  System.out.println("normal flow..");  
		}  

	

}
