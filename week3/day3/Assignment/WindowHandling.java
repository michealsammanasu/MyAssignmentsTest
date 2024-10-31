package week3.day3.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
	//	Initialize ChromeDriver
	//	- Load the URL (http://leaftaps.com/opentaps/control/login)
	//	- Maximize the browser window
	//	- Add an implicit wait to ensure the webpage elements are fully loaded
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
//		login with the user name and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		
//		- Click on the Contacts button and Merge contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();


//		- Click on the widget of the "From Contact".
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[1]")).click();
		
//Switch to the new window
//		- Click on the first resulting contact.
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winHanStr=new ArrayList<String>(winHandle);
	    driver.switchTo().window(winHanStr.get(1));	    
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(winHanStr.get(0));
	
//		- Click on the widget of the "To Contact".
//		- Click on the second resulting contact.
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[2]")).click();
		Set<String> winHandle1 = driver.getWindowHandles();
		List<String> winHanStr1=new ArrayList<String>(winHandle1);
	    driver.switchTo().window(winHanStr1.get(1));	    
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
	    driver.switchTo().window(winHanStr1.get(0));
		
//		- Click on the Merge button.
		driver.findElement(By.className("buttonDangerous")).click();
//		- Accept the alert.
		driver.switchTo().alert().accept();
//		- Verify the title of the page.
	
		System.out.println(driver.getTitle());
		
		

	}

}
