package testcases;


import org.testng.annotations.Test;

import base.ProjectSpecMeth;
import pages.Login1;
import pages.LogoutPage;

public class TC_002_LogoutPage extends ProjectSpecMeth
{
  @Test
  public void testcase_02() throws InterruptedException 
  {
	  Login1 lg=new Login1(driver);
	  lg.enterUsername().enterPassowrd().clickLogin();
	  LogoutPage lo=new LogoutPage(driver);
	  lo.logoutButton();
  }
}
