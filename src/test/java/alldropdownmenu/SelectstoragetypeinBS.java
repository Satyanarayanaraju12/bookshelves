package alldropdownmenu;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.Bookshelves;
import utilities.DriverSetup;
import utilities.ReadPropertyFile;

public class SelectstoragetypeinBS extends Bookshelves  {
	@Test
	public void Selectstorage() throws InterruptedException {
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
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		displayBookshelves();
		
		closeadd();
		
		selectstorage();
		
		Thread.sleep(3000);
		driver.close();
		
}

}
