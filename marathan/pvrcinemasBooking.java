package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pvrcinemasBooking {

	public static void main(String[] args) {
		
		//Launch and load URL
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//4) Click on Cinema under Quick Book
		driver.findElement(By.className("cinemas-inactive")).click();
		//5) Select Your Cinema
		driver.findElement(By.xpath("//div[@class='quick-left']/div")).click();
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//span[text()='INOX National,Virugambakkam Chennai']")).click();
		//6) Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		//7) Select Your Movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[text()='BLACK']")).click();
		//8) Select Your Show Time
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[text()='10:30 PM']")).click();
		//9) Click on Book Button
		driver.findElement(By.xpath("//button[contains(@class,'p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn')]")).click();
		//10) Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		//11) Click any one available seat
		driver.findElement(By.xpath("//tr[@class='seats-row']//span[@id='SL.SILVER|D:13']")).click();
		//12) Click Proceed Button
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		//13) Print the Seat info under book summary
		String seatInfor=driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		System.out.println(seatInfor);
		//14) Print the grand total under book summary
		System.out.println(driver.findElement(By.xpath("//div[@class='grand-prices']")).getText());
		//15) Click Proceed Button
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		driver.findElement(By.xpath("//button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
		//16) Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		//17) Print Your Current Page title
		System.out.println("Page Title is :"+driver.getTitle());
		//18) Close Browser
		driver.close();
		
		
	}

}
