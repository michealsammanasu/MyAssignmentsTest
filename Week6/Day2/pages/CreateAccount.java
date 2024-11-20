package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;

public class CreateAccount extends ProjectSpecMeth
{
	public CreateAccount (ChromeDriver driver)
	{
		this.driver=driver;
	}
		
	public CreateAccount accName(String accName)
	{
	
	driver.findElement(By.id("accountName")).sendKeys(accName);
	return this;
	}
	
	public CreateAccount accDes(String desc)
	{
	driver.findElement(By.name("description")).sendKeys(desc);
	return this;
	
	}
	public CreateAccount noEmp(String noEmp)
	{
	driver.findElement(By.id("numberEmployees")).sendKeys(noEmp);
	return this;
	}
	public CreateAccount officeSite(String offSiteName)
	{
	driver.findElement(By.id("officeSiteName")).sendKeys(offSiteName);
	return this;
	}
	public ViewAccount submit()
	{
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewAccount();
	}
			
	
	

}
