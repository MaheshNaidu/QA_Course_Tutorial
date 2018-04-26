package aWT_Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Handling_Calculator 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
		
		Thread.sleep(5000);
		
		StringSelection s = new StringSelection("85");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(7000);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		
		Thread.sleep(7000);
		
		StringSelection s1 = new StringSelection("50");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
        r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(8000);
		
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);

	}

}
