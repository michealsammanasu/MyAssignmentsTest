package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;

public class WelcomePage extends ProjectSpecMeth {

	public WelcomePage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyHome clickCRM() {
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHome(driver);
	}

}
