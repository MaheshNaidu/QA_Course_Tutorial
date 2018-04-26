package dataDrivenFramework;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Using_TestNg_DataProvider_TestData 
{

	@Test(dataProvider="Testdata")
	public void login(String val1, String val2, String val3){
		int x =Integer.parseInt(val1);
		
		int y =Integer.parseInt(val2);
		
		int z =Integer.parseInt(val3);
		
		int result =x+y+z;
		System.out.println(result);
		
	}
    @DataProvider(name="Testdata")
	public Object[][] readExcel() throws BiffException, IOException 
    {
		// TODO Auto-generated method stub
		
		File f = new File("e:\\testdata.xls");
		
		Workbook wb =Workbook.getWorkbook(f);
		
		Sheet S = wb.getSheet("Sheet1");
		
		int r = S.getRows();
		
		int c = S.getColumns();
		
		System.out.println(r+"  "+c);
		
		
		String inputdata[][] = new String[r][c];
		
		for(int i=1; i<r; i++) {
			for(int j=0; j<c; j++) {
				Cell C = S.getCell(j, i);
				
				inputdata[i][j]=C.getContents();
				
				System.out.println(inputdata[i][j]);
			}
		}
		return inputdata;
		
		
		
		
		
		
		

	}

}
