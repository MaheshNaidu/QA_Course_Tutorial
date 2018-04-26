package constructor_Examples;

//parameterized Constructor Example
public class Student 
{
	// Properties	
	 int id;
	 String name;  
	 
	 
	// parameterized Constructor
	 Student(int i,String n)
	 {
		 id=i;
		 name=n;
	 }
	 
	// Display Method
	 void display()
	 {
		 System.out.println(id+" "+name);
	 }
	 
	 // Main Method
	 public static void main(String args[])
	 {  
		
		// We are execute the parameterized constructor then declare the class instance like this
	    Student s1 = new Student(111,"Mahesh");  
	    Student s2 = new Student(222,"Chandra");  
	    
	    
	    // Call the display method then display the results
	    s1.display();  
	    s2.display();  
     }  

}
