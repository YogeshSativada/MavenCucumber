package testscripts;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchHotelPage;

public class H_ValidateLoginUsingPOM extends BaseTest { 
	
	
	@Test
	public void validateLoginTest() throws InterruptedException
	{
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.usernameTextbox("yogesh6855");
		
		loginPage.passwordTextbox("Target@2025");
		
		LoginPage.screenshot();
		
		loginPage.loginButton();
		
			
		Thread.sleep(3000);
		
		SearchHotelPage searchHotelPage=PageFactory.initElements(driver, SearchHotelPage.class);
		
		searchHotelPage.validateTitle("Adactin.com - Search Hotel");
		
		SearchHotelPage.screenshot();
		
		
	}

}
