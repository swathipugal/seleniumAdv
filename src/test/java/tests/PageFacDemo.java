package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LibraryFiles.Browser;
import Pages.LoginPageUsingPageFactory;

public class PageFacDemo {
	@Test
	public void test()
	{
		//calling the utillitypack for initializing the browser and passing the url
		WebDriver driver=Browser.startBrowser("chrome","http://newtours.demoaut.com");
		
		//this will create a page object of loginpageNew class and return the object.
		LoginPageUsingPageFactory log=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		
		//init in above code means initializing all the elements in the page class into buffer
		//call the method
		log.login("tutorial", "tutorial");
	}
}
