package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//Delete Lead program
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login 
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//goto leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(10000);
	
		//Capture the lead ID of the first resulting lead
		WebElement leadIdElement = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//div/a)[1]"));
		String leadIdValue = leadIdElement.getText();
		System.out.println(leadIdValue);
	
		//Click the first resulting lead.
		//- Click the "Delete" button.
		leadIdElement.click();
		Thread.sleep(2000);
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(2000);
		//Verify the presence of the message "No records to display" in the Lead List. This 
		//message confirms the successful deletion
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys(leadIdValue);
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String actualValue=driver.findElement(By.className("x-paging-info")).getText();
		if(actualValue.contains("No records to display"))
			System.out.println("No records found message is  verified");
		else
			System.out.println("Record verification is failed");
		
		driver.close();
	}

}
