package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;

public class MyHome extends ProjectSpecMeth {

	public MyHome (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyAccount AccTab()
	{
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccount(driver);
		
	}
}
