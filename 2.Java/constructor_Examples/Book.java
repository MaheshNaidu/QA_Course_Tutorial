package constructor_Examples;


// Overload Constructor Example
public class Book 
{

	// Properties
	int bid;
	String bname;
	
	
	
	// Default constructor
	public Book()
	{
		bid=100;
		bname="DotNet";		
	}
		
	
	// Here we are maintain the two different constructor in single class 
	//so this process is known as overload Constructor
	
	// parameterized constructor
	public Book(int id,String name)
	{
		bid=id;
		bname=name;
		
	}
		
	
	// Display MEthod
	public void DisplayData()
	{
		System.out.println("Eno : "+bid);
		System.out.println("Ename : "+bname);		
		System.out.println();
		
	}

	public static void main(String[] args) 
	{
		
		// We are execute the default constructor then declare the class instance like this
		Book b1=new Book();
		
		// We are execute the parameterized constructor then declare the class instance like this
		Book b2 = new Book(111,"Java"); 
	
		
		
		// Display the results
		b1.DisplayData();
		b2.DisplayData();
		
		
		
		
	}


}
