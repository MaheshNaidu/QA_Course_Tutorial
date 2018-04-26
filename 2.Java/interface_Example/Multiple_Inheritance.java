package interface_Example;

// Base Interface1
interface Printable
{  
	void print();  
}  

//Base Interface2
interface Showable
{  
	void show();  
}  

// Above two interfaces implements in another class
class DrivedClass implements Printable,Showable
{  
	public void print()
	{
		System.out.println("Hello");
	}  
	
	public void show()
	{
		System.out.println("Welcome"); 
	}
}

public class Multiple_Inheritance 
{

	public static void main(String[] args) 
	{
		// Create the derived class objects
		DrivedClass obj = new DrivedClass();  
		obj.print();  
		obj.show();

	}

}
