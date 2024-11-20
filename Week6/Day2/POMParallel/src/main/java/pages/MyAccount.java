package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;

public class MyAccount extends ProjectSpecMeth {

	public MyAccount (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CreateAccount accCreate()
	{
	driver.findElement(By.partialLinkText("Create")).click();
	return new CreateAccount(driver);
	}
}
