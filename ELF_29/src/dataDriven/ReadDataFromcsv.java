package dataDriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadDataFromcsv {
	public static void main(String[] args) throws IOException, CsvValidationException {
		File path = new File("./Datadriven/dataa.csv");
		FileReader fr = new FileReader(path);
		CSVReader reader = new CSVReader(fr);
		String[] values=reader.readNext();
		System.out.println(values[1]);
}
}
