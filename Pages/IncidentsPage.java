package week6.day2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import week6.day2.Hooks.TestNgHooks;

public class IncidentsPage extends TestNgHooks {
	
	public IncidentsPage verifyIncidentsPage() {
		System.out.println(driver.getCurrentUrl());
		return this;
	}
	public IncidentsPage clickNumber() {
		driver.switchTo().frame("gsft_main");
		WebElement forTextNum = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		new Select(forTextNum).selectByIndex(1);
		return this;
	}
	public IncidentsPage typeNumber(String number) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number);
		return this;
	}
	public IncidentsPage selectBox() {
		driver.findElement(By.xpath("//label[@class='checkbox-label']")).click();
		return this;
	}
	public IncidentsPage clickPriority() {
		driver.findElement(By.xpath("//table[@id='incident_table']/thead[1]/tr[1]/th[7]/span[1]/i[1]")).click();
		return this;
	}
	public IncidentPage updateSelect() {
		driver.findElement(By.xpath("//div[text()='Update Selected']")).click();
		return new IncidentPage();
	}
	public UsersPage clickName() {
		driver.findElement(By.xpath("//a[@class='linked']")).click();
		return new UsersPage();
	}

}
