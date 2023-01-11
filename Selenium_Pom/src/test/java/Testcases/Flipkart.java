package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {

	WebDriver driver;

	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.name("q")).sendKeys("apple");
		Thread.sleep(2000);
		List<WebElement> opt = driver
				.findElements(By.xpath("//div[contains(@class,'lrtEPn')]"));
		for (WebElement option : opt) {
			String currOpt = option.getText();
			if(currOpt.equals("apple phone")) {
				option.click();
				break;
			}
		}
	}
}
