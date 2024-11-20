package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecMeth;
import pages.Login1;
import pages.MyHome;

public class TC_003_CreateAccount extends ProjectSpecMeth{
  @Test
  public void testcase_03() throws InterruptedException 
  {
	  Login1 lg=new Login1(driver);
	  lg.enterUsername().enterPassowrd().clickLogin().clickCRM();
	  Thread.sleep(1000);		
	  Assert.assertEquals(driver.getTitle(),"My Home | opentaps CRM");
	  
	  MyHome mh=new MyHome(driver);
	  mh.AccTab().accCreate().accName().accDes().noEmp().officeSite().submit();
  }
}
