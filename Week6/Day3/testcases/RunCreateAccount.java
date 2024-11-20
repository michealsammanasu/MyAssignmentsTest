package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecMeth;
import pages.CreateAccount;
import pages.Login1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class RunCreateAccount extends ProjectSpecMeth{
  @Test(dataProvider="ExcelDataPro")
  public void createAcc(String userName,String Pass,String accName,String desc,String noEmp,String OfficeSite) throws InterruptedException 
  {
	  Login1 lg=new Login1();
	  lg.enterUsername(userName).enterPassowrd(Pass).clickLogin().clickCRM();
	  Thread.sleep(1000);		
	  Assert.assertEquals(getDriver().getTitle(),"My Home | opentaps CRM");
	  
	  CreateAccount ca=new CreateAccount();
	  ca.accountTab().accCreate().accName(accName).accDes(desc).noEmp(noEmp).officeSite(OfficeSite).submit();
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  file="CreateAcc";
  }

}
