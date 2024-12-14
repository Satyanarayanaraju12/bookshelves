package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ScreenShots;

public class GiftCards extends Bookshelves {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	By gift = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[3]/a");
	By bday = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]/div/h3");
	By choose = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]/div/div/button");
	protected By amt = By.xpath("//*[@id=\"ip_2251506436\"]");
	protected By next = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button");
	protected By rname = By.id("ip_4036288348");
	protected By rmail = By.id("ip_137656023");
	By sname = By.id("ip_1082986083");
	By smail = By.id("ip_4081352456");
	By sno = By.id("ip_2121573464");
	By message = By.id("ip_582840596");
	By confirm = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[3]/form/button");
	
	
	public void openURL(String websiteURLKey) {
		driver.get(websiteURLKey);
	}
	
	public void giftCard() throws IOException {
		
		driver.findElement(gift).click();
	}
	public void selectbday() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(bday)).perform();
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(choose));
		driver.findElement(choose).click();
	}
	
	
	public void entervalues() {
		
		driver.findElement(amt).sendKeys("4000");
		driver.findElement(next).click();
		driver.findElement(rname).sendKeys("team3");
		driver.findElement(rmail).sendKeys("team3");
		driver.findElement(sname).sendKeys("manikanta");
		driver.findElement(smail).sendKeys("Manikanta@abc.com");
		driver.findElement(sno).sendKeys("9876543210");
		driver.findElement(message).sendKeys("Advance Happy Married Life");
		//reportPass("Wrong details are filled");
		driver.findElement(confirm).click();
		
	}
	
	public void screenshot() {
		
		ScreenShots ss=new ScreenShots(driver);
		ss.captureScreenShot();


		//reportPass("Error Message is Captured");
		System.out.println(" ");
		System.out.println("Error Captured Successfully");
	}

}
