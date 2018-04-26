package aWT_Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Handling_Notepad 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		
		// Open Notepad
		Runtime.getRuntime().exec("C:\\Windows\\system32\\notepad.exe");		
		
		// Type text in Notepad
		Thread.sleep(5000);	
		StringSelection s = new StringSelection("Welcome to selenium class");
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(7000);
		
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		
		Thread.sleep(5000);
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
        Thread.sleep(5000);
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(7000);
		
		StringSelection s1 = new StringSelection("E:\\mahesh.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
        r.keyPress(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);

				

	}

}
