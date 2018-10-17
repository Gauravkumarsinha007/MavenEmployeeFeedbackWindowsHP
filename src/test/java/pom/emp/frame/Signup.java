package pom.emp.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Signup {

	WebDriver driver;
	
	
	@BeforeClass
	public void launchbrowser()
	{	
		//launch the browser
		driver = new FirefoxDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void loginTest()
	{
		//open url
		driver.get("http://localhost:8080/validationPro/");
		//Login
		System.out.println("login successfully");
	}
	
	@Test(priority=7)
	public void ValidinputTest() throws InterruptedException
	{
		//click on signup button
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		System.out.println("signup popup open successfully");
		
		//wait 30 seconds
		Thread.sleep(30000);
		
		
		//enter company name
		driver.findElement(By.id("cmname")).sendKeys("Sl book pvt ltd");
		System.out.println("company name filled successfully");
		
		//enter business email id 
		driver.findElement(By.id("emailid ")).sendKeys("gaurav@slbook.in");
		System.out.println("business email id entered successfully");
		
		//Enter business phone number
		driver.findElement(By.id("phno")).sendKeys("7004135895");
		System.out.println("business phone number entered successfully");
		
		//Enter password
		driver.findElement(By.id("pass")).sendKeys("abc123");
		System.out.println("password entered successfully");
		
		//Enter repeat password
		driver.findElement(By.id("cnfpass")).sendKeys("abc123");
		System.out.println("repeat password entered successfully");
		
		//click on I agree
		driver.findElement(By.id("agree")).click();
		System.out.println("click successfully");
		
		//click on register
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		System.out.println("successfully registred");
		
		
		
	}
	
	@AfterMethod
	public void logoutTest()
	{
		//logout
		System.out.println("logout successfully");
	}
	
	@AfterClass()
	public void Closebrowsertest()
	{
		//close browser
		//driver.close();
		System.out.println("browser closed suuccessfully");
	}
	
	
	
	
	
}
