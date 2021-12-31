package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		File path = new File("./Datadriven/datass.xlsx");
		FileInputStream files = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(files);
		Row row1 = workbook.getSheet("dataa").getRow(0);
		String firstcellvalue = row1.getCell(0).getStringCellValue();
		System.out.println(firstcellvalue);
	}
}
