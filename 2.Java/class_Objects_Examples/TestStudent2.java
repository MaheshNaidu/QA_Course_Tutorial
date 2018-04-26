package class_Objects_Examples;

public class TestStudent2 
{

	public static void main(String[] args) 
	{
		  //Creating  Multiple objects  
		  Student s1=new Student();  
		  Student s2=new Student();  
		  
		  //Initializing objects  
		  s1.id=101;  
		  s1.name="Raju";  
		  
		  s2.id=102;  
		  s2.name="Krishna";  
		  
		  //Printing data  
		  System.out.println(s1.id+" "+s1.name);  
		  System.out.println(s2.id+" "+s2.name);

	}

}
