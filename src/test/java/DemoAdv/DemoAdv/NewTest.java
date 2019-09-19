package DemoAdv.DemoAdv;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import okhttp3.Cookie;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NewTest {

	WebDriver driver;
	
  @Test
  public void demo() throws IOException {
//		Robot robot = new Robot();
//		System.setProperty("webdriver.chrome.driver","C:\\swathi\\day1\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
////		
//
//		//open google
//		driver.get("https://www.google.com");
//		// title of web page
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String sText =  js.executeScript("return document.title;").toString();
//   		System.out.println(sText);
//		
//		//click a button
//		WebElement Element_Name = driver.findElement(By.linkText("Gmail"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();",Element_Name);
//		
//		JavascriptExecutor popUp  = (JavascriptExecutor)driver;
//		executor.executeScript("alert('hello world');",driver.findElement(By.xpath("//button[@id='reload-button']")));
		
		
		
//		Cookie name = new Cookie("mycookie", "123456789123");
//        driver.manage().addCookie(name);
//        Cookie name1 = new Cookie("mycookie1", "123456789222");
//        driver.manage().addCookie(name1);
//        
//        //delete all cookies by below code
//      //  driver.manage().deleteAllCookies();
//        Set<Cookie> cookiesList =  driver.manage().getCookies();
//        for(Cookie getcookies :cookiesList) {
//            System.out.println(getcookies );}
		
		File src = new File("C:\\swathi\\demoSheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		
		String data0 = Sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data in excel"+data0);
		
		String data1 =  Sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data in excel "+data1);
		
		wb.close();
		
  }
//  @BeforeTest
//  public void beforeTest() {
//	// opening a chrome browser 	  
//	 System.setProperty("webdriver.chrome.driver","C:\\swathi\\chromedriver.exe");
//	 driver = new ChromeDriver();
//  
//  }

  @AfterTest
  public void afterTest() {
  }

}  
