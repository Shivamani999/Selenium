package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	WebDriver driver;
	public RediffHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    
  
  
  @FindBy(id="srchword")
  WebElement search;
  
  @FindBy(xpath="//input[@type='submit']")
  WebElement submit;
  
  
  
  
    
    public WebElement Search()
    {
    	return search;
    }
   
    public WebElement Submit()
    {
    	return submit;
    }
   
 
	

	
	
	
}
