package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWLeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		//Click on the button with the text ‘Click and Confirm title.’
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				String title=driver.getTitle();
				if(title.equals("Dashboard"))
					System.out.println("Title verified successfully");
				else
					System.out.println("Title is not match");
		
				driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement disableElement = driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]"));
		boolean disabledStatus = disableElement.isEnabled();
		if(disabledStatus==false)
			System.out.println("Disabled Status of button is verified successfully");
		else
		System.out.println("Disabled status is not available");

		
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("Location of submit button is "+ location);
		
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement colorElement = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-icon-left ui-button-secondary')]"));
		String color = colorElement.getCssValue("background-color");
		System.out.println("Button color is "+color);
		
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement heightWidth = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-icon-right')]"));
		Dimension elesize = heightWidth.getSize();
		System.out.println("Element height is "+elesize.height+","+"element width is "+elesize.width);
		
		
		driver.close();
	}

}
