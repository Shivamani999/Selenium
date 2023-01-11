package Testcases;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginapplication {
// Login page class implemented in normal page object pattern style
	
	// Home page class implemented in Page object factory methdos
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emaild().sendKeys("Shivamani");
		rd.Password().sendKeys("something");
		//rd.submit().click();
		rd.Home().click();
		RediffHomepage rh=new RediffHomepage(driver);
		rh.Search().sendKeys("rediff");
		rh.Submit().click();
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
}
