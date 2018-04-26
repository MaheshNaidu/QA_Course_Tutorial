package class_Objects_Examples;

public class TestStudent1
{

	public static void main(String[] args) 
	{
		// Create the class instance(Object)
		Student s1=new Student();  
		
		// Initialization class fields through reference
		s1.id=101;  
		s1.name="Raju";  
		
		// Display the result
		System.out.println(s1.id+" "+s1.name);

	}

}
