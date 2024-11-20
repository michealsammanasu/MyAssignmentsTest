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
	public Login1 enterUsername(String userName)
	{
		driver.findElement(By.id("username")).sendKeys(userName);
		return this;
		
	}
	public Login1 enterPassowrd(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
		
	}
	public WelcomePage clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
