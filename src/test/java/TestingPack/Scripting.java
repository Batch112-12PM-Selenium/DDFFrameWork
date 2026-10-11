package TestingPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Scripting extends ReusedMethods{
	
	public void Login() throws InterruptedException, IOException {
		  driver.get(obj.getProperty("URL"));
		  xp("XUN").sendKeys(obj.getProperty("UN"));
		  xp("XPWD").sendKeys(obj.getProperty("PWD"));
		  xp("XSUB").click();
		  Thread.sleep(1000);
		  ss("After_Login");
	  }
	
	public void addoneemp() throws InterruptedException, AWTException
	{
		t(2);
		
		Actions A = new Actions(driver);
		A.moveToElement(xp("XPIM")).perform();
		t(1);
		xp("XADD").click();
		t(2);
		
		driver.switchTo().frame(xp("XFRAME"));
		xp("XID").clear();
		t(1);
		xp("XID").sendKeys("345345");
		xp("XFIRST").sendKeys("Jasmine");
		xp("XLAST").sendKeys("Interview");
		xp("XMID").sendKeys("Running");
		xp("XNICK").sendKeys("walking");
		t(1);
		
		A.moveToElement(xp("XPHOTO")).click().perform();
		t(1);
		
		StringSelection ss = new StringSelection("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\EmpPhotos\\Arrays.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		t(1);
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		t(1);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		t(1);
		
		xp("XSAVE").click();
		
		t(5);
		
		xp("XBACK").click();
	}
	
	//create method to add one emp through excel
	public void addoneempexcel() throws InterruptedException, AWTException, IOException
	{
		t(2);
		FileInputStream fis = new FileInputStream("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\src\\data\\java\\TestData\\OrangeHRMData112.xlsx");
		
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sht = w.getSheet("CreateEmployee");
		
		int eid = (int)sht.getRow(1).getCell(0).getNumericCellValue();
		String efirst = sht.getRow(1).getCell(1).getStringCellValue();
		String elast = sht.getRow(1).getCell(2).getStringCellValue();
		String emid = sht.getRow(1).getCell(3).getStringCellValue();
		String enick = sht.getRow(1).getCell(4).getStringCellValue();
		
		Actions A = new Actions(driver);
		A.moveToElement(xp("XPIM")).perform();
		t(1);
		xp("XADD").click();
		t(2);
		
		driver.switchTo().frame(xp("XFRAME"));
		xp("XID").clear();
		t(1);
		xp("XID").sendKeys(String.valueOf(eid));
		xp("XFIRST").sendKeys(efirst);
		xp("XLAST").sendKeys(elast);
		xp("XMID").sendKeys(emid);
		xp("XNICK").sendKeys(enick);
		t(1);
		
		A.moveToElement(xp("XPHOTO")).click().perform();
		t(1);
		
		StringSelection ss = new StringSelection("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\EmpPhotos\\Arrays.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		t(1);
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		t(1);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		t(1);
		
		xp("XSAVE").click();
		
		t(5);
		
		xp("XBACK").click();
	}
	
	//create method to add multiple emps through excel
	public void addmultipleempexcel() throws InterruptedException, AWTException, IOException
	{
		t(2);
		FileInputStream fis = new FileInputStream("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\src\\data\\java\\TestData\\OrangeHRMData112.xlsx");
		
		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sht = w.getSheet("CreateEmployee");
		
	for(int r = 1 ; r <= sht.getLastRowNum(); r++)
	{
		
		int eid = (int)sht.getRow(r).getCell(0).getNumericCellValue();
		String efirst = sht.getRow(r).getCell(1).getStringCellValue();
		String elast = sht.getRow(r).getCell(2).getStringCellValue();
		String emid = sht.getRow(r).getCell(3).getStringCellValue();
		String enick = sht.getRow(r).getCell(4).getStringCellValue();
		
		Actions A = new Actions(driver);
		A.moveToElement(xp("XPIM")).perform();
		t(1);
		xp("XADD").click();
		t(2);
		
		driver.switchTo().frame(xp("XFRAME"));
		xp("XID").clear();
		t(1);
		xp("XID").sendKeys(String.valueOf(eid));
		xp("XFIRST").sendKeys(efirst);
		xp("XLAST").sendKeys(elast);
		xp("XMID").sendKeys(emid);
		xp("XNICK").sendKeys(enick);
		t(1);
		
		A.moveToElement(xp("XPHOTO")).click().perform();
		t(1);
		
		StringSelection ss = new StringSelection("C:\\ApiProject\\Batch112_12PM_OrangeHRM\\EmpPhotos\\" +efirst +".jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		t(1);
		
		Robot R = new Robot();
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		t(1);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		t(1);
		ss(efirst+"_Before_Save");
		xp("XSAVE").click();
		
		t(5);
		ss(efirst+"_After_Save");
		
		xp("XBACK").click();
		t(1);
		driver.switchTo().defaultContent();
		ss(efirst+"_After_Add");
		System.out.println("The Employee with name " +efirst +" , added successfully");
		t(1);
	}  //for loop end
  }
}
