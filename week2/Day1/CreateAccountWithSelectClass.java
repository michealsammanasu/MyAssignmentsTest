package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("samosonrajrani");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		
		
		
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(industry);
		sel.selectByIndex(3);
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select sel1=new Select(ownership);
		sel1.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select sel2=new Select(source);
		sel2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select sel3=new Select(marketing);
		sel3.selectByIndex(6);
		
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel4=new Select(state);
		sel4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String ActualTitle=driver.getTitle();
		//*[@id="ext-gen1184"]
		if(ActualTitle.contains("Account Details"))
			System.out.println("Passed");
		else
		{
			System.out.println("Failed");
			System.out.println("Actual Title name : "+ActualTitle);
		}
			
			driver.close();

	}

}
