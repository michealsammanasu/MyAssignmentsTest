package pages;

import org.openqa.selenium.By;


import base.ProjectSpecMeth;



public class Login1 extends ProjectSpecMeth
{

//	public Login1 (ChromeDriver driver)
//	{
//		this.driver=driver;
//	}
	public Login1 enterUsername(String userName)
	{
		getDriver().findElement(By.id("username")).sendKeys(userName);
		return this;
		
	}
	public Login1 enterPassowrd(String pass)
	{
		getDriver().findElement(By.id("password")).sendKeys(pass);
		return this;
		
	}
	public WelcomePage clickLogin()
	{
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
