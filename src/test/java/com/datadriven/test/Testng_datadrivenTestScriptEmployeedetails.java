package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtilEmployeecompanydetails;


public class Testng_datadrivenTestScriptEmployeedetails {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//launch browser
		System.out.println("browser launched successfully");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8081/employeefeedback/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Iterator<Object[]> GetTestData()
	{
		
		ArrayList<Object[]>testdata=TestUtilEmployeecompanydetails.GetDataFromExcel();
		return testdata.iterator();
		
		
	}
	
	@Test(dataProvider="GetTestData")
	public void EmployeeFeedbackFillthebriefdetailsaboutEmployee_Test(String ReviewerName,String Reviewerdegination,String Revieweruploadphoto,String EmpAadhaarnumber,String Empname,String Empcalender,String EmpUploadphoto, 
			String	EmpFathername,String EmpMothername,String Empcontact,String Percountry,String Prestate,String Precity,String Prepincode,String Prestreetaddress,String Prejobtitle, 
			String	PreDurationfromdatecalender,String PreDurationtodatecalender,String PreCTC,String Currentcountry,String Currentstate
			,String Currentcity,String CurrentPincode,String Currentstreetaddresss,String Emptechnicalskills,String Emphowmanyproject,String Empnameofproject
			,String durationfrom,String durationto,String teamsize,String Employeeroleresponcebilities,String Evalutionpotential,String Evalutionhonesty,String EvalutionTechnicalskills,String EvalutionQualtyofwork
			,String Evalutioncoworker,String EvalutionCreativity,String EvalutionPresonality,String EvalutionJobknoweledge,String EvalutionWorkConsistency,String EvalutionAchivementofgoals,String Descipline
			,String Attandance,String TakeIntiative,String IndependentWork,String Contributiontogroup,String Punctuality,String Productivity,String Dependability,String ManagementAbility
			,String CommunicationSkill,String strongestpointofemployee,String WeakestPointsofEmployee,String effectiveormakeimprovements,String Anytraining,String Reason,String workindetail)
	{
		
		//Enter Data
		
		//String expresult = "24 September 2018";			
		//WebElement act= driver.findElement(By.id("24 September 2018"));
		
		//assertEquals(act, expresult);
		//System.out.println("pass and validated");
		
		
		
		
		//Reviewer details
		
		//name
		driver.findElement(By.xpath("//input[@name='reviewer_name']")).clear();
		driver.findElement(By.xpath("//input[@name='reviewer_name']")).sendKeys(ReviewerName);
		System.out.println("Name successfully filled");

		//degination
		driver.findElement(By.xpath("//input[@name='reviewer_designation']")).clear();
		driver.findElement(By.xpath("//input[@name='reviewer_designation']")).sendKeys(Reviewerdegination);
		System.out.println("degination successfully filled");
		
		//upload photo
		driver.findElement(By.xpath("//input[@placeholder='Reviewer Photo:']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Reviewer Photo:']")).sendKeys(Revieweruploadphoto);
		System.out.println("upload photo successfully ");

		//Employee Details 
		
		//Aadhaar number
		driver.findElement(By.xpath("//input[@name='emp_aadhar']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_aadhar']")).sendKeys(EmpAadhaarnumber);
		System.out.println(" Aadhaar number successfully filled ");
		
		//name
		driver.findElement(By.xpath("//input[@name='emp_name']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_name']")).sendKeys(Empname);
		System.out.println("Name successfully filled");
		
		//calender

		
		WebElement datepicker=driver.findElement(By.xpath("//input[@placeholder='DOB : dd/mm/yyyy']"));
		datepicker.sendKeys(Empcalender);
		System.out.println("calender date pickuped successfully");
		
		//Upload photo
		driver.findElement(By.xpath("//input[@placeholder='Employee Photo:']")).sendKeys(EmpUploadphoto);
		System.out.println("photo uploaded sucessfully");
	
		
		//Father name
		driver.findElement(By.xpath("//input[@placeholder='Fathers Name:']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Fathers Name:']")).sendKeys(EmpFathername);
		System.out.println("Father name filled successfully");
		
		//mother name 
		driver.findElement(By.xpath("//input[@name='emp_mothers_name']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_mothers_name']")).sendKeys(EmpMothername);
		System.out.println("mother name filled successfully");
	
		//	======================================in this field after that i have to fill =======================
		//contact
		driver.findElement(By.xpath("//input[@name='emp_contact']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_contact']")).sendKeys(Empcontact);
		System.out.println("cointact filled successfully ");
		
		//please fill the permanent adderess of the employee
		
		//country
		driver.findElement(By.xpath("//input[@name='emp_country']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_country']")).sendKeys(Percountry);
		System.out.println("country input box filled successfully");
		
		//state
		driver.findElement(By.xpath("//input[@name='emp_state']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_state']")).sendKeys(Prestate);			
		System.out.println("state input box filled successfully");
		
		//city
		driver.findElement(By.xpath("//input[@name='emp_city']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_city']")).sendKeys(Precity);
		System.out.println("city filled sucessfully");
		
		//pincode
		driver.findElement(By.xpath("//input[@name='emp_pin_code']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_pin_code']")).sendKeys(Prepincode);
		System.out.println(" pincode filled successfully");
		
		//street address
		driver.findElement(By.xpath("//input[@name='emp_street_address']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_street_address']")).sendKeys(Prestreetaddress);
		System.out.println("street address filled successfully");
		
		
		//job title
		driver.findElement(By.xpath("//input[@name='emp_job_title']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_job_title']")).sendKeys(Prejobtitle);
		System.out.println("job title input box filled successfully");
		
		//Duration from date calender
		
		WebElement datepicker1=driver.findElement(By.xpath("//input[@placeholder='Duration From : dd/mm/yyyy']"));
		datepicker1.sendKeys(PreDurationfromdatecalender);
		System.out.println("Duration to date selected successfully");
		
		
		//Duration to  date calender
		WebElement datepicker2= driver.findElement(By.xpath("//input[@placeholder='Duration To : dd/mm/yyyy']"));
		datepicker2.sendKeys(PreDurationtodatecalender);
		System.out.println("Duration from date selected successfully");
		
		// CTC
		driver.findElement(By.xpath("//input[@name='emp_ctc']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_ctc']")).sendKeys(PreCTC);	
		System.out.println(" ctc filled successfully");
		
		//company current address optional
		
		//country
		driver.findElement(By.xpath("//input[@name='company_country']")).clear();
		driver.findElement(By.xpath("//input[@name='company_country']")).sendKeys(Currentcountry);
		System.out.println("country input boxz filled successfully");
		
		//state
		driver.findElement(By.xpath("//input[@name='company_state']")).clear();
		driver.findElement(By.xpath("//input[@name='company_state']")).sendKeys(Currentstate);
		System.out.println("satate filled successfully");
		
		
		//city
		driver.findElement(By.xpath("//input[@name='company_city']")).clear();
		driver.findElement(By.xpath("//input[@name='company_city']")).sendKeys(Currentcity);
		System.out.println("city input box filled successfully");
		
		//Pincode
		driver.findElement(By.xpath("//input[@name='company_pin_code']")).clear();
		driver.findElement(By.xpath("//input[@name='company_pin_code']")).sendKeys(CurrentPincode);
		System.out.println("pincode input box filled successfully");
		
		//street addresss
		driver.findElement(By.xpath("//input[@name='company_street_address']")).clear();
		driver.findElement(By.xpath("//input[@name='company_street_address']")).sendKeys(Currentstreetaddresss);
		System.out.println("street address");
		
		//technical skills
		driver.findElement(By.xpath("//input[@name='emp_skills']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_skills']")).sendKeys(Emptechnicalskills);
		System.out.println("technical skills inbut box filled successfully");
		
		//how many project employee did given duration
		driver.findElement(By.xpath("//input[@placeholder='How many projects employee did in given duration:']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='How many projects employee did in given duration:']")).sendKeys(Emphowmanyproject);
		System.out.println("how many project employee did given duration input box filled successfully");
		
		//name of project
		driver.findElement(By.xpath("//input[@name='project_name']")).clear();
		driver.findElement(By.xpath("//input[@name='project_name']")).sendKeys(Empnameofproject);
		System.out.println("name of project input box filled successfully");
		
		//duration from
		WebElement datepicker3=driver.findElement(By.xpath("//input[@placeholder='Duration from : dd/mm/yyyy']"));
		datepicker3.sendKeys(durationfrom);
		System.out.println("duration from pick up date from calender successfully ");			
		
		//duration to
		WebElement datepicker4=driver.findElement(By.xpath("//input[@placeholder='Duration to : dd/mm/yyyy']"));
		datepicker4.sendKeys(durationto);
		System.out.println("duration to pickup date from calender successfully");
		
		//team size
		driver.findElement(By.xpath("//input[@name='project_team_size']")).clear();
		driver.findElement(By.xpath("//input[@name='project_team_size']")).sendKeys(teamsize);		
		System.out.println("team size input box filled successfully");
		
		//employee role & responcebilities
		driver.findElement(By.xpath("//input[@name='emp_role']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_role']")).sendKeys(Employeeroleresponcebilities);
		System.out.println("employee role and responcebilities input box filled successfully");
		
		
		//click on add more 
		//driver.findElement(By.xpath("//button[@onclick='education_field();']")).click();
		//System.out.println("click on add more and added successfully");
		
		
		// Confidential Employee performance form 
		// Evalution Form : Rate 1 to 5 (where 5=Excellent, 4=very good, 3=good, 2=fair, 1=poor)
		
		//potential
		driver.findElement(By.xpath("//input[@name='emp_potential']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_potential']")).sendKeys(Evalutionpotential);
		System.out.println("potential input box filled successfully");
		
		//honesty
		driver.findElement(By.xpath("//input[@name='emp_honesty']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_honesty']")).sendKeys(Evalutionhonesty);
		System.out.println("honesty input box filled successfully");
		
		//Technical skills

		driver.findElement(By.xpath("//input[@name='emp_technical_skills']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_technical_skills']")).sendKeys(EvalutionTechnicalskills);
		System.out.println("Technical skills input box filled successfully");
		
		//Qualty of work

		driver.findElement(By.xpath("//input[@name='emp_quality_work']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_quality_work']")).sendKeys(EvalutionQualtyofwork);
		System.out.println("Qualty of work input box filled successfully");
		
		
		//coworker relation

		driver.findElement(By.xpath("//input[@name='emp_coworker_relation']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_coworker_relation']")).sendKeys(Evalutioncoworker);
		System.out.println("coworker relation input box filled successfully");

		//Creativity

		driver.findElement(By.xpath("//input[@name='emp_creativity']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_creativity']")).sendKeys(EvalutionCreativity);
		System.out.println("Creativity input box filled successfully");
		
		//Presonality

		driver.findElement(By.xpath("//input[@name='emp_personality']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_personality']")).sendKeys(EvalutionPresonality);
		System.out.println("Presonality input box filled successfully");

		//Job knoweledge

		driver.findElement(By.xpath("//input[@name='emp_job_knowledge']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_job_knowledge']")).sendKeys(EvalutionJobknoweledge);
		System.out.println("Job knoweledge input box filled successfully");

		//Work Consistency

		driver.findElement(By.xpath("//input[@name='emp_work_consistency']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_work_consistency']")).sendKeys(EvalutionWorkConsistency);
		System.out.println("Work Consistency input box filled successfully");

		//Achivement of goals
		driver.findElement(By.xpath("//input[@name='emp_achivement']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_achivement']")).sendKeys(EvalutionAchivementofgoals);
		System.out.println("Achivement of goals input box filled successfully");

		//Descipline

		driver.findElement(By.xpath("//input[@name='emp_descipline']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_descipline']")).sendKeys(Descipline);
		System.out.println("Descipline input box filled successfully");
		
		//Attandance

		driver.findElement(By.xpath("//input[@name='emp_attandance']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_attandance']")).sendKeys(Attandance);
		System.out.println("Attandance input box filled successfully");

		//Take Intiative
		driver.findElement(By.xpath("//input[@name='emp_take_intiative']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_take_intiative']")).sendKeys(TakeIntiative);
		System.out.println("Take Intiative input box filled successfully");
		
		//Independent Work
		driver.findElement(By.xpath("//input[@name='emp_independent_work']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_independent_work']")).sendKeys(IndependentWork);		
		System.out.println("Independent Work input box filled successfully");
		
		
		//Contribution to group

		driver.findElement(By.xpath("//input[@name='emp_contribution']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_contribution']")).sendKeys(Contributiontogroup);
		System.out.println("Contribution to group input box filled successfully");
		
		//Punctuality
		driver.findElement(By.xpath("//input[@name='emp_punctuality']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_punctuality']")).sendKeys(Punctuality);
		System.out.println("Punctuality input box filled successfully");
		
		
		//Productivity
		driver.findElement(By.xpath("//input[@name='emp_productivity']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_productivity']")).sendKeys(Productivity);
		System.out.println("Productivity input box filled successfully");
		
		//Dependability

		driver.findElement(By.xpath("//input[@name='emp_dependability']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_dependability']")).sendKeys(Dependability);
		System.out.println("Dependability input box filled successfully");
		
		//Management Ability
		driver.findElement(By.xpath("//input[@name='emp_management_ability']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_management_ability']")).sendKeys(ManagementAbility);
		System.out.println("Management Ability input box filled successfully");
		
		//Communication Skill
		driver.findElement(By.xpath("//input[@name='emp_communication_skill']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_communication_skill']")).sendKeys(CommunicationSkill);
		System.out.println("Communication Skill input box filled successfully");

		
		//Performance Summary:
		
		//strongest point of employee
		driver.findElement(By.xpath("//input[@placeholder='Strongest Points of Employee:']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Strongest Points of Employee:']")).sendKeys(strongestpointofemployee);
		System.out.println("strongest point of employee input box filled successfully");
		
		//Weakest Points of Employee
		driver.findElement(By.xpath("//input[@name='emp_weak_point']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_weak_point']")).sendKeys(WeakestPointsofEmployee);
		System.out.println("Weakest point of employee input box filled successfully");

		//What can the employee do to be more effective or make improvements:
		driver.findElement(By.xpath("//input[@name='emp_to_improve']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_to_improve']")).sendKeys(effectiveormakeimprovements);
		System.out.println("What can the employee do to be more effective or make improvements input box filled successfully");
		
		//Any training? if provided by the company and why? (please mention below the duration, topic and from where)

		driver.findElement(By.xpath("//input[@name='emp_any_training']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_any_training']")).sendKeys(Anytraining);			
		System.out.println("Any training? if provided by the company and why? (please mention below the duration, topic and from where) input box filled successfully");

		//Reason: Why employee changed the company(Resigned/Terminated)
		driver.findElement(By.xpath("//input[@name='emp_why_change']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_why_change']")).sendKeys(Reason);			
		System.out.println("Reason: Why employee changed the company(Resigned/Terminated) input box filled successfully");
		
		//Summary
		//work in detail
		driver.findElement(By.xpath("//input[@name='emp_summary']")).clear();
		driver.findElement(By.xpath("//input[@name='emp_summary']")).sendKeys(workindetail);
		System.out.println("work in  detail input box filled successfully");
		
		//I agreeto the term of services & privacy policy
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("checkbox is enable");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		
		
		
		
		System.out.println("======================================================================================================");
		
		
		
		
		
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		//close browser
		driver.quit();		
		System.out.println("browser closed suuccessfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
