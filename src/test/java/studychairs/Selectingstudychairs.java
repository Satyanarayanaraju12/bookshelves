package studychairs;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pages.StudyChairs;
import utilities.DriverSetup;
import utilities.ReadPropertyFile;

public class Selectingstudychairs extends StudyChairs {
	@Test
	public void capturealert() throws InterruptedException, IOException {
		Properties prop=null;
		try {
			prop = ReadPropertyFile.readPropertiesFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browsername=prop.getProperty("browsername");
		driver=DriverSetup.getWebDriver(browsername);
		
		String websiteURLKey=prop.getProperty("websiteURLKey");
		openURL(websiteURLKey);
		
		Studychairs();
		
		driver.close();
	}
	

}
