package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
    public class LoginPageUsingPageFactory {
	WebDriver driver;
	
	public LoginPageUsingPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	//this helps in storing the elements in buffer was  the below fin by is used multiple times
	@CacheLookup
	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
		
	@FindBy(how=How.NAME,using="login")
	WebElement signin;
		
	public void login(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		signin.click();		
		
	}
	
	

}
