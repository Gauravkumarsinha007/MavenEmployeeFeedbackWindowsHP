package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtilFillthebriefdetailsaboutCompany;

public class Testng_datadrivenTestScriptCompanydetails {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//launch browser
		System.out.println("browser launched successfully");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/validationPro/khhg");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Iterator<Object[]> GetTestData()
	{
		
		ArrayList<Object[]>testdata=TestUtilFillthebriefdetailsaboutCompany.GetDataFromExcel();
		return testdata.iterator();
		
		
	}

	@Test(dataProvider="GetTestData",priority=1)
	public void EmployeeFeedbackFillthebriefdetailsaboutCompany_Test( String CIN,String foundername,String GST,String PAN,String Directorname,String DIN,String website, 
			String companysize,String Turnover,String officehour,String workingdays,String leavespermonths,String country,String state,String city,String pincode,String streetaddress,String copyverificationlink) 
	{
		//Enter Data
		//incorporation date
		
				//age of the company
				System.out.println("auto calculate given in incorporation date");
				
				//CIN
				driver.findElement(By.id("cin")).sendKeys(CIN);
				System.out.println("cin number entered successfully");
				
				//Founder name
				driver.findElement(By.id("foundername")).clear();
				driver.findElement(By.id("foundername")).sendKeys(foundername);
				System.out.println("founder name entered successfully");
				
				//GST
				driver.findElement(By.id("gst")).clear();
				driver.findElement(By.id("gst")).sendKeys(GST);
				System.out.println("GST number entered successfully");
				
				//PAN
				driver.findElement(By.id("pan")).clear();
				driver.findElement(By.id("pan")).sendKeys(PAN);
				System.out.println("PAN number entered successfully");
				
				//Director name
				driver.findElement(By.id("dname")).clear();
				driver.findElement(By.id("dname")).sendKeys(Directorname);
				System.out.println("Director name filled successfully");
				
				//Date of joining	
				
				//DIN
				driver.findElement(By.id("din")).clear();
				driver.findElement(By.id("din")).sendKeys(DIN);
				System.out.println("Din number entered successfully");
				
				//website
				driver.findElement(By.id("web")).clear();
				driver.findElement(By.id("web")).sendKeys(website);
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
				driver.findElement(By.id("size")).clear();
				driver.findElement(By.id("size")).sendKeys(companysize);
				System.out.println("company size entered successfully");
				
				//Turn over
				driver.findElement(By.id("turn")).clear();
				driver.findElement(By.id("turn")).sendKeys(Turnover);
				System.out.println("turn over filled successfully");
				
				//office hour
				driver.findElement(By.id("days")).clear();
				driver.findElement(By.id("days")).sendKeys(officehour);
				System.out.println("office hour filled successfully"); 
				
				//working days
				driver.findElement(By.id("working_days")).clear();
				driver.findElement(By.id("working_days")).sendKeys(workingdays);
				System.out.println("working days filled successfully");
				
				//leaves per months
				driver.findElement(By.id("leave")).clear();
				driver.findElement(By.id("leave")).sendKeys(leavespermonths);
				System.out.println("leaves per months filled successfully");
				
				//country
				driver.findElement(By.id("country")).clear();
				driver.findElement(By.id("country")).sendKeys(country);
				System.out.println("contry input box filled successfully");
				
				//state
				driver.findElement(By.id("state")).clear();
				driver.findElement(By.id("state")).sendKeys(state);
				System.out.println("State input box filled successfully");
				
				//city
				driver.findElement(By.id("city")).clear();
				driver.findElement(By.id("city")).sendKeys(city);
				System.out.println("city input box filled successfully");
				
				//pincode
				driver.findElement(By.id("pin")).clear();
				driver.findElement(By.id("pin")).sendKeys(pincode);
				System.out.println("pincode filled successfully");
				
				//street address
				driver.findElement(By.id("address")).clear();
				driver.findElement(By.id("address")).sendKeys(streetaddress);
				System.out.println("street address filled successfully");
				
				//copy verification link
				driver.findElement(By.id("verfy")).clear();
				driver.findElement(By.id("verfy")).sendKeys(copyverificationlink);
				System.out.println("copy verification link input box filled successfully");
				
				// Click on I agree
				driver.findElement(By.xpath("//input[@name='checkbox']")).click();
				System.out.println("clicked successfully");
				
				//Click on submit
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				System.out.println("submitted successfully");

	}
	
	@AfterMethod
	public void teardown()
	{
		//close browser
		//driver.quit();		
		System.out.println("browser closed suuccessfully");
		System.out.println("=====================================================================================================");
	}
	
}
