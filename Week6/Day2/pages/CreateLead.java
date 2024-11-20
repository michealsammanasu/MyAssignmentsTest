package pages;

import org.openqa.selenium.By;


import base.ProjectSpecMeth;




public class CreateLead extends ProjectSpecMeth{

//	public CreateLead(ChromeDriver driver)
//	{
//		this.driver=getDriver();
//	}
	public CreateLead clickCLeadTab()
	{
		getDriver().findElement(By.linkText("Leads")).click();
		return this;
	}	
	public CreateLead clickCLButton()
	{
		getDriver().findElement(By.partialLinkText("Create")).click();
		return this;
	}	
	public CreateLead enterComName(String company)
	{
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}	
	public CreateLead enterFirstName(String first)
	{
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(first);
		return this;
	}
	public CreateLead enterLastName(String last)
	{
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(last);
		return this;
	}
	public CreateLead selectProfile(String pro)
	{
		getDriver().findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(pro);
		return this;
	}	
	public void clickSubmit()
	{
		getDriver().findElement(By.name("submitButton")).click();
	}
}
