package testCaseEmail;

import testBaseEmail.BaseClassEmail;
import org.testng.annotations.Test;
import pageObjects.GmailPage;


public class TC001_ZeplynEmail extends BaseClassEmail{
	
	
	@Test
	public void test() {
		
		GmailPage gp = new GmailPage(driver);
		gp.clickSighInButton();
		gp.inputEmail();
		gp.clickEmailNextBtn();
		gp.inputpss();
		gp.clickPassNextBtn();
		
	
	 
		gp.inputsearcgfld();
		gp.clickSearchedopn();
		
		
	}

}
