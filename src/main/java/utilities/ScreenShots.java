package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	WebDriver driver;
	//constructor
	public ScreenShots(WebDriver driver)
	{
		this.driver=driver;
	}
	//method to capture screenshot
	public void captureScreenShot()
	{
		try
		{
			String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			TakesScreenshot Obj=(TakesScreenshot)driver;
			File Img=Obj.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Img,new File("./Screenshot/"+timeStamp+"_screenshot.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error occured while Capturing Screen");
		}
	}

}
