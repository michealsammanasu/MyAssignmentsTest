package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClassBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		
//		Navigate to https://www.bigbasket.com/.

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Click on "Shop by Category".
		//Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]")).click();
		Thread.sleep(10000);
		
//		3. Mouse over "Foodgrains, Oil & Masala".
		Actions act=new Actions(driver);
		WebElement food = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		System.out.println( food.getText());
		act.moveToElement(food).perform();	
		
		//Thread.sleep(10000);

//			4. Mouse over "Rice & Rice Products".
		WebElement rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(rice).perform();
//			5. Click on "Boiled & Steam Rice".
		WebElement boildRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		act.moveToElement(boildRice).click().build().perform();
//			6. Filter the results by selecting the brand "bb Royal".
		//Thread.sleep(100000);
		WebElement filter = driver.findElement(By.xpath("//input[@id='i-BBRoyal' and @type='checkbox']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", filter);
		
		Thread.sleep(20000);
		
		//			7. Click on "Tamil Ponni Boiled Rice".
		
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
//			8. Select the 5 Kg bag.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winHan=new ArrayList<String>(windowHandles);
		driver.switchTo().window(winHan.get(1));
		Thread.sleep(20000);
		WebElement kg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		js.executeScript("arguments[0].click();", kg);
		
		
//			9. Check and note the price of the rice.
		WebElement price = driver.findElement(By.xpath("//table/tr[contains(@class,'flex items-center justify')]/td[1]"));
		System.out.println("Price is : "+price.getText());
		
		
		//			10. Click "Add" to add the bag to your cart.
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
//			11. Verify the success message that confirms the item was added to your cart.
		String Message = driver.findElement(By.xpath("//p[contains(text(),'An item has been added')]")).getText();
		if(Message.equalsIgnoreCase("An item has been added to your basket successfully"))
		{
			System.out.println("Added successfully");
		}
		else
		{
			System.out.println("not added to the card");
		}
		//			12. Take a snapshot of the current page
		
		TakesScreenshot scrObj=(TakesScreenshot)driver;
		
		File scrFile = scrObj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("D:\\TestL\\ScreenShot\\BigBasket.png"));
		
//			13. Close the current window.
		driver.switchTo().window(winHan.get(1)).close();
//			14. Close the main window
//	
		driver.switchTo().window(winHan.get(0)).close();
		
		
		

	}

}
