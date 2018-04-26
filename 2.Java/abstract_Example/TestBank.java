package abstract_Example;

public class TestBank 
{

	public static void main(String[] args) 
	{
		// Create the abstract class object
		Bank b;  
		
		// using abstract class object create sbi and pnb class
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");   

	}

}
