package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;

public class CreateAccount extends ProjectSpecMeth
{
		
	public CreateAccount accountTab()
	{
		getDriver().findElement(By.linkText("Accounts")).click();
		return this;
	}
	
	public CreateAccount accCreate()
	{
	getDriver().findElement(By.partialLinkText("Create")).click();
	return this;
	}
	
	public CreateAccount accName(String accName)
	{
	
	getDriver().findElement(By.id("accountName")).sendKeys(accName);
	return this;
	}
	
	public CreateAccount accDes(String desc)
	{
	getDriver().findElement(By.name("description")).sendKeys(desc);
	return this;
	
	}
	public CreateAccount noEmp(String noEmp)
	{
	getDriver().findElement(By.id("numberEmployees")).sendKeys(noEmp);
	return this;
	}
	public CreateAccount officeSite(String offSiteName)
	{
	getDriver().findElement(By.id("officeSiteName")).sendKeys(offSiteName);
	return this;
	}
	public CreateAccount submit()
	{
	getDriver().findElement(By.className("smallSubmit")).click();
	return this;
	}
			
	
	

}
