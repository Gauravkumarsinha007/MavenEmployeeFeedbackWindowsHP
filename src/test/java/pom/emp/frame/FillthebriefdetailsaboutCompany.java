package pom.emp.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillthebriefdetailsaboutCompany {
	
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
		driver.get("http://localhost:8080/validationPro/khhg");
		//Login
		System.out.println("login successfully");
	}
	
	@Test(priority=8)
	public void validinputTest()
	{
		//incorporation date
		
		//age of the company
		System.out.println("auto calculate given in incorporation date");
		
		//CIN
		driver.findElement(By.id("cin")).sendKeys("U74120UP2015PTC074925");
		System.out.println("cin number entered successfully");
		
		//Founder name
		driver.findElement(By.id("foundername")).sendKeys("gaurav kumar");
		System.out.println("founder name entered successfully");
		
		//GST
		driver.findElement(By.id("gst")).sendKeys("09AABCU8833B1ZC");
		System.out.println("GST number entered successfully");
		
		//PAN
		driver.findElement(By.id("pan")).sendKeys("CFUPT1992A");
		System.out.println("PAN number entered successfully");
		
		//Director name
		driver.findElement(By.id("dname")).sendKeys("gaurav kumar");
		System.out.println("Director name filled successfully");
		
		//Date of joining
		
		//DIN
		driver.findElement(By.id("din")).sendKeys("5");
		System.out.println("Din number entered successfully");
		
		//website
		driver.findElement(By.id("web")).sendKeys("www.slbook.in");
		System.out.println("website url entered successfully");
		
		//select company category
		Select dropdown= new Select(driver.findElement(By.id("category")));
		dropdown.selectByVisibleText("others");
		System.out.println("successfully selected company category");
		
		//select company sub category
		Select dropdowna= new Select(driver.findElement(By.id("subcategory")));
		dropdowna.selectByVisibleText("Company Subcategory");
		System.out.println("successfully selected company category");
		
		//company size
		driver.findElement(By.id("size")).sendKeys("8");
		System.out.println("company size entered successfully");
		
		//Turn over
		driver.findElement(By.id("turn")).sendKeys("500000");
		System.out.println("turn over filled successfully");
		
		//office hour
		driver.findElement(By.id("days")).sendKeys("8 ");
		System.out.println("office hour filled successfully"); 
		
		//working days
		driver.findElement(By.id("working_days")).sendKeys("5");
		System.out.println("working days filled successfully");
		
		//leaves per months
		driver.findElement(By.id("leave")).sendKeys("2.25");
		System.out.println("leaves per months filled successfully");
		
		//country
		driver.findElement(By.id("country")).sendKeys("India");
		System.out.println("contry input box filled successfully");
		
		//state
		driver.findElement(By.id("state")).sendKeys("bihar");
		System.out.println("State input box filled successfully");
		
		//city
		driver.findElement(By.id("city")).sendKeys("bhagalpur");
		System.out.println("city input box filled successfully");
		
		//pincode
		driver.findElement(By.id("pin")).sendKeys("203131");
		System.out.println("pincode filled successfully");
		
		//street address
		driver.findElement(By.id("address")).sendKeys("near padam singh gate");
		System.out.println("street address filled successfully");
		
		//copy verification link
		driver.findElement(By.id("verfy")).sendKeys("http://www.slbook.in");
		System.out.println("copy verification link input box filled successfully");
		
		// Click on I agree
		driver.findElement(By.id("agreed")).click();
		System.out.println("clicked successfully");
		
		//Click on submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("submitted successfully");
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
