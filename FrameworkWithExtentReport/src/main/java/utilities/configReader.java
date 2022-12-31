package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	public static String readValue(String key) {
		Properties prop = null;
		if (key!= null) {

			prop = new Properties();

			FileInputStream fis = null;
			try {
				fis = new FileInputStream("./src/test/resources/properties/config.properties");
			} catch (FileNotFoundException e) {

			}
			try {
				prop.load(fis);
			} catch (IOException e) {

				e.printStackTrace();
			}
			return prop.getProperty(key);
		} else {

			return "Invalid key is provided>>Please enter correct Key!!";
		}
		//return "Invalid key is provided>>Please enter correct Key!!";

	}

}
