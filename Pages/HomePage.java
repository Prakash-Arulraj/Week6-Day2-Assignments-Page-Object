package week6.day2.Pages;

import org.openqa.selenium.By;

import week6.day2.Hooks.TestNgHooks;

public class HomePage extends TestNgHooks {

	public HomePage verifyHomePage() {
		System.out.println(driver.getCurrentUrl());
		return this;
	}
	public HomePage clickFillter(String value) {
		driver.findElement(By.id("filter")).sendKeys(value);
		return this;
	}
	public CreatePage clickCreateNew() {
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		return new CreatePage();
	}
	public HomePage clickFillterUpdate(String value) {
		driver.findElement(By.id("filter")).sendKeys(value);
		return this;
	}
	public IncidentsPage clickIncidents() {
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		return new IncidentsPage();
	}
	
	
	
	

}
