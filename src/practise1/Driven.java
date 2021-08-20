package practise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Driven 
{

	public ArrayList<String> getData(String testcase) throws IOException 
	{
		ArrayList<String> a = new ArrayList<String>();
			FileInputStream fis = new FileInputStream("C://Users//balub//OneDrive//Documents//Scoresheet.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int sheets = wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++)
			{
				if(wb.getSheetName(i).equalsIgnoreCase("scorecard"))
				{
					XSSFSheet sheet=wb.getSheetAt(i);
					Iterator<Row> row = sheet.iterator();
					int column =0;
					while(row.hasNext())
					{
						Row r = row.next();
						if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase))
						{
							Iterator<Cell> cell = r.iterator();
							while(cell.hasNext())
							{
								a.add(cell.next().getStringCellValue());
							}
						}
					}
					
				}
			}
			return a;
			
	}

	
}
