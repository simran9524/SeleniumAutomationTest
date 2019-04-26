import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://comp308-300991457-assignment2.herokuapp.com/home");
		
		Boolean loginCheck = false;
		
		
		
		WebElement linkLogin = driver.findElement(By.xpath("//a[contains(@href, '/login')]"));
		linkLogin.click();
	
		
		if(linkLogin.isDisplayed()) {
			System.out.println("login link title is present");
			
			WebElement username = driver.findElement(By.name("username"));
			username.clear();
			System.out.println("username is present");
			username.sendKeys("shiv123");
			
			WebElement pass = driver.findElement(By.name("password"));
			pass.clear();
			System.out.println("pass is present");
			pass.sendKeys("shiv123");
			
			WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
			btn.click();
			
			loginCheck = true;
			
		}		
		
		Boolean loginName = false;
		
		
		if(loginCheck) {
			
			WebElement name= driver.findElement(By.xpath("//*[contains(.,'Welcome,')]"));
			System.out.println("login name present");
			loginName=true;
		}
		
		if(loginName) {
			
			WebElement title = driver.findElement(By.xpath("//h1[contains(.,'CONTACT')]"));
			System.out.println(" Contact title is present");

			WebElement contactLink= driver.findElement(By.xpath("//a[@href='/contact']"));
			System.out.println("contact link is present");
			contactLink.click();
			
			if(title.isDisplayed()) {		
				
				WebElement linklist = driver.findElement(By.xpath("//*[contains(@class, 'card-body')]//a[@href='/contact/contact-list'])"));
				System.out.println("add contact list link is present");
				linklist.click();	
				
				WebElement linkadd = driver.findElement(By.xpath("//a[@href='/contact/contact-list/add'])"));
				System.out.println("add contact link is present");
				linkadd.click();	
				
				WebElement titlenext = driver.findElement(By.xpath("//h1[contains(.,'Add Appointment')]"));
				
				if(titlenext.isDisplayed()) {
					WebElement patientNum = driver.findElement(By.name("patientNumber"));
					patientNum.clear();
					System.out.println("patient number is present");
					patientNum.sendKeys("121");
					
					WebElement date = driver.findElement(By.name("date"));
					date.clear();
					System.out.println("date is present");
					date.sendKeys("12/12/2019");
					
					WebElement time = driver.findElement(By.name("time"));
					time.clear();
					System.out.println("time is present");
					time.sendKeys("09:00");
					
				}
			}
		}
	
		driver.close();	
	}

}
