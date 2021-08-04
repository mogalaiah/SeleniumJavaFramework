package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties int_property(){
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("./src/test/resources/Config/config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return prop;

	}

}
