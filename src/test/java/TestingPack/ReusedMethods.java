package TestingPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends ExecuteTestCases{
	
	public WebElement xp(String k)
	{
		return driver.findElement(By.xpath(obj.getProperty(k)));
	}
	
	public void t(int a) throws InterruptedException
	{
		int j = a * 1000;
		Thread.sleep(j);
		
	}
	
	public void ss(String a) throws IOException
	{
		File S1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File T1 = new File("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\TestProofs\\" +a +".jpg");
		FileHandler.copy(S1, T1);
	}

}
