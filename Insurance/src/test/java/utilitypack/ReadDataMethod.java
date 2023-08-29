package utilitypack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataMethod {
	
	public static String getPropData(String key) throws IOException
	{
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "\\Folder1\\prop.properties";

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String value = prop.getProperty(key);

		System.out.println(value);
		
		return value;

	}
	
	
}
