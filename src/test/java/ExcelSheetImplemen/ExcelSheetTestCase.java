package ExcelSheetImplemen;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetTestCase 
{

	public static void main(String args[])
	{
		XSSFWorkbook workbook=new XSSFWorkbook(); 
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		int rowNum=0;
		for(int i=0;i<=10;i++)
		{
			XSSFRow row=sheet.createRow(rowNum++);
			
			int colNum=0;
			for (int j=1;j<=10;j++)
			{
				XSSFCell cell=row.createCell(colNum++);
				cell.setCellValue("row"+ i + "column" + j);
			}
					
		}
}
}