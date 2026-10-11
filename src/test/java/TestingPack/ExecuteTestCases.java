package TestingPack;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePaack.BaseClass;

public class ExecuteTestCases extends BaseClass{
	 @Test
	 public void OrangeHRMTestcases() throws InterruptedException, AWTException, IOException
	 {
		 Scripting S = new Scripting();
		 S.Login();
		 //S.addoneemp();
		 //S.addoneempexcel();
		 S.addmultipleempexcel();
	 }
	  
}
