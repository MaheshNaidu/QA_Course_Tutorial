package constructor_Examples;

//Default Constructor Example

public class Employee 
{
	
	// Properties
	int eno;
	String ename;
	double salary;
	
	
	// Default constructor
	public Employee()
	{
		eno=100;
		ename="Raju";
		salary=1500;
	}
		
	
	// Display MEthod
	public void DisplayData()
	{
		System.out.println("Eno : "+eno);
		System.out.println("Ename : "+ename);
		System.out.println("Salary : "+salary);
		System.out.println();
		
	}

	public static void main(String[] args) 
	{
		
		// We are execute the default constructor then declare the class instance like this
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		
		// Display the results
		e1.DisplayData();
		e2.DisplayData();
		
		
		
		
	}

}
