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
		
	public CreateAccount accName()
	{
	
	driver.findElement(By.id("accountName")).sendKeys("Michearl");
	return this;
	}
	
	public CreateAccount accDes()
	{
	driver.findElement(By.name("description")).sendKeys("HEllo");
	return this;
	
	}
	public CreateAccount noEmp()
	{
	driver.findElement(By.id("numberEmployees")).sendKeys("20");
	return this;
	}
	public CreateAccount officeSite()
	{	driver.findElement(By.id("officeSiteName")).sendKeys("runfrom");
	return this;
	}
	public ViewAccount submit()
	{
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewAccount();
	}
			
	
	

}
