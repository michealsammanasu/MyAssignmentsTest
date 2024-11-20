package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecMeth;
import pages.CreateLead;
import pages.Login1;



public class RunCreateLead extends ProjectSpecMeth
{
	
	@BeforeTest
	public void setFile()
	{
		
		file="CreateLead";
		
	}

	@Test(dataProvider="ExcelDataPro")
	public void runCL(String username,String password,String ComName,String firstName,String LastName,String profile) throws InterruptedException
	{
	Login1 log=new Login1();
	log.enterUsername(username).enterPassowrd(password).clickLogin().clickCRM();
	Thread.sleep(1000);	
	Assert.assertEquals(getDriver().getTitle(),"My Home | opentaps CRM");
	
	CreateLead cl=new CreateLead();
	cl.clickCLeadTab().clickCLButton().enterComName(ComName)
	.enterFirstName(firstName).enterLastName(LastName).selectProfile(profile).clickSubmit();
	Thread.sleep(1000);
	Assert.assertEquals(getDriver().getTitle(),"View Lead | opentaps CRM");
	
	
	
	
	}
	
}
