package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWEditLeadClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		

		//Login 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		// Create lead with the CompanyName,FirstName,LastName, 
		//FirstName (Local),Department,Description,email, State/Province
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("samoram");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Micheal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sammmmmm");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("mich");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing learning");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("roughmail@gmail.com");
		
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel=new Select(state);
		sel.selectByVisibleText("New York");
		
		
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		if(title.contains("View Lead"))
			System.out.println("Lead created");
		else
			System.out.println("Lead is not created");
		Thread.sleep(1000);
		
		//Update the Lead , Clear the Description,Fill the Important Note
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Software testing learning");
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Updated the lead. Title is : "+driver.getTitle());
		
		driver.close();
		
		
		
	}

}
