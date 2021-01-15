package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Login_page {
	WebDriver driver=null;


	public Login_page(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.ID,using="toggle-hp-search")
	WebElement More_Search_Options;

	@FindBy(how=How.ID,using="keywords")
	WebElement KeyWords;

	@FindBy(how=How.ID,using="location")
	WebElement Location;

	@FindBy(how=How.NAME,using="distance")
	WebElement Distance;

	@FindBy(how=How.ID,using="salarymin")
	WebElement Salary_min;

	@FindBy(how=How.ID,using="salarymax")
	WebElement Salary_Max;

	@FindBy(how=How.ID,using="salarytype")
	WebElement Salary_type;

	@FindBy(how=How.ID,using="tempperm")
	WebElement Job_Type;

	@FindBy(how=How.ID,using="hp-search-btn")
	WebElement Find_Jobs;

	public void Login(String keyword,String location, String Dist,String SalMin, String Max,String type_mode, String JobType) {
		More_Search_Options.click();
		KeyWords.clear();
		KeyWords.sendKeys(keyword);
		Location.sendKeys(location);
		Select Dis=new Select(Distance);
		Dis.selectByValue(Dist);
		Salary_min.sendKeys(SalMin);
		Salary_Max.sendKeys(Max);
		Select type= new Select(Salary_type);
		type.selectByVisibleText(type_mode);
		Select jobs=new Select(Job_Type);
		jobs.selectByValue(JobType);
		Find_Jobs.click();

	}
}
