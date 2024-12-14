package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudyChairs extends Bookshelves {
	public static WebDriverWait wait;
	public static WebDriver driver;

	By chairprice = By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li/div/div[5]/a/div[2]/span");
	By chairname = By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li/div/div[5]/a/div[1]/span");
	protected By study = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/span");
	By chair = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/div/div/ul/li[2]/ul/li[1]/a/span");
	By details = By.xpath("//*[@id=\"content\"]/div[3]/div/ul/li/div/div[5]/a/div[1]/div[1]");

	public void openURL(String websiteURLKey) {
		driver.get(websiteURLKey);
	}

	public void Studychairs() throws InterruptedException {

		(driver.findElement(study)).click();
		Thread.sleep(1000);
		driver.findElement(chair).click();
	}

	public void printstudydetails() throws InterruptedException {
		System.out.println("*****List of study chairs under collections tab*****");

		for (int i = 2; i < 3; i++) {
			WebElement headerList = driver
					.findElement(By.xpath("(//ul[@class='inline-list left'])[6]/li[" + i + "]/div[1]/a[1]"));
			System.out.println(headerList.getText());
			System.out.println("----------------");
			List<WebElement> ChairName = driver.findElements(chairname);
			List<WebElement> ChairCost = driver.findElements(chairprice);
			List<WebElement> ChairDetails = driver.findElements(details);
			for (int i1 = 0; i1 < 3; i1++) {
				System.out.println(ChairName.get(i1).getText() + (ChairDetails.get(i1).getText()) + " - "
						+ ChairCost.get(i1).getText());

			}

		}

		System.out.println(" ");
	}

}
