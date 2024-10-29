package week3.day1.assignment;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceLearning {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchEle = driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
		searchEle.sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@for=\"Men\"]")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//label[@for=\"Men - Fashion Bags\"]")).click();
		System.out.println(driver.findElement(By.className("length")).getText());
		
		
		List<WebElement> brandElements = driver.findElements(By.className("nameCls"));
		List<WebElement> brandName=driver.findElements(By.className("brand"));
		
		
		
		for(int i=0;i<brandElements.size();i++)
		{	System.out.print("Brand Name :"+brandName.get(i).getText());
			System.out.println(", Bag name : "+brandElements.get(i).getText());
		}
		
		driver.close();
	}

}
