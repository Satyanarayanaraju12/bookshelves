package bookshelves;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pages.Bookshelves;
import utilities.DriverSetup;
import utilities.ReadPropertyFile;

public class SelectBookshelves extends Bookshelves {
	@Test
	public void selectprise() throws InterruptedException {
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
		
		
		driver.findElement(bsicon).click();
		
		driver.close();
}

}
