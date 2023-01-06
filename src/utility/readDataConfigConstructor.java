package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class readDataConfigConstructor {
	Properties prop;
	public readDataConfigConstructor() throws Exception {
		// TODO Auto-generated constructor stub
		
		FileInputStream fis = new FileInputStream(".\\TestData\\config.properties");
		prop = new Properties();
		prop.load(fis);
		//System.out.println(prop.getProperty("userName"));
		//System.out.println(prop.getProperty("appURL"));
	}

	public String getAppURL() {
		
       // return prop.getProperty("appURL");
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("appURL"));
        return prop.getProperty("userName");

    }
	
}
