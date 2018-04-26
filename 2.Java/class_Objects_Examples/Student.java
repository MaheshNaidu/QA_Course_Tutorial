package class_Objects_Examples;

public class Student 
{
	//field or data member or instance variable  
	 int id;
	 String name;  
	 
	 
	 // main within class
	 public static void main(String args[])
	 {  
		  Student s1=new Student();//creating an object of Student  
		  System.out.println(s1.id);//accessing member through reference variable  
		  System.out.println(s1.name);  
	 }  

}
