package variables_DataTypes_IO_Statements;

import java.util.Scanner;

public class InputStatement_Examples 
{

	public static void main(String[] args) 
	{
		
		// Declare Scanner Object
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		
		// Store the different values
		System.out.println("Enter Integer value : ");
		int a=obj.nextInt();
		
		System.out.println("Enter Double Value : ");
		double b=obj.nextDouble();
		
		System.out.println("Enter String : ");
		String d=obj.next();
		
		
		
		
		// Display the values
		System.out.println("Integer value : "+a);
		System.out.println("Double value : "+b);		
		System.out.println("String : "+d);

	}

}
