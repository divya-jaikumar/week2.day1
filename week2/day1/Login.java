package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// setup the driver
		WebDriverManager.chromedriver().setup();

		//Launch the browser
		ChromeDriver driver= new ChromeDriver();
		
		// load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the url
		driver.manage().window().maximize();
		
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		
		WebElement dd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown=new Select(dd);
		dropdown.selectByVisibleText("Partner");
		
		
		driver.findElement(By.className("smallSubmit")).click();

        driver.close();

		

		
		
			
		
		
		
	}

}
