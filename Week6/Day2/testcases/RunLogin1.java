package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecMeth;
import pages.Login1;




public class RunLogin1 extends ProjectSpecMeth{
	
	
		@Test(dataProvider="ExcelDataPro")
	public void runLogin(String userName,String Pass)
	{
		System.out.println("from run login method");
		Login1 lp=new Login1 ();
		lp.enterUsername(userName).enterPassowrd(Pass).clickLogin().clickCRM();
	}
		
		
		
@BeforeTest
public void setFile()
{
	
	file="Login";
	
}
}
