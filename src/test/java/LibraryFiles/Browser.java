package LibraryFiles;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Browser {
	static WebDriver driver;
	
  public static  WebDriver  startBrowser(String browsername, String url) {
	  if (browsername.equals("firefox"))
	  {System.setProperty("webdriver.gecko.driver", "C:\\swathi\\day1\\chromedriver.exe");
	  driver = new FirefoxDriver();
	  }
	  else if (browsername.equals("chrome"))
	  {System.setProperty("webdriver.chrome.driver", "C:\\swathi\\day1\\chromedriver.exe");
	  driver = new ChromeDriver();
	  }
	  
	  driver.manage().window().maximize();
	  driver.get(url);
	  return driver;
  }
  
  }


