package BasePaack;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties obj;
	
  @BeforeClass
  public void openmyBrowswer() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\ApiProject\\Batch112_12PM_OrangeHRM\\MyBrowser\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  FileInputStream fis = new FileInputStream("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\src\\data\\java\\TestData\\MyDataInfo");
	  
	  obj = new Properties();
	  obj.load(fis);
	  
	// System.out.println(obj.getProperty("R")); 
	  
	  
	  
	  
	  
	  
	  
	  
	  }

  @AfterMethod
  public void closeBro() {
	  
	 // driver.quit();
	  
	  System.out.println("Program executed successfully");
	  
	  
  }

 

}
