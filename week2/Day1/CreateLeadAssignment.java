package week2.Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class CreateLeadAssignment {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("samo");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Micheal");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sammmmmm");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
		
		if(title.contains("View Lead"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		
		
	driver.close();

	}

}
