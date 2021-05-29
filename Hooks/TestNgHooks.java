package week6.day2.Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNgHooks {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
     public void beforMethod() {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	 driver.get("https://dev103117.service-now.com/");
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
