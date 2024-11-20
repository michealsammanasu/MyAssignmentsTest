package base;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class ProjectSpecMeth  
{
	public ChromeDriver driver; 
	public String file;
	
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
	}
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
	
	
}
