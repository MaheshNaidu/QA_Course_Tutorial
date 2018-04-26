package variables_DataTypes_IO_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStatement_Example2 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// 1. Create an InputStreamReader using the standard input stream.
	    InputStreamReader isr = new InputStreamReader( System.in );
	 
	    // 2. Create a BufferedReader using the InputStreamReader created.
	    BufferedReader stdin = new BufferedReader( isr );
	    
	    
	    // Declare input statement
	    System.out.println("Enter Integer value : ");
	    int a= Integer.parseInt(stdin.readLine());
	    
	    
	    System.out.println("Enter Any Double value : ");
	    double b=Double.parseDouble(stdin.readLine());
	    
	    
	    System.out.println("Enter Any String : ");
	    String c=stdin.readLine();
	    
	    
	    
	    // Display the output
	    System.out.println("Integer value : "+a);
	    System.out.println("Double value : "+b);
	    System.out.println("String : "+c);

	}

}
