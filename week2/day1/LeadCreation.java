package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadCreation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(dd);
		dropdown.selectByIndex(1);
		WebElement dd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(3);
		
		//driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Testleaf");



	}

}
