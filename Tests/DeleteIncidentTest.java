package week6.day2.Tests;

import org.testng.annotations.Test;

import week6.day2.Hooks.TestNgHooks;
import week6.day2.Pages.LoginPage;

public class DeleteIncidentTest extends TestNgHooks{
	
	@Test
	public void login() throws InterruptedException {
		new LoginPage()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLogin()
			.verifyHomePage()
			.clickFillterUpdate("incidents")
			.clickIncidents()
			.clickNumber()
			.typeNumber("INC0010066")
			.selectBox()
			.clickName()
			.clickDelete();
			/*.acceptAlert();*/
			
			
			
				
			
			

	}	

}
