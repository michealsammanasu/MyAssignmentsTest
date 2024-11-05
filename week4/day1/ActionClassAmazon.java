package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
public class ActionClassAmazon {

	public static void main(String[] args) throws IOException {
		
		//Precondition
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//			2. Search for "oneplus 9 pro"
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
//			3. Get the price of the first product.
			String price = driver.findElement(By.xpath("//div[contains(@class,'sg-col-20-of-24')]//span[@class='a-price-whole']")).getText();
			System.out.println("1st product Price : "+ price);
		
		
//			4. Print the number of customer ratings for the first displayed product.
			String ratings=driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]")).getText();
			System.out.println("1st product customer ratings : "+ratings);
			
			
			
			
			
			//			5. Click the first text link of the first image.
			
			driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')]")).click();
//			6. Take a screenshot of the product displayed.
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenShot = ts.getScreenshotAs(OutputType.FILE);
			File desScreen=new File("D:\\TestL\\ScreenShot\\screenshot1.png");
			FileUtils.copyFile(screenShot,desScreen);
			
			
			
//			7. Click the 'Add to Cart' button.
	 
			Set <String> winHan=driver.getWindowHandles();
			List<String> windowHandles=new ArrayList<String> (winHan);
			String string = windowHandles.get(1);
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
			WebElement cardCount = driver.findElement(By.id("nav-cart-count"));
			int cardValueBefore=Integer.parseInt(cardCount.getText());
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(500));
			WebElement addToCard = driver.findElement(By.id("add-to-cart-button"));
			wait.until(ExpectedConditions.elementToBeClickable(addToCard));
			
			addToCard.click();
			
			
//			8. Get the cart subtotal and verify if it is correct.
			WebElement close = driver.findElement(By.id("attach-close_sideSheet-link"));
			WebElement closeAvail = wait.until(ExpectedConditions.elementToBeClickable(close));
			if(closeAvail.isDisplayed())
			close.click();
			
			int cardvalueAfter=Integer.parseInt(cardCount.getText());
			if(cardValueBefore+1==cardvalueAfter)
			{
				System.out.println("item Added in the card successfully");
			}
			else
			{
				System.out.println("Item is not added in the card");
			}
//			9. Close the browser.
		
		//driver.quit();

	}

}
