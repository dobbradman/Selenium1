package Exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Login_page;

public class Main {

	WebDriver driver=null;


	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amoun\\OneDrive\\Desktop");
		driver=new ChromeDriver();
		driver.get("https://www.cv-library.co.uk/");

	}
	@Test
	public void More_options(WebDriver ChromeDriver) {
		Login_page lp=PageFactory.initElements(ChromeDriver, Login_page.class);
		lp.Login("Receptionist", "Hyderabad", "2", "10000", "20000", "Per month", "Permanent");

	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();

	}


}
