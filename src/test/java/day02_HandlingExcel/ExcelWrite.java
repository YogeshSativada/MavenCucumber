package day02_HandlingExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream  fis= new FileInputStream("D:\\software\\TestData.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//ws.getRow(1).getCell(1).setCellValue("New FLM");     //modification
		
		//ws.getRow(2).createCell(1).setCellValue("Pass");               // create new cell
		
		ws.createRow(3).createCell(0).setCellValue("New Line");       // create new row 
		
		FileOutputStream fos=new FileOutputStream("D:\\software\\TestData.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("End of Program");
		
	}

}
