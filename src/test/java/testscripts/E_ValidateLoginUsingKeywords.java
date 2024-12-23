package testscripts;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.C_ApplicationKeywords;
import keywords.C_ApplicationKeywords;
import utils.UtilKit;

public class E_ValidateLoginUsingKeywords extends BaseTest  {
	
	@Test
	public void validateLoginTest()
	{
		C_ApplicationKeywords app=new C_ApplicationKeywords();
		
		app.openBrowser();
		
		app.launchApp();
		
		app.type("username_textbox", "yogesh6855");
		
		app.type("password_textbox", "Target@2025");
		
		app.click("login_button");
		
		app.validateTitle("Adactin.com - Search Hotel");
		
		app.close();
	}
	
	

}
