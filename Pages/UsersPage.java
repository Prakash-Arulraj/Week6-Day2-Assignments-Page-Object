package week6.day2.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import week6.day2.Hooks.TestNgHooks;

public class UsersPage extends TestNgHooks {
	Set<String> allWindowHandles = driver.getWindowHandles();
	List<String> NextWindowHandles = new ArrayList<String>(allWindowHandles);

	public UsersPage clickSearch(String name) throws InterruptedException {
		driver.switchTo().window(NextWindowHandles.get(1));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(name, Keys.ENTER);
		Thread.sleep(5000);
		return this;
	}
	public CreatePage clickFirstMatch() {
		driver.findElement(By.xpath("//tr[@collapsed='true']//a")).click();
		return new CreatePage();
	}
	public UsersPage clickDelete() {
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		return this;
	}
	/*
	 * public IncidentsPage acceptAlert() { Alert alert = driver.switchTo().alert();
	 * System.out.println("Alert: " + alert.getText()); alert.accept(); return new
	 * IncidentsPage(); }
	 */
	

}
