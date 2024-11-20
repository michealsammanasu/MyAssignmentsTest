package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExClassReadData;


public class ProjectSpecMeth extends ExClassReadData
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
	
	@DataProvider(name="ExcelDataPro")
	public String[][] readExcel() throws IOException
	{
		
		
 		return readMethod(file);
		
	}
}
