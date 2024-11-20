package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;


public class Login1 extends ProjectSpecMeth
{
	

	public Login1 (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public Login1 enterUsername()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
		
	}
	public Login1 enterPassowrd()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
