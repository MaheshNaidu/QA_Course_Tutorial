package inheritance_Examples;


// Base Class
class Personal
{
	
	private String name;
	private String gender;
	private int age;
	public Personal(String n,String g,int a)
	{
		name=n;
		gender=g;
		age=a;
	}
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public int getAge()
	{
		return age;
	}
	

}

// Derived / Child Class
class Academic extends Personal    //super class (Personal),Derived class(Academic)
{
	private String standard,university;
	
	public Academic(String a,String u,String name,String g,int ag)
	{
		super(name,g,ag);
		standard=a;
		university=u;
	}

	public String getStandard() 
	{
		return standard;
	}

	public String getUniversity() 
	{
		return university;
	}

}


public class Single_Inheritance 
{

	public static void main(String[] args) 
	{
		// Create the Derived class object 
		Academic a=new Academic("B.tech","JNTU","rakesh","male",21);
    	System.out.println(a.getName());
    	System.out.println(a.getGender());
    	System.out.println(a.getAge());
    	System.out.println(a.getStandard());
    	System.out.println(a.getUniversity());

	}

}
