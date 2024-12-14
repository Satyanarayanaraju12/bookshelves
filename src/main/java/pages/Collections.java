package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collections extends Bookshelves {
	protected By collection = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[10]/span");
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void openURL(String websiteURLKey) {
		driver.get(websiteURLKey);
	}
	
	public void obtainMenu() throws InterruptedException {
		
		//Actions action = new Actions(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(collection));
		(driver.findElement(collection)).click();
		
	}
		
		public void printdata() throws InterruptedException {
		
		System.out.println("\n ****** List of All Furnitures under collections tab ******"); 

		for (int i = 2; i < 3; i++) { 
			WebElement headerList = driver.findElement(By.xpath("(//ul[@class='inline-list left'])[10]/li[" + i + "]/div[1]/a[1]"));
			//wait.until(ExpectedConditions.visibilityOf(headerList));
			System.out.println(headerList.getText());
			System.out.println("----------------");
			
			//(driver.findElement(collection)).click();
			
			for (int j = 1; j < 7; j++) {
				WebElement subList = driver.findElement(By.xpath("(//ul[@class='inline-list left'])[10]/li[" + i + "]/ul[1]/li[" + j + "]/a[1]/span[1]"));
				//(ExpectedConditions.visibilityOf(subList));
				System.out.println(subList.getText());
			}
			System.out.println("");
		}
		//reportPass("All menus and Submenus are Obtained Successfully");
	}

}
