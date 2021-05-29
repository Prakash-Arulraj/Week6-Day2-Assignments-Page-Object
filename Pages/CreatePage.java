package week6.day2.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import week6.day2.Hooks.TestNgHooks;

public class CreatePage extends TestNgHooks {
	Set<String> allWindowHandles = driver.getWindowHandles();
	List<String> NextWindowHandles = new ArrayList<String>(allWindowHandles);

	public CreatePage getNumber() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']//span[1]")).click();
		String number = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("incident number is" + number);
		return this;
	}

	public UsersPage clickCallerId() {
		// driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("lookup.incident.caller_id")).click();
		return new UsersPage();
	}

	public CreatePage clickDescription(String sentence) {
		driver.switchTo().window(NextWindowHandles.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys(sentence);
		return this;
	}
	public IncidentsPage clickSubmit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new IncidentsPage();
	}

}
