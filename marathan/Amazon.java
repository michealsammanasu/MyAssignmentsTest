package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		01) Launch Chrome  		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
//	02) Load https://www.amazon.in/
//	     add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");		
//	03) Type "Bags for boys" in the Search box
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bags for boys");		
//	04) Choose the item in the result (bags for boys)
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);			
//	05) Print the total number of results (like 50000)
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();		
//	06) Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='Skybags']")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='Safari']")).click();
		
//	07) Choose New Arrivals (Sort)
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
//	08) Print the first resulting bag info (name, discounted price)
		String bagName=	driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')]")).getText();
		System.out.println(bagName);
		String price=driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//span[@class='a-price']")).getText();
		System.out.println("Rupees :"+price);
		//	09) Get the page title and close the browser(driver.close())
		System.out.println("Page Title is :");
		System.out.println(driver.getTitle());
	}

}
