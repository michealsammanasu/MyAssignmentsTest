package week4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDataVeri {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select the from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.ENTER);
		
		//Select the to station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.ENTER);
		
		//uncheck the sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//get the train names 
		Set<String> dupli=new HashSet<String>();
				
		List<WebElement> columns = 
				driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]"));
		for(int i=1;i<columns.size();i++)
		{
			String data = columns.get(i).getText();
			boolean add = dupli.add(data);
			if(add)
			{
				System.out.println("Train name : "+data);
			}
			else
			{
				System.out.println("Duplicate train name : "+data);
			}
			
		}
		
		driver.close();

	}
}
