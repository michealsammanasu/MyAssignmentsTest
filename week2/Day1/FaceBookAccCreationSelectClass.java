package week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAccCreationSelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("amalorpavam");
		driver.findElement(By.name("lastname")).sendKeys("mary");
		driver.findElement(By.name("reg_email__")).sendKeys("9999999923");
		driver.findElement(By.id("password_step_input")).sendKeys("Hello@123");
		
		WebElement dayElement=driver.findElement(By.id("day"));
		Select day=new Select(dayElement);
		day.selectByIndex(4);
		
		WebElement monthElement=driver.findElement(By.id("month"));
		Select month=new Select(monthElement);
		month.selectByIndex(4);
		
		
		WebElement yearElement=driver.findElement(By.id("year"));
		Select year=new Select(yearElement);
		year.selectByValue("1980");
		
		driver.findElement(By.xpath("//*[text()='Female']")).click();
		
	}

}
