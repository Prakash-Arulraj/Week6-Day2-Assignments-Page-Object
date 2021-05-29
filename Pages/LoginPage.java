package week6.day2.Pages;

import org.openqa.selenium.By;

import week6.day2.Hooks.TestNgHooks;



public class LoginPage extends TestNgHooks {

	public LoginPage typeUsername(String username) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@id ='user_name']")).sendKeys(username);
		return this;

	}

	public LoginPage typePassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElement(By.id("sysverb_login")).click();
		return new HomePage();
	}

}
