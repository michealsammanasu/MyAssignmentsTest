package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWCheckBoxInterActoins {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//1. Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[1]")).click();
		
		//2. Click on the "Notification Checkbox." - Verify that the expected message is displayed.
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String actualtext = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if (actualtext.equals("Checked"))
			System.out.println("Message verified successfully for notification");
		else
			System.out.println("Message is not same actual message is "+actualtext );
		
		//3. Click on your favorite language (assuming it's related to checkboxes)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		
		//4. Click on the "Tri-State Checkbox."Verify which tri-state option has been chosen
		Thread.sleep(10000);
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div/div/div/div[2]")).click();
		String actualTriMess = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		System.out.println(actualTriMess);
		
		//5. Click on the "Toggle Switch."Verify that the expected message is displayed.
		
		Thread.sleep(10000);
		driver.findElement(By.className("ui-toggleswitch-slider")).click();

		String actualTogMess = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if (actualTogMess.equals("Checked"))
			System.out.println("Message verified successfully for Toggle switch");
		else
			System.out.println("Message is not same actual message is "+actualTogMess );
		
		//6.Select multiple options on the page (details may be needed).
		
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-multiple')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[2]/label")).click();
		driver.findElement(By.xpath("//li[3]/label")).click();
		driver.findElement(By.xpath("//li[1]/label")).click();
		driver.findElement(By.xpath("//li[4]/label")).click();
		driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();
		
		driver.close();
	
	
	
	}

}
