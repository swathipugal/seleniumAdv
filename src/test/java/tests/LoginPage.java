package tests;

import org.testng.annotations.Test;

import LibraryFiles.Browser;
import Pages.login;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class LoginPage {
	WebDriver driver;
  @Test
  public void test () {
	  WebDriver driver = Browser.startBrowser("chrome","http://newtours.demoaut.com");
	  login log = new login(driver);
	  log.loginuser("tutorial","tutorial");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
