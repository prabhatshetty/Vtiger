package dataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	File path = new File("./Datadriven/data.properties");
	FileReader fr = new FileReader(path);
	Properties properties = new Properties();
	properties.load(fr);
	System.out.println(properties.get("username"));
	System.out.println(properties.get("password"));

}
}
