package Marathan2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;


public class OrderingMobile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		1. Launch ServiceNow application
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev186929.service-now.com/");
//		2. Login with valid credentials username as admin and password 
		
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
//		3. Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
		Thread.sleep(5000);
		Shadow sh=new Shadow(driver);
		
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		
//		4. Click on  mobiles
		WebElement frame = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
//		5. Select Apple iphone13pro
		
		driver.findElement(By.xpath("//strong[contains(text(),'Apple iPhone 13 pro')]")).click();
		
		
//		6. Choose yes option in lost or broken iPhone, enter the mobile number
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='sc-radio']//label[text()='Yes']")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("9999999999");
		
//		7. Select Unlimited from the dropdown in Monthly data allowance
		WebElement dataAllow = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select se=new Select(dataAllow);
		//dataAllow.click();
		se.selectByValue("unlimited");
		
//		8. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//input[@class='cat_item_option radio']/following-sibling::label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("(//div[@class='form-group question_spacer io_table is-prefilled sc-row']//input[@class='cat_item_option radio sc-radio'])[3]"));
//		9. Click on Order now option
		driver.findElement(By.id("oi_order_now_button")).click();
		
//		10. Verify order is placed and copy the request number
		
		String text = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		if(text.contains("Thank you"))
		{
			System.out.println("Ordered successfully");
		System.out.println(driver.findElement(By.id("requesturl")).getText());
		}
//		11.Take a Snapshot of order placed page
		TakesScreenshot sc=(TakesScreenshot) driver;
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("D:\\TestL\\orderMobile.png"));
		
		driver.close();
	}

}
