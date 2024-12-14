package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bookshelves {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public By bsicon = By.xpath("//*[@id=\"content\"]/div[3]/div/div[3]/a[4]/h4");
	protected By excos = By.id("filters_availability_In_Stock_Only");
	public By sliderXpath = By.id("price_limit_9000-15999");
	protected By close = By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	protected By storage = By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[2]/div[1]/div");

	protected By cost = By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[1]/div[1]/div");
	protected By open = By.id("filters_storage_type_Open");

	protected By name = By.xpath("//*[@id=\"content\"]/div[3]/ul/li/div/div[5]/a/div[1]/span");
	protected By price = By.xpath("//*[@id=\"content\"]/div[3]/ul/li/div/div[5]/a/div[2]/span");
	
	protected By recommendation =By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/span");
	//public static WebDriver driver;
	
	protected By reccomend = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[1]");
	
	
	public void openURL(String websiteURLKey) {
		driver.get(websiteURLKey);
	}
	
	public void displayBookshelves() throws InterruptedException {
		
		driver.findElement(bsicon).click();
		
		driver.findElement(excos).click();
	} 
	 
	public void closeadd() throws InterruptedException {
		
		wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(close));
		driver.findElement(close).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,12)", "");
	}
	
	public void selectstorage() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(storage));
		driver.findElement(storage).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(open));
		driver.findElement(open).click();
	}
	
	
	

	public void selectprise() throws InterruptedException {
		
		driver.findElement(cost).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cost));
		wait.until(ExpectedConditions.visibilityOfElementLocated(sliderXpath));
		driver.findElement(sliderXpath).click();
	}

	

	
	public void displaynames() throws InterruptedException {
		
		System.out.println(" ***************** List of Bookshelves under 15000 *****************  "  );
		
		Thread.sleep(1000);
		
		List<WebElement> prices = driver.findElements(price);
		List<WebElement> names = driver.findElements(name);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(names.get(i).getText() + " - " + prices.get(i).getText());
		}
		
		System.out.println(" Name and prices of the bookshelves are obtained");
	}

}
