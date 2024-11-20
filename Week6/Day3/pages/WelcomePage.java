package pages;

import org.openqa.selenium.By;


import base.ProjectSpecMeth;




public class WelcomePage extends ProjectSpecMeth
{
//	public WelcomePage(ChromeDriver driver)
//	{
//		this.driver=driver;
//	}
	
	public CreateLead clickCRM()
	{

		getDriver().findElement(By.partialLinkText("CRM/SFA")).click();
		return new CreateLead();
	}

}
