package week6.day2.Tests;

import org.testng.annotations.Test;

import week6.day2.Hooks.TestNgHooks;
import week6.day2.Pages.LoginPage;

public class LoginTest extends TestNgHooks{
	
	@Test
	public void login() {
		new LoginPage()
			.typeUsername("admin")
			.typePassword("India@123")
			.clickLogin()
			.verifyHomePage();
			
	}

}
