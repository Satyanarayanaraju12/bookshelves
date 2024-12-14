package utilities;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
protected static WebDriver driver;
	
	
	public static WebDriver getWebDriver (String browsername )
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver=setChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			driver=setEdgeDriver();
		}
		else
		{
			System.out.println("Enter valid browser");
		}
		return driver;
	}

	public static WebDriver setChromeDriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		co.addArguments("--disable-infobars");
		co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		//co.setHeadless(true);
		driver=new ChromeDriver(co);
		return driver;
	}
	/*public static WebDriver setFirefoxDriver()
	{
		WebDriverManager.firefoxdriver().setup();
		//co.setHeadless(true);
		driver=new FirefoxDriver();
		return driver;
	}*/
	public static WebDriver setEdgeDriver()
	{
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		return driver;


	}

}
