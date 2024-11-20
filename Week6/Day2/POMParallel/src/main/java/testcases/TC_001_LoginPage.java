package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.ProjectSpecMeth;
import pages.Login1;

public class TC_001_LoginPage extends ProjectSpecMeth{
  @Test
  public void test_01() throws InterruptedException
  {
	  Login1 lg=new Login1(driver);
	  lg.enterUsername().enterPassowrd().clickLogin().clickCRM();
	  Thread.sleep(1000);		
	  Assert.assertEquals(driver.getTitle(),"My Home | opentaps CRM");
  }
}
