package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecMeth;

public class LogoutPage extends ProjectSpecMeth {

	
	public LogoutPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void logoutButton() throws InterruptedException
	{
		Thread.sleep(1000);
	driver.findElement(By.className("decorativeSubmit")).click();
	
	}
}
