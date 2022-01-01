package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();

	//Launch the browser
	ChromeDriver driver= new ChromeDriver();
	
	// load the url
	driver.get("http://www.leafground.com/pages/Edit.html");
	
	//maximize the url
	driver.manage().window().maximize();
	
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("amdivya.v@gmail.com"); 
	String emailValue=email.getAttribute("value");
	System.out.println(emailValue);
	email.clear();
	email.sendKeys("divi",Keys.TAB);
	

	}
}
