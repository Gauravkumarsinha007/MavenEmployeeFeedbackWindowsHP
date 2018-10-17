package pom.emp.frame;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class employeecompanydetails {

WebDriver driver;
@BeforeClass
public void Launchbrowser()
{
	//Launch the new browser

	
		driver = new FirefoxDriver();


	System.out.println("browser launched successfully");
	//maximize the window size 
	driver.manage().window().maximize();
	
}

	@BeforeMethod
	public void loginTest()
	{
		//Open valid url
			driver.get("http://localhost:8080/employeefeedback/");
		//Enter valid details and click on Login
			System.out.println("login successfully");
	}
	
	

		@Test(priority=1)
		public void FirstAutomationTest() throws InterruptedException
		{
		
			System.out.println("Test1");
			
		//String expresult = "24 September 2018";			
			//WebElement act= driver.findElement(By.id("24 September 2018"));
			//assertEquals(act, expresult);
			//System.out.println("pass and validated");
			
			
			
			
			//Reviewer details
			
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
			//name
			System.out.println("Name successfully filled");
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys("gaurav kumar");
			//degination
			driver.findElement(By.xpath("//input[@name='reviewer_designation']")).sendKeys("Software test engineer");
			System.out.println("degination successfully filled");
			//upload photo
			driver.findElement(By.xpath("//input[@placeholder='Reviewer Photo:']")).sendKeys("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\image\\er-im.jpg");
			System.out.println("upload photo successfully ");

			//Employee Details 
			
			//Aadhaar number
			driver.findElement(By.xpath("//input[@name='emp_aadhar']")).sendKeys("895696582569");
			System.out.println(" Aadhaar number successfully filled ");
			
			//name
			driver.findElement(By.xpath("//input[@name='emp_name']")).sendKeys("Gaurav kumar");
			System.out.println("Name successfully filled");
			
			//calender

			
			WebElement datepicker=driver.findElement(By.xpath("//input[@placeholder='DOB : dd/mm/yyyy']"));
			
			datepicker.sendKeys("19/09/2018");
			System.out.println("calender date pickuped successfully");
			
			//Upload photo
			
			driver.findElement(By.xpath("//input[@placeholder='Employee Photo:']")).sendKeys("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\image\\Level one Diagram.png");
			
			System.out.println("photo uploaded sucessfully");
		
			
			//Father name
			driver.findElement(By.xpath("//input[@placeholder='Fathers Name:']")).sendKeys("gaurav kumar sinha");
			
			System.out.println("Father name filled successfully");
			
			//mother name 
			driver.findElement(By.xpath("//input[@name='emp_mothers_name']")).sendKeys("nanina bhatiya");
			
			System.out.println("mother name filled successfully");
			
			//contact
			driver.findElement(By.xpath("//input[@name='emp_contact']")).sendKeys("5689214896");
			
			System.out.println("cointact filled successfully ");
			
			//please fill the permanent adderess of the employee
			
			//country
			driver.findElement(By.xpath("//input[@name='emp_country']")).sendKeys("India");
			
			System.out.println("country input box filled successfully");
			
			//state
			driver.findElement(By.xpath("//input[@name='emp_state']")).sendKeys("Bihar");			
			System.out.println("state input box filled successfully");
			
			//city
			
			driver.findElement(By.xpath("//input[@name='emp_city']")).sendKeys("bhagalpur");
			
			System.out.println("city filled sucessfully");
			
			//pincode
			driver.findElement(By.xpath("//input[@name='emp_pin_code']")).sendKeys("203131");
			System.out.println(" pincode filled successfully");
			
			//street address
			
			driver.findElement(By.xpath("//input[@name='emp_street_address']")).sendKeys("near ghanta ghar house no 13");
			
			System.out.println("street address filled successfully");
			
			
			//job title
			driver.findElement(By.xpath("//input[@name='emp_job_title']")).sendKeys("Software test engineer");
			
			System.out.println("job title input box filled successfully");
			
			//Duration from date calender
			
			WebElement datepicker1=driver.findElement(By.xpath("//input[@placeholder='Duration From : dd/mm/yyyy']"));
			datepicker1.sendKeys("04/09/2018");
			
			System.out.println("Duration to date selected successfully");
			
			
			//Duration to  date calender
			
			WebElement datepicker2= driver.findElement(By.xpath("//input[@placeholder='Duration To : dd/mm/yyyy']"));
			datepicker2.sendKeys("19/09/2018");
			
			System.out.println("Duration from date selected successfully");
			
			// CTC
			driver.findElement(By.xpath("//input[@name='emp_ctc']")).sendKeys("500000");
			
			System.out.println(" ctc filled successfully");
			
			//company current address optional
			//country
			driver.findElement(By.xpath("//input[@name='company_country']")).sendKeys("india");
			System.out.println("country input boxz filled successfully");
			
			//state
			driver.findElement(By.xpath("//input[@name='company_state']")).sendKeys("Bihar");
			System.out.println("satate filled successfully");
			
			
			//city
			driver.findElement(By.xpath("//input[@name='company_city']")).sendKeys("Bhagalpur");
			System.out.println("city input box filled successfully");
			
			//Pincode
			driver.findElement(By.xpath("//input[@name='company_pin_code']")).sendKeys("203131");
			System.out.println("pincode input box filled successfully");
			
			//street addresss
			driver.findElement(By.xpath("//input[@name='company_street_address']")).sendKeys("near ghanta ghar house no 13");
			System.out.println("street address");
			
			//technical skills
			driver.findElement(By.xpath("//input[@name='emp_skills']")).sendKeys("java, selenium, functional testing, webdriver, security testing");
			System.out.println("technical skills inbut box filled successfully");
			
			//how many project employee did given duration
			driver.findElement(By.xpath("//input[@placeholder='How many projects employee did in given duration:']")).sendKeys("4");
			System.out.println("how many project employee did given duration input box filled successfully");
			
			//name of project
			driver.findElement(By.xpath("//input[@name='project_name']")).sendKeys("Slvote, slcompares, sllike");
			System.out.println("name of project input box filled successfully");
			
			//duration from
			WebElement datepicker3=driver.findElement(By.xpath("//input[@placeholder='Duration from : dd/mm/yyyy']"));
			datepicker3.sendKeys("06/09/2011");
			System.out.println("duration from pick up date from calender successfully ");			
			
			//duration to
			WebElement datepicker4=driver.findElement(By.xpath("//input[@placeholder='Duration to : dd/mm/yyyy']"));
			datepicker4.sendKeys("19/09/2018");
			System.out.println("duration to pickup date from calender successfully");
			
			//team size
			driver.findElement(By.xpath("//input[@name='project_team_size']")).sendKeys("5");		
			System.out.println("team size input box filled successfully");
			
			//employee role & responcebilities
			driver.findElement(By.xpath("//input[@name='emp_role']")).sendKeys("Do functional testing on slvote project");
			System.out.println("employee role and responcebilities input box filled successfully");
			
			
			//click on add more 
			//driver.findElement(By.xpath("//button[@onclick='education_field();']")).click();
			//System.out.println("click on add more and added successfully");
			
			
			// Confidential Employee performance form 
			// Evalution Form : Rate 1 to 5 (where 5=Excellent, 4=very good, 3=good, 2=fair, 1=poor)
			
			//Pitential
			driver.findElement(By.xpath("//input[@name='emp_potential']")).sendKeys("5");
			System.out.println("potential input box filled successfully");
			
			//honesty
			driver.findElement(By.xpath("//input[@name='emp_honesty']")).sendKeys("4");
			System.out.println("honesty input box filled successfully");
			
			//Technical skills
			driver.findElement(By.xpath("//input[@name='emp_technical_skills']")).sendKeys("3");
			System.out.println("Technical skills input box filled successfully");
			
			//Qualty of work
			driver.findElement(By.xpath("//input[@name='emp_quality_work']")).sendKeys("1");
			System.out.println("Qualty of work input box filled successfully");
			
			
			//coworker relation
			driver.findElement(By.xpath("//input[@name='emp_coworker_relation']")).sendKeys("2");
			System.out.println("coworker relation input box filled successfully");

			//Creativity
			driver.findElement(By.xpath("//input[@name='emp_creativity']")).sendKeys("5");
			System.out.println("Creativity input box filled successfully");
			
			//Presonality
			driver.findElement(By.xpath("//input[@name='emp_personality']")).sendKeys("4");
			System.out.println("Presonality input box filled successfully");

			//Job knoweledge
			driver.findElement(By.xpath("//input[@name='emp_job_knowledge']")).sendKeys("5");
			System.out.println("Job knoweledge input box filled successfully");

			//Work Consistency
			driver.findElement(By.xpath("//input[@name='emp_work_consistency']")).sendKeys("4");
			System.out.println("Work Consistency input box filled successfully");

			//Achivement of goals
			driver.findElement(By.xpath("//input[@name='emp_achivement']")).sendKeys("5");
			System.out.println("Achivement of goals input box filled successfully");

			//Descipline
			driver.findElement(By.xpath("//input[@name='emp_descipline']")).sendKeys("3");
			System.out.println("Descipline input box filled successfully");
			
			//Attandance
			driver.findElement(By.xpath("//input[@name='emp_attandance']")).sendKeys("4");
			System.out.println("Attandance input box filled successfully");

			//Take Intiative
			driver.findElement(By.xpath("//input[@name='emp_take_intiative']")).sendKeys("5");
			System.out.println("Take Intiative input box filled successfully");
			
			//Independent Work
			driver.findElement(By.xpath("//input[@name='emp_independent_work']")).sendKeys("5");		
			System.out.println("Independent Work input box filled successfully");
			
			
			//Contribution to group
			driver.findElement(By.xpath("//input[@name='emp_contribution']")).sendKeys("2");
			System.out.println("Contribution to group input box filled successfully");
			
			//Punctuality
			driver.findElement(By.xpath("//input[@name='emp_punctuality']")).sendKeys("4");
			System.out.println("Punctuality input box filled successfully");
			
			
			//Productivity
			driver.findElement(By.xpath("//input[@name='emp_productivity']")).sendKeys("5");
			System.out.println("Productivity input box filled successfully");
			
			//Dependability
			driver.findElement(By.xpath("//input[@name='emp_dependability']")).sendKeys("5");
			System.out.println("Dependability input box filled successfully");
			
			//Management Ability
			driver.findElement(By.xpath("//input[@name='emp_management_ability']")).sendKeys("4");
			System.out.println("Management Ability input box filled successfully");
			
			//Communication Skill
			driver.findElement(By.xpath("//input[@name='emp_communication_skill']")).sendKeys("3");
			System.out.println("Communication Skill input box filled successfully");

			
			//Performance Summary:
			
			//strongest point of employee
			driver.findElement(By.xpath("//input[@placeholder='Strongest Points of Employee:']")).sendKeys("He is a hard working, smart learner");
			System.out.println("strongest point of employee input box filled successfully");
			
			//Weakest Points of Employee
			driver.findElement(By.xpath("//input[@name='emp_weak_point']")).sendKeys("He is a hard working, smart learner");
			System.out.println("Weakest point of employee input box filled successfully");

			//What can the employee do to be more effective or make improvements:
			driver.findElement(By.xpath("//input[@name='emp_to_improve']")).sendKeys("He is a hard working, smart learner");
			System.out.println("What can the employee do to be more effective or make improvements input box filled successfully");
			
			//Any training? if provided by the company and why? (please mention below the duration, topic and from where)
			
			driver.findElement(By.xpath("//input[@name='emp_any_training']")).sendKeys("He is a hard working, smart learner");			
			System.out.println("Any training? if provided by the company and why? (please mention below the duration, topic and from where) input box filled successfully");

			//Reason: Why employee changed the company(Resigned/Terminated)
			driver.findElement(By.xpath("//input[@name='emp_why_change']")).sendKeys("He is a hard working, smart learner");			
			System.out.println("Reason: Why employee changed the company(Resigned/Terminated) input box filled successfully");
			
			//Summary
			//work in detail
			driver.findElement(By.xpath("//input[@name='emp_summary']")).sendKeys("work in  details work in  details work in  details work in  details work in  details work in  details work in  details work in  details work in  details work in  details work in  details work in  details ");
			System.out.println("work in  detail input box filled successfully");
			
			//I agreeto the term of services & privacy policy
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			System.out.println("checkbox is enable");
			
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			
		//	driver.close();

			
		}

		
		//nigative senario
		@Test(priority=2)
		public void SecondAutomationTest()
		{
			System.out.println("==================================================================================");
			System.out.println("Test2");
			
				/**	String expresult = "24 September 2018";			
			WebElement act= driver.findElement(By.id("24 September 2018"));
			assertEquals(act, expresult);
			System.out.println("pass and validated");
			
			**/
			
			
			//Reviewer details
			
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
			//name
			System.out.println("Name successfully filled");
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys("gaurav kumar");
			//degination
			driver.findElement(By.xpath("//input[@name='reviewer_designation']")).sendKeys("643554512148545454");
			System.out.println("degination successfully filled");
			//upload photo
			driver.findElement(By.xpath("//input[@placeholder='Reviewer Photo:']")).sendKeys("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\testng.xml");
			System.out.println("upload photo successfully ");

			//Employee Details 
			
			//Aadhaar number
			driver.findElement(By.xpath("//input[@name='emp_aadhar']")).sendKeys("458525896585");
			System.out.println(" Aadhaar number successfully filled ");
			
			//name
			driver.findElement(By.xpath("//input[@name='emp_name']")).sendKeys("gaurav kumar");
			System.out.println("Name successfully filled");
			
			//calender

			
			WebElement datepicker=driver.findElement(By.xpath("//input[@placeholder='DOB : dd/mm/yyyy']"));
			
			datepicker.sendKeys("19/02/2050");
			System.out.println("calender date pickuped successfully");
			
			//Upload photo
			
			driver.findElement(By.xpath("//input[@placeholder='Employee Photo:']")).sendKeys("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\testng.xml");
			
			System.out.println("photo uploaded sucessfully");
		
			
			//Father name
			driver.findElement(By.xpath("//input[@placeholder='Fathers Name:']")).sendKeys("gaurav kumar sinha");
			
			System.out.println("Father name filled successfully");
			
			//mother name 
			driver.findElement(By.xpath("//input[@name='emp_mothers_name']")).sendKeys("nina kumari");
			
			System.out.println("mother name filled successfully");
			
			//contact
			driver.findElement(By.xpath("//input[@name='emp_contact']")).sendKeys("7004125896");
			
			System.out.println("cointact filled successfully ");
			
			//please fill the permanent adderess of the employee
			
			//country
			driver.findElement(By.xpath("//input[@name='emp_country']")).sendKeys("India");
			
			System.out.println("country input box filled successfully");
			
			//state
			driver.findElement(By.xpath("//input[@name='emp_state']")).sendKeys("bihar");			
			System.out.println("state input box filled successfully");
			
			//city
			
			driver.findElement(By.xpath("//input[@name='emp_city']")).sendKeys("bhagalpur");
			
			System.out.println("city filled sucessfully");
			
			//pincode
			driver.findElement(By.xpath("//input[@name='emp_pin_code']")).sendKeys("203212");
			System.out.println(" pincode filled successfully");
			
			//street address
			
			driver.findElement(By.xpath("//input[@name='emp_street_address']")).sendKeys("361156451524156411");
			
			System.out.println("street address filled successfully");
			
			
			//job title
			driver.findElement(By.xpath("//input[@name='emp_job_title']")).sendKeys("336541241521215445415455454");
			
			System.out.println("job title input box filled successfully");
			
			//Duration from date calender
			
			WebElement datepicker1=driver.findElement(By.xpath("//input[@placeholder='Duration From : dd/mm/yyyy']"));
			datepicker1.sendKeys("04/09/2098");
			
			System.out.println("Duration to date selected successfully");
			
			
			//Duration to  date calender
			
			WebElement datepicker2= driver.findElement(By.xpath("//input[@placeholder='Duration To : dd/mm/yyyy']"));
			datepicker2.sendKeys("19/09/2818");
			
			System.out.println("Duration from date selected successfully");
			
			// CTC
			driver.findElement(By.xpath("//input[@name='emp_ctc']")).sendKeys("50000000");
			
			System.out.println(" ctc filled successfully");
			
			//company current address optional
			//country
			driver.findElement(By.xpath("//input[@name='company_country']")).sendKeys("uganda");
			System.out.println("country input boxz filled successfully");
			
			//state
			driver.findElement(By.xpath("//input[@name='company_state']")).sendKeys("uganda");
			System.out.println("satate filled successfully");
			
			
			//city
			driver.findElement(By.xpath("//input[@name='company_city']")).sendKeys("uganda");
			System.out.println("city input box filled successfully");
			
			//Pincode
			driver.findElement(By.xpath("//input[@name='company_pin_code']")).sendKeys("813209");
			System.out.println("pincode input box filled successfully");
			
			//street addresss
			driver.findElement(By.xpath("//input[@name='company_street_address']")).sendKeys("65213216554654512154554854545454");
			System.out.println("street address");
			
			//technical skills
			driver.findElement(By.xpath("//input[@name='emp_skills']")).sendKeys("645645645454545454545545455445544454");
			System.out.println("technical skills inbut box filled successfully");
			
			//how many project employee did given duration
			driver.findElement(By.xpath("//input[@placeholder='How many projects employee did in given duration:']")).sendKeys("4");
			System.out.println("how many project employee did given duration input box filled successfully");
			
			//name of project
			driver.findElement(By.xpath("//input[@name='project_name']")).sendKeys("3487524854754784");
			System.out.println("name of project input box filled successfully");
			
			//duration from
			WebElement datepicker3=driver.findElement(By.xpath("//input[@placeholder='Duration from : dd/mm/yyyy']"));
			datepicker3.sendKeys("06/09/3011");
			System.out.println("duration from pick up date from calender successfully ");			
			
			//duration to
			WebElement datepicker4=driver.findElement(By.xpath("//input[@placeholder='Duration to : dd/mm/yyyy']"));
			datepicker4.sendKeys("19/09/3118");
			System.out.println("duration to pickup date from calender successfully");
			
			//team size
			driver.findElement(By.xpath("//input[@name='project_team_size']")).sendKeys("5");		
			System.out.println("team size input box filled successfully");
			
			//employee role & responcebilities
			driver.findElement(By.xpath("//input[@name='emp_role']")).sendKeys("54875457485454878754554878547878");
			System.out.println("employee role and responcebilities input box filled successfully");
			
			/**
			//click on add more 
			driver.findElement(By.xpath("//button[@onclick='education_field();']")).click();
			System.out.println("click on add more and added successfully");
			**/
			
			// Confidential Employee performance form 
			// Evalution Form : Rate 1 to 5 (where 5=Excellent, 4=very good, 3=good, 2=fair, 1=poor)
			
			//potential
			driver.findElement(By.xpath("//input[@name='emp_potential']")).sendKeys("2");
			System.out.println("potential input box filled successfully");
			
			//honesty
			driver.findElement(By.xpath("//input[@name='emp_honesty']")).sendKeys("4");
			System.out.println("honesty input box filled successfully");
			
			//Technical skills
			driver.findElement(By.xpath("//input[@name='emp_technical_skills']")).sendKeys("2");
			System.out.println("Technical skills input box filled successfully");
			
			//Qualty of work
			driver.findElement(By.xpath("//input[@name='emp_quality_work']")).sendKeys("5");
			System.out.println("Qualty of work input box filled successfully");
			
			
			//coworker relation
			driver.findElement(By.xpath("//input[@name='emp_coworker_relation']")).sendKeys("5");
			System.out.println("coworker relation input box filled successfully");

			//Creativity
			driver.findElement(By.xpath("//input[@name='emp_creativity']")).sendKeys("5");
			System.out.println("Creativity input box filled successfully");
			
			//Presonality
			driver.findElement(By.xpath("//input[@name='emp_personality']")).sendKeys("5");
			System.out.println("Presonality input box filled successfully");

			//Job knoweledge
			driver.findElement(By.xpath("//input[@name='emp_job_knowledge']")).sendKeys("5");
			System.out.println("Job knoweledge input box filled successfully");

			//Work Consistency
			driver.findElement(By.xpath("//input[@name='emp_work_consistency']")).sendKeys("5");
			System.out.println("Work Consistency input box filled successfully");

			//Achivement of goals
			driver.findElement(By.xpath("//input[@name='emp_achivement']")).sendKeys("5");
			System.out.println("Achivement of goals input box filled successfully");

			//Descipline
			driver.findElement(By.xpath("//input[@name='emp_descipline']")).sendKeys("5");
			System.out.println("Descipline input box filled successfully");
			
			//Attandance
			driver.findElement(By.xpath("//input[@name='emp_attandance']")).sendKeys("5");
			System.out.println("Attandance input box filled successfully");

			//Take Intiative
			driver.findElement(By.xpath("//input[@name='emp_take_intiative']")).sendKeys("5");
			System.out.println("Take Intiative input box filled successfully");
			
			//Independent Work
			driver.findElement(By.xpath("//input[@name='emp_independent_work']")).sendKeys("5");		
			System.out.println("Independent Work input box filled successfully");
			
			
			//Contribution to group
			driver.findElement(By.xpath("//input[@name='emp_contribution']")).sendKeys("5");
			System.out.println("Contribution to group input box filled successfully");
			
			//Punctuality
			driver.findElement(By.xpath("//input[@name='emp_punctuality']")).sendKeys("5");
			System.out.println("Punctuality input box filled successfully");
			
			
			//Productivity
			driver.findElement(By.xpath("//input[@name='emp_productivity']")).sendKeys("5");
			System.out.println("Productivity input box filled successfully");
			
			//Dependability
			driver.findElement(By.xpath("//input[@name='emp_dependability']")).sendKeys("5");
			System.out.println("Dependability input box filled successfully");
			
			//Management Ability
			driver.findElement(By.xpath("//input[@name='emp_management_ability']")).sendKeys("5");
			System.out.println("Management Ability input box filled successfully");
			
			//Communication Skill
			driver.findElement(By.xpath("//input[@name='emp_communication_skill']")).sendKeys("5");
			System.out.println("Communication Skill input box filled successfully");

			
			//Performance Summary:
			
			//strongest point of employee
			driver.findElement(By.xpath("//input[@placeholder='Strongest Points of Employee:']")).sendKeys("5487894867845478799999999999999999999999999999999999999999999999999999999999999999999999999999999");
			System.out.println("strongest point of employee input box filled successfully");
			
			//Weakest Points of Employee
			driver.findElement(By.xpath("//input[@name='emp_weak_point']")).sendKeys("36545115454545888888888888888888888882222222222222222222222222222222222222222222222222222222222222222222");
			System.out.println("Weakest point of employee input box filled successfully");

			//What can the employee do to be more effective or make improvements:
			driver.findElement(By.xpath("//input[@name='emp_to_improve']")).sendKeys("8656265356858652865626852852685685268522568258625862582528652865825");
			System.out.println("What can the employee do to be more effective or make improvements input box filled successfully");
			
			//Any training? if provided by the company and why? (please mention below the duration, topic and from where)
			
			driver.findElement(By.xpath("//input[@name='emp_any_training']")).sendKeys("5451216546265665655656");			
			System.out.println("Any training? if provided by the company and why? (please mention below the duration, topic and from where) input box filled successfully");

			//Reason: Why employee changed the company(Resigned/Terminated)
			driver.findElement(By.xpath("//input[@name='emp_why_change']")).sendKeys("324156754574545485454578455454787412124878");			
			System.out.println("Reason: Why employee changed the company(Resigned/Terminated) input box filled successfully");
			
			//Summary
			//work in detail
			driver.findElement(By.xpath("//input[@name='emp_summary']")).sendKeys("323156315411234154512154551541221215454545");
			System.out.println("work in  detail input box filled successfully");
			
			//I agreeto the term of services & privacy policy
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			System.out.println("checkbox is enable");
			
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			
		//	driver.close();

			


		}
		

		@Test(priority=3)
		public void ThirdAutomationTest()
		{

			System.out.println("Test3");
			
	
				/**	String expresult = "24 September 2018";			
			WebElement act= driver.findElement(By.id("24 September 2018"));
			assertEquals(act, expresult);
			System.out.println("pass and validated");
			
			**/
			
			
			//Reviewer details
			
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
			//name
			System.out.println("Name successfully filled");
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys("gaurav kumar");
			//degination
			driver.findElement(By.xpath("//input[@name='reviewer_designation']")).sendKeys("643554512148545454");
			System.out.println("degination successfully filled");
			//upload photo
			driver.findElement(By.xpath("//input[@placeholder='Reviewer Photo:']")).sendKeys("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\testng.xml");
			System.out.println("upload photo successfully ");

			//Employee Details 
			
			//Aadhaar number
			driver.findElement(By.xpath("//input[@name='emp_aadhar']")).sendKeys("458525896585");
			System.out.println(" Aadhaar number successfully filled ");
			
			//name
			driver.findElement(By.xpath("//input[@name='emp_name']")).sendKeys("gaurav kumar");
			System.out.println("Name successfully filled");
			
			//calender

			
			WebElement datepicker=driver.findElement(By.xpath("//input[@placeholder='DOB : dd/mm/yyyy']"));
			
			datepicker.sendKeys("19/02/2050");
			System.out.println("calender date pickuped successfully");
			
			//Upload photo
			
			driver.findElement(By.xpath("//input[@placeholder='Employee Photo:']")).sendKeys("C:\\Users\\AJN\\eclipse-workspace\\MavenEMP\\testng.xml");
			
			System.out.println("photo uploaded sucessfully");
		
			
			//Father name
			driver.findElement(By.xpath("//input[@placeholder='Fathers Name:']")).sendKeys("gaurav kumar sinha");
			
			System.out.println("Father name filled successfully");
			
			//mother name 
			driver.findElement(By.xpath("//input[@name='emp_mothers_name']")).sendKeys("nina kumari");
			
			System.out.println("mother name filled successfully");
			
			//contact
			driver.findElement(By.xpath("//input[@name='emp_contact']")).sendKeys("7004125896");
			
			System.out.println("cointact filled successfully ");
			
			//please fill the permanent adderess of the employee
			
			//country
			driver.findElement(By.xpath("//input[@name='emp_country']")).sendKeys("India");
			
			System.out.println("country input box filled successfully");
			
			//state
			driver.findElement(By.xpath("//input[@name='emp_state']")).sendKeys("bihar");			
			System.out.println("state input box filled successfully");
			
			//city
			
			driver.findElement(By.xpath("//input[@name='emp_city']")).sendKeys("bhagalpur");
			
			System.out.println("city filled sucessfully");
			
			//pincode
			driver.findElement(By.xpath("//input[@name='emp_pin_code']")).sendKeys("203212");
			System.out.println(" pincode filled successfully");
			
			//street address
			
			driver.findElement(By.xpath("//input[@name='emp_street_address']")).sendKeys("           ");
			
			System.out.println("street address filled successfully");
			
			
			//job title
			driver.findElement(By.xpath("//input[@name='emp_job_title']")).sendKeys("                       ");
			
			System.out.println("job title input box filled successfully");
			
			//Duration from date calender
			
			WebElement datepicker1=driver.findElement(By.xpath("//input[@placeholder='Duration From : dd/mm/yyyy']"));
			datepicker1.sendKeys("    /  ");
			
			System.out.println("Duration to date selected successfully");
			
			
			//Duration to  date calender
			
			WebElement datepicker2= driver.findElement(By.xpath("//input[@placeholder='Duration To : dd/mm/yyyy']"));
			datepicker2.sendKeys("  / ");
			
			System.out.println("Duration from date selected successfully");
			
			// CTC
			driver.findElement(By.xpath("//input[@name='emp_ctc']")).sendKeys("4");
			
			System.out.println(" ctc filled successfully");
			
			//company current address optional
			//country
			driver.findElement(By.xpath("//input[@name='company_country']")).sendKeys("india");
			System.out.println("country input boxz filled successfully");
			
			//state
			driver.findElement(By.xpath("//input[@name='company_state']")).sendKeys("bihar ju ");
			System.out.println("satate filled successfully");
			
			
			//city
			driver.findElement(By.xpath("//input[@name='company_city']")).sendKeys("lklkl");
			System.out.println("city input box filled successfully");
			
			//Pincode
			driver.findElement(By.xpath("//input[@name='company_pin_code']")).sendKeys("813209");
			System.out.println("pincode input box filled successfully");
			
			//street addresss
			driver.findElement(By.xpath("//input[@name='company_street_address']")).sendKeys("               ");
			System.out.println("street address");
			
			//technical skills
			driver.findElement(By.xpath("//input[@name='emp_skills']")).sendKeys("                 ");
			System.out.println("technical skills inbut box filled successfully");
			
			//how many project employee did given duration
			driver.findElement(By.xpath("//input[@placeholder='How many projects employee did in given duration:']")).sendKeys("2");
			System.out.println("how many project employee did given duration input box filled successfully");
			
			//name of project
			driver.findElement(By.xpath("//input[@name='project_name']")).sendKeys("slbook");
			System.out.println("name of project input box filled successfully");
			
			//duration from
			WebElement datepicker3=driver.findElement(By.xpath("//input[@placeholder='Duration from : dd/mm/yyyy']"));
			datepicker3.sendKeys("  /       ");
			System.out.println("duration from pick up date from calender successfully ");			
			
			//duration to
			WebElement datepicker4=driver.findElement(By.xpath("//input[@placeholder='Duration to : dd/mm/yyyy']"));
			datepicker4.sendKeys(" /     ");
			System.out.println("duration to pickup date from calender successfully");
			
			//team size
			driver.findElement(By.xpath("//input[@name='project_team_size']")).sendKeys("5");		
			System.out.println("team size input box filled successfully");
			
			//employee role & responcebilities
			driver.findElement(By.xpath("//input[@name='emp_role']")).sendKeys("              ");
			System.out.println("employee role and responcebilities input box filled successfully");
			
			/**
			//click on add more 
			driver.findElement(By.xpath("//button[@onclick='education_field();']")).click();
			System.out.println("click on add more and added successfully");
			**/
			
			// Confidential Employee performance form 
			// Evalution Form : Rate 1 to 5 (where 5=Excellent, 4=very good, 3=good, 2=fair, 1=poor)
			
			//potential
			driver.findElement(By.xpath("//input[@name='emp_potential']")).sendKeys("2");
			System.out.println("potential input box filled successfully");
			
			//honesty
			driver.findElement(By.xpath("//input[@name='emp_honesty']")).sendKeys("1");
			System.out.println("honesty input box filled successfully");
			
			//Technical skills
			driver.findElement(By.xpath("//input[@name='emp_technical_skills']")).sendKeys("5");
			System.out.println("Technical skills input box filled successfully");
			
			//Qualty of work
			driver.findElement(By.xpath("//input[@name='emp_quality_work']")).sendKeys("4");
			System.out.println("Qualty of work input box filled successfully");
			
			
			//coworker relation
			driver.findElement(By.xpath("//input[@name='emp_coworker_relation']")).sendKeys("4");
			System.out.println("coworker relation input box filled successfully");

			//Creativity
			driver.findElement(By.xpath("//input[@name='emp_creativity']")).sendKeys("5");
			System.out.println("Creativity input box filled successfully");
			
			//Presonality
			driver.findElement(By.xpath("//input[@name='emp_personality']")).sendKeys("5");
			System.out.println("Presonality input box filled successfully");

			//Job knoweledge
			driver.findElement(By.xpath("//input[@name='emp_job_knowledge']")).sendKeys("4");
			System.out.println("Job knoweledge input box filled successfully");

			//Work Consistency
			driver.findElement(By.xpath("//input[@name='emp_work_consistency']")).sendKeys("5");
			System.out.println("Work Consistency input box filled successfully");

			//Achivement of goals
			driver.findElement(By.xpath("//input[@name='emp_achivement']")).sendKeys("4");
			System.out.println("Achivement of goals input box filled successfully");

			//Descipline
			driver.findElement(By.xpath("//input[@name='emp_descipline']")).sendKeys("4");
			System.out.println("Descipline input box filled successfully");
			
			//Attandance
			driver.findElement(By.xpath("//input[@name='emp_attandance']")).sendKeys("5");
			System.out.println("Attandance input box filled successfully");

			//Take Intiative
			driver.findElement(By.xpath("//input[@name='emp_take_intiative']")).sendKeys("4");
			System.out.println("Take Intiative input box filled successfully");
			
			//Independent Work
			driver.findElement(By.xpath("//input[@name='emp_independent_work']")).sendKeys("4");		
			System.out.println("Independent Work input box filled successfully");
			
			
			//Contribution to group
			driver.findElement(By.xpath("//input[@name='emp_contribution']")).sendKeys("5");
			System.out.println("Contribution to group input box filled successfully");
			
			//Punctuality
			driver.findElement(By.xpath("//input[@name='emp_punctuality']")).sendKeys("5");
			System.out.println("Punctuality input box filled successfully");
			
			
			//Productivity
			driver.findElement(By.xpath("//input[@name='emp_productivity']")).sendKeys("4");
			System.out.println("Productivity input box filled successfully");
			
			//Dependability
			driver.findElement(By.xpath("//input[@name='emp_dependability']")).sendKeys("4");
			System.out.println("Dependability input box filled successfully");
			
			//Management Ability
			driver.findElement(By.xpath("//input[@name='emp_management_ability']")).sendKeys("5");
			System.out.println("Management Ability input box filled successfully");
			
			//Communication Skill
			driver.findElement(By.xpath("//input[@name='emp_communication_skill']")).sendKeys("5");
			System.out.println("Communication Skill input box filled successfully");

			
			//Performance Summary:
			
			//strongest point of employee
			driver.findElement(By.xpath("//input[@placeholder='Strongest Points of Employee:']")).sendKeys("                               ");
			System.out.println("strongest point of employee input box filled successfully");
			
			//Weakest Points of Employee
			driver.findElement(By.xpath("//input[@name='emp_weak_point']")).sendKeys("                          ");
			System.out.println("Weakest point of employee input box filled successfully");

			//What can the employee do to be more effective or make improvements:
			driver.findElement(By.xpath("//input[@name='emp_to_improve']")).sendKeys("                       ");
			System.out.println("What can the employee do to be more effective or make improvements input box filled successfully");
			
			//Any training? if provided by the company and why? (please mention below the duration, topic and from where)
			
			driver.findElement(By.xpath("//input[@name='emp_any_training']")).sendKeys("                      ");			
			System.out.println("Any training? if provided by the company and why? (please mention below the duration, topic and from where) input box filled successfully");

			//Reason: Why employee changed the company(Resigned/Terminated)
			driver.findElement(By.xpath("//input[@name='emp_why_change']")).sendKeys("                    ");			
			System.out.println("Reason: Why employee changed the company(Resigned/Terminated) input box filled successfully");
			
			//Summary
			//work in detail
			driver.findElement(By.xpath("//input[@name='emp_summary']")).sendKeys("                 ");
			System.out.println("work in  detail input box filled successfully");
			
			//I agreeto the term of services & privacy policy
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			System.out.println("checkbox is enable");
			
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
			
		//	driver.close();

			

			

		}
		
/**
		@Test(priority=4)
		public void ForthAutomationTest()
		{
	
			System.out.println("Test4");
			
		
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys("765372314638467");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
				driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
				driver.close();

		

		}
		
		@Test(priority=5)
		public void fIFTHAutomationTest()
		{
			System.out.println("Test5");
			

			
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys("                    ");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				
				driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
				driver.close();

		}
		@Test(priority=6)
		public void SixthAutomationTest()
		{
			System.out.println("Test6");
			
	
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
			driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys("");
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
				driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
				driver.close();

			

		}
		**/
	@AfterMethod
	public void LogoutTest()
	{
		//click on logout button 
		System.out.println("logout sucessfully");
	}

	
	
@AfterClass
public void ClosebrowserTest()
{
	//Close the browser
	System.out.println("close the browser");
	//driver.close();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
