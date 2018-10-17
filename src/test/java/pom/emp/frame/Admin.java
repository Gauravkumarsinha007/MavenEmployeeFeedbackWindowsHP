package pom.emp.frame;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin {
	
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
		driver.get("http://localhost:8081/employee_feedback_final/AdminDashboard");
		//Login
		System.out.println("Admin panel is open successfully");
	}
	
	@Test
	public void VerifyactionAdminTest()
	{
		
		//verify admin page title
		String	actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, "Insert title here", "titel is not matched");
		System.out.println("titel is verified");
		
		//verify admin logo
		boolean a=driver.findElement(By.xpath("//img[@class='abcmk img']")).isDisplayed();
		System.out.println("adminlogo is verified");
		
		//click on dashboard
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		System.out.println("dashboard is open successfully");
		
		//click on company details
		driver.findElement(By.xpath("//span[contains(text(),'Company Details')]")).click();
		System.out.println("Company Details is open successfully");
		
		//list view
		
		//click on Employee Details
		driver.findElement(By.xpath("//*[@id='navigation']/li[3]/a/span")).click();
		System.out.println("Employee Details is open successfully");
		
		//list view 
		
		//click on Blocked Company
		driver.findElement(By.xpath("//*[@id='navigation']/li[4]/a/span")).click();
		System.out.println("Blocked Company is open successfully");
		
		//list view
		
		//click on feedback inbox 
		driver.findElement(By.xpath("//*[@id='navigation']/li[5]/a/span")).click();
		System.out.println("Feedback Inbox is open successfully");
		
		//click on inbox
		driver.findElement(By.xpath("//a[contains(text(),'Inbox')]")).click();
		System.out.println("inbox open successfully");
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		/**
		 
		//click on compose
		driver.findElement(By.xpath("//a[contains(text(),'Compose')]")).click();
		System.out.println("compose page open successfully");
		**/
		//click on edit request
		driver.findElement(By.xpath("//*[@id='navigation']/li[6]/a/span")).click();
		System.out.println("Edit Request is open successfully");
		
		//request
		
		//click on logout
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("Logout successfully");
		
		//click on dashboard
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		System.out.println("dashboard is open successfully");
		
		//resize the sidebar
		driver.findElement(By.xpath("//i[@class='fa fa-outdent']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-outdent']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-outdent']")).click();
		
		//click on company details
		driver.findElement(By.xpath("//h1[contains(text(),'Company Details')]")).click();
		System.out.println("company details page open successfully");
	
		//click on Employee details
		driver.findElement(By.xpath("//h1[contains(text(),'Employee Details')]")).click();
		System.out.println("employee details page open successfully");
		
		//click on Block Company
		driver.findElement(By.xpath("//h1[contains(text(),'Block Company')]")).click();
		System.out.println("Block Company page open successfully");
				
		
		//click on Feedback Inbox
		driver.findElement(By.xpath("//h1[contains(text(),'Feedback Inbox')]")).click();
		System.out.println("Feedback Inbox page open successfully");
				
		//click on dashboard
		driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]")).click();
		System.out.println("dashboard is open successfully");
		/**		
		//click on edit request information
		driver.findElement(By.id("//h1[contains(text(),'Edit Request Information')]")).click();
		System.out.println("eqit request page is showing");
		**/
		//click on block employee
		driver.findElement(By.xpath("//h1[contains(text(),' Block Employee')]")).click();
		System.out.println("block emoployee page is showing");
		
		driver.navigate().back();
		
		WebElement element = driver.findElement(By.xpath("//button[@class='dropbtn']"));

        Actions action = new Actions(driver);

        action.moveToElement(element).perform();

        WebElement subElement = driver.findElement(By.xpath("//a[@href='Alladminlist']"));

        action.moveToElement(subElement);

        action.click();

        action.perform();
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url, "http://localhost:8080/employee_feedback_final/Alladminlist","Url is not matched");
		
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
