package testscripts;


import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import keywords.C_ApplicationKeywords;
import utils.UtilKit;

public class F_ValidateLoginUsingHybrid extends BaseTest  {
	
	@Test(dataProvider = "getData")
	public void validateLoginTest(HashMap<String,String> dataMap)
	{
		C_ApplicationKeywords app=new C_ApplicationKeywords();
		
		app.openBrowser();
		
		app.launchApp();
		
		app.type("username_textbox", dataMap.get("username"));
		
		app.type("password_textbox", dataMap.get("password"));
		
		app.click("login_button");
		
		app.validateTitle(dataMap.get("Expected Title"));
		
		app.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestData("TC-100");
		
		return data;
	}
	

}
