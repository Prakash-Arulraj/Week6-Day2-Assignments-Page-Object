package week6.day2.Tests;

import org.testng.annotations.Test;

import week6.day2.Hooks.TestNgHooks;
import week6.day2.Pages.LoginPage;

public class CreateIncidentTest extends TestNgHooks {

	@Test
	public void login() throws InterruptedException {
		new LoginPage()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLogin()
			.verifyHomePage()
			.clickFillter("incident")
			.clickCreateNew()
			.getNumber()
			.clickCallerId()
			.clickSearch("guest")
			.clickFirstMatch()
			.clickDescription("Create a New Incident By Prakash")
			.clickSubmit();
			
	}

}
