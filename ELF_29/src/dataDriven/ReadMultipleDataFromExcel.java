package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws IOException {
		File path = new File("./Datadriven/datass.xlsx");
		FileInputStream files = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(files);
		Row row1 = workbook.getSheet("dataa").getRow(0);
		String firstcellvalue = row1.getCell(0).getStringCellValue();
		//System.out.println(firstcellvalue);
		int rowcount = workbook.getSheet("dataa").getPhysicalNumberOfRows();
		int collumcount = workbook.getSheet("dataa").getRow(0).getPhysicalNumberOfCells();
	String[][] stringarr = new String[rowcount][collumcount];
	for (int i = 0; i < rowcount; i++) {
		for (int j = 0; j <collumcount; j++) {
			
			String print = workbook.getSheet("dataa").getRow(i).getCell(j).toString();
		
		System.out.print(" "+print);
		}
		System.out.println();
	}
	}
}
