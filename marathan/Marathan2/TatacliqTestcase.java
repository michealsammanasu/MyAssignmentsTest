package Marathan2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TatacliqTestcase {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
//			1. Load the url as https://www.tatacliq.com/
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tatacliq.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(20000);
			driver.findElement(By.id("wzrk-cancel")).click();
//			2. MouseHover on 'Brands'
			WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
			Actions act=new Actions(driver);
			act.moveToElement(brands).build().perform();
//			3. MouseHover on 'Watches & Accessories'
			
			WebElement watch=driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
			act.moveToElement(watch).perform();
			
			
			
			//			4. Choose the first option from the 'Featured brands'.
			
			WebElement Casio=driver.findElement(By.xpath("//div[text()='Casio']"));
			act.moveToElement(Casio).click().build().perform();
			
			
//			5. Select sortby: New Arrivals
			WebElement sortBy = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
			Select se=new Select(sortBy);
			se.selectByValue("isProductNew");
			
//			6. choose men from catagories filter.
			driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
			
//			7. print all price of watches
			Thread.sleep(1000);
			List<WebElement> priceList = driver.findElements(By.className("ProductDescription__priceHolder"));
			for(int i=0;i<priceList.size();i++)
			{
				 Thread.sleep(1000);
				 System.out.println(priceList.get(i).getText());
			}
//			8. click on the first resulting watch
			String beforePrice = priceList.get(0).getText();
			Thread.sleep(1000);
			WebElement clickEle = driver.findElement(By.className("ProductModule__imageAndDescriptionWrapper"));
			act.click(clickEle).perform();
			
			
//			9. click Add to Bag   and  get count from the Bag cart icon.
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> listWindow=new ArrayList<String>(windowHandles);
			driver.switchTo().window(listWindow.get(1));
			
			driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			
//			10. compare two price are similar
			String afterPrice = driver.findElement(By.className("ProductDetailsMainCard__price")).getText();
			
			if(afterPrice.contains(beforePrice))
			{
				System.out.println("Yes they have same price before and after 'add card'");
			}
//			11. Click on the Bag cart icon
			
			driver.findElement(By.className("DesktopHeader__myBagShow")).click();
			
			
//			12. Take a snap of the resulting page. 
			
			Thread.sleep(2000);
			TakesScreenshot st=(TakesScreenshot)driver;
			
			File screenshotAs = st.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("D:\\TestL\\ScreenShot.png"));
//			13. Close All the opened windows one by one.
			
			driver.close();
			driver.switchTo().window(listWindow.get(0));
			driver.close();
	}

}
