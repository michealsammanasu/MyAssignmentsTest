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
	
	public String file;
	private static final ThreadLocal<ChromeDriver> cdriver=new ThreadLocal<ChromeDriver>();
	public void setDriver()
	{
		cdriver.set(new ChromeDriver());
	}
	public ChromeDriver getDriver()
	{
		return cdriver.get();
	}
	@BeforeMethod
	public void preCondition()
	{
		setDriver();
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().get("http://leaftaps.com/opentaps/");
	}
	@AfterMethod
	public void postCondition()
	{
		getDriver().quit();
	}
	
	@DataProvider(name="ExcelDataPro")
	public String[][] readExcel() throws IOException
	{
		
		
 		return readMethod(file);
		
	}
}
