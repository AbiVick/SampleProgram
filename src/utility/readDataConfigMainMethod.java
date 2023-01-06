package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readDataConfigMainMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*FileInputStream fis = new FileInputStream(".\\testData\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("appURL"));*/
		readDataConfigConstructor rdcc = new readDataConfigConstructor();
		rdcc.getAppURL();
	}

	public void verifyLoginL() throws Exception { 

    }	
	
}
