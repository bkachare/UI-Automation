package testHarness;

import java.awt.AWTException;
import java.text.ParseException;

import baseClasses.SeleniumUtils;
import baseClasses.Utilities;

public class SampleSeg extends SeleniumUtils
{




	public void LoginReuse() throws AWTException, ParseException
	{	
		
		ResuableFunctions reuse = new ResuableFunctions();
		reuse.LocalLoginReuse("admin@user.com","Admin@123");
		reuse.scrollDown();
		sleep(5000);
		reuse.scrollUp();
		sleep(5000);
		reuse.goBack();
		sleep(5000);
		Utilities uit = new Utilities();
		System.out.println("currenttime:"+uit.getCurrentDatenTime("yyyy/MM/dd HH:mm:ss"));
		
				
	}
	
	
}
		
		/*
		
		openurl("https://www.synetor.com/login");
		//sleep(1000);
		
		//verifyExists(Sample.login.loginButton,"Login Button");
		//javaScriptclick(Sample.login.loginButton,"Login button");
	   // verifyExists(Sample.login.LoginPopUp,"Login Button");
		//javaScriptclick(Sample.login.LoginPopUp,"Login button");
		sleep(2000);
		verifyExists(Sample.login.UserName,"User Name");
		sendKeys(Sample.login.UserName,"admin@user.com","Username field");
	//	sleep(1000);
		verifyExists(Sample.login.PassWord,"Password field");
		sendKeys(Sample.login.PassWord,"Admin@123","Password field");

	//	sleep(2000);
		click(Sample.login.Submit,"Login button");
	//	sleep(2000);
		//verifyExists(Sample.login.BranchRegistration,"Branch registration");
		//javaScriptclick(Sample.login.BranchRegistration,"Branch registration");
		//sleep(2000);
		//click(Sample.login.AddBranch,"Add Branch");
		//sleep(2000);
		
		
		verifyExists(Sample.login.ChooseBranch,"Choose Branch");
		 click(Sample.login.ChooseBranch,"Choose Branch");
		// sleep(5000);	
		 
		 verifyExists(Sample.login.Branch,"Branch Selected");
		 click(Sample.login.Branch,"Branch Selected");
		// sleep(2000);
		 
		 verifyExists(Sample.login.SchoolAssets,"School Assets");
		 javaScriptclick(Sample.login.SchoolAssets,"School Assets Meanu Selected");
		 
		 verifyExists(Sample.login.CourseDetails,"Course Details");
		 javaScriptclick(Sample.login.CourseDetails,"Course Details Meanu Selected");
		 sleep(2000);
		 verifyExists(Sample.login.StudentCourse,"Student Course page");
		 verifyExists(Sample.login.Course,"Student Course");
		 verifyExists(Sample.login.CourseName,"Student Course Name");
		 sendKeys(Sample.login.ServiceName,"Software9 Testing","Service Name field");
		 sleep(2000);
		 verifyExists(Sample.login.FeesAmount,"Fees Amount");
		 sendKeys(Sample.login.Fees,"5000","Fees Amount field");
		 
		 sleep(2000);
		 verifyExists(Sample.login.StatusField,"Status Field");
		 selectByVisibleText(Sample.login.Status,"Inactive","Course Status");
		 verifyExists(Sample.login.StatusField,"Status Field");
		 sleep(2000);
		 verifyExists(Sample.login.CourseModeDropDown,"Course Mode DropDown");
		 selectByIndex(Sample.login.CourseMode,2,"Course Mode");
		 verifyExists(Sample.login.Description,"Description of Course");
		 sendKeys(Sample.login.Description,"Software Testing Class","Description field");
		 sleep(2000);
		 
		 verifyExists(Sample.login.AddButton,"Add Button");
			javaScriptclick(Sample.login.AddButton,"Add button");
			 sleep(2000);
			 verifyExists(Sample.login.SearchBox,"Search Box"); 
			 
			 verifyExists(Sample.login.Search,"Search Course");
			 sleep(2000);
			 sendKeys(Sample.login.Search,"Software9 Testing","Search course");
			 sleep(5000);
			 verifyExists(Sample.login.CourseAdded,"Course Added Sucessfully");
			 sleep(5000);
			 
			
		 /*
		 verifyExists(Sample.login.StudentMaster,"Student Master");
		 click(Sample.login.StudentMaster,"Student Master Selected");
		 //sleep(2000);
		 
		 verifyExists(Sample.login.StudentEntry,"Student Master");
		 click(Sample.login.StudentEntry,"Student Master Selected");
		 
		 verifyExists(Sample.login.StudentMasterForm,"Student Master Form");
		// sleep(2000);
		 verifyExists(Sample.login.PersonalDetails,"Personal Details");
		 //sleep(2000);
		 verifyExists(Sample.login.EnrollmentDate,"Enrollment Date");
		 sleep(2000);
		 verifyExists(Sample.login.EnrollmentDateSelected,"Enrollment Date Selected");
		// sleep(2000);
		 verifyExists(Sample.login.StudentName,"Student Name");
		 verifyExists(Sample.login.FirstName,"Student first Name");
		 sendKeys(Sample.login.FirstName,"Bhagyashri","Student first Name field");
		 //sleep(2000);
		 
		 verifyExists(Sample.login.Email,"Student Email");
		 verifyExists(Sample.login.EnterEmail,"Student Email field");
		 sendKeys(Sample.login.EnterEmail,"abcdef@gmail.com","Student Email field");
		/// sleep(2000);
		 
		 verifyExists(Sample.login.Entermobile,"Student mobile field");
		 sendKeys(Sample.login.Entermobile,"9405191103","Student mobile field");
		 //sleep(2000);
		 
		 verifyExists(Sample.login.EmobileField,"Student Emobile Number");
		 verifyExists(Sample.login.EmobileNumber,"Student Emobile field");
		 sendKeys(Sample.login.EmobileNumber,"9405191103","Student mobile field");
		 
		 sleep(2000);
		 verifyExists(Sample.login.State,"Student State");
		 selectByVisibleText(Sample.login.PreState,"Goa","Student state");
		 sleep(2000);
		 
		 verifyExists(Sample.login.ChooseDistrict,"Choose District");
		 selectByVisibleText(Sample.login.PreDistrict,"North Goa","Student District");
		 sleep(2000);	
		 
		 verifyExists(Sample.login.ChooseTahasil,"Choose Tahasil");
		 selectByVisibleText(Sample.login.Tahasil,"Pernem","Student Tahasil");
		 sleep(2000);
		 
		
		 verifyExists(Sample.login.PinCode,"Pin Code field");
		 sendKeys(Sample.login.PinCode,"942323","Pin Code field");
		sleep(2000);
		 
		 verifyExists(Sample.login.NextButton,"Next Button");
		 javaScriptclick(Sample.login.NextButton,"Next button");
		// sleep(2000);
		 
		 verifyExists(Sample.login.CourseFeesDetails,"Course Fees Details tab");
		 
		//verifyExists(Sample.login.SelectCourse,"Select Course");
		 //javaScriptclick(Sample.login.SelectCourse,"Select Course");
		// sleep(2000);
		 
		 //verifyExists(Sample.login.CourseDropDown,"Course Selected");
		 //click(Sample.login.CourseDropDown,"CourseDropDown Selected");
		 //selectByVisibleText(Sample.login.CourseDropDown,"Course2","Course Drop Down value");
		// sleep(2000);
		 
		 
		 
		 verifyExists(Sample.login.ChooseCourse,"Choose Course");
		 click(Sample.login.ChooseCourse,"Choose Course");
		sleep(2000);
		
		sendKeys(Sample.login.SelectCourse,"Course1","Course field");
		click(Sample.login.SelectCourse,"Choose District");
		// verifyExists(Sample.login.Course,"Course Selected");
		 //click(Sample.login.Course,"Choose Course");
		// verifyExists(Sample.login.ChoCourse,"Course Selected");
		// selectByVisibleText(Sample.login.Course,"Course1","Course Drop Down value");
		// click(Sample.login.Course,"Choose Course");
		sleep(2000);
		 
		 
		 verifyExists(Sample.login.BatchOpt,"Batch Selected");
		 click(Sample.login.BatchOpt,"Batch Selected");
		 
		 verifyExists(Sample.login.Batch,"Batch Selected");
		 javaScriptclick(Sample.login.Batch,"Batch Selected");
		 
		 
		 */
		 
		 /*
		 
		}
	
	public void StudentEntry() throws Exception{
		
		openurl("https://www.synetor.com/login");
		//sleep(1000);
		
		//verifyExists(Sample.login.loginButton,"Login Button");
		//javaScriptclick(Sample.login.loginButton,"Login button");
	    verifyExists(Sample.login.LoginPopUp,"Login Button");
	    javaScriptclick(Sample.login.LoginPopUp,"Login button");
		sleep(2000);
		verifyExists(Sample.login.UserName,"User Name");
		sendKeys(Sample.login.UserName,"admin@user.com","Username field");
	//	sleep(1000);
		verifyExists(Sample.login.PassWord,"Password field");
		sendKeys(Sample.login.PassWord,"Admin@123","Password field");

	//	sleep(2000);
		click(Sample.login.Submit,"Login button");
	//	sleep(2000);
		//verifyExists(Sample.login.BranchRegistration,"Branch registration");
		//javaScriptclick(Sample.login.BranchRegistration,"Branch registration");
		//sleep(2000);
		//click(Sample.login.AddBranch,"Add Branch");
		//sleep(2000);
		
		
		verifyExists(Sample.login.ChooseBranch,"Choose Branch");
		 click(Sample.login.ChooseBranch,"Choose Branch");
		// sleep(5000);	
		 
		 verifyExists(Sample.login.Branch,"Branch Selected");
		 click(Sample.login.Branch,"Branch Selected");
		// sleep(2000);
		 
	
		 verifyExists(Sample.login.StudentMaster,"Student Master");
		 click(Sample.login.StudentMaster,"Student Master Selected");
		 //sleep(2000);
		 
		 verifyExists(Sample.login.StudentEntry,"Student Master");
		 click(Sample.login.StudentEntry,"Student Master Selected");
		 
		 verifyExists(Sample.login.StudentMasterForm,"Student Master Form");
		// sleep(2000);
		 verifyExists(Sample.login.PersonalDetails,"Personal Details");
		 //sleep(2000);
		 verifyExists(Sample.login.EnrollmentDate,"Enrollment Date");
		 sleep(2000);
		 verifyExists(Sample.login.EnrollmentDateSelected,"Enrollment Date Selected");
		// sleep(2000);
		 verifyExists(Sample.login.StudentName,"Student Name");
		 verifyExists(Sample.login.FirstName,"Student first Name");
		 sendKeys(Sample.login.FirstName,"Bhagyashri","Student first Name field");
		 //sleep(2000);
		 
		 verifyExists(Sample.login.Email,"Student Email");
		 verifyExists(Sample.login.EnterEmail,"Student Email field");
		 sendKeys(Sample.login.EnterEmail,"abcdewrewf@gmail.com","Student Email field");
		/// sleep(2000);
		 
		 verifyExists(Sample.login.Entermobile,"Student mobile field");
		 sendKeys(Sample.login.Entermobile,"9405191103","Student mobile field");
		 //sleep(2000);
		 
		 verifyExists(Sample.login.EmobileField,"Student Emobile Number");
		 verifyExists(Sample.login.EmobileNumber,"Student Emobile field");
		 sendKeys(Sample.login.EmobileNumber,"9405191103","Student mobile field");
		 
		 sleep(2000);
		 verifyExists(Sample.login.State,"Student State");
		 selectByVisibleText(Sample.login.PreState,"Goa","Student state");
		 sleep(2000);
		 
		 verifyExists(Sample.login.ChooseDistrict,"Choose District");
		 selectByVisibleText(Sample.login.PreDistrict,"North Goa","Student District");
		 sleep(2000);	
		 
		 verifyExists(Sample.login.ChooseTahasil,"Choose Tahasil");
		 selectByVisibleText(Sample.login.Tahasil,"Pernem","Student Tahasil");
		 sleep(2000);
		 
		
		 verifyExists(Sample.login.PinCode,"Pin Code field");
		 sendKeys(Sample.login.PinCode,"942323","Pin Code field");
		sleep(2000);
		 
		 verifyExists(Sample.login.NextButton,"Next Button");
		 javaScriptclick(Sample.login.NextButton,"Next button");
		// sleep(2000);
		 
		 verifyExists(Sample.login.CourseFeesDetails,"Course Fees Details tab");
		 
		verifyExists(Sample.login.SelectCourse,"Select Course");
		javaScriptclick(Sample.login.SelectCourse,"Select Course");
	 sleep(2000);
		 
	 verifyExists(Sample.login.CourseSearchBox,"Course Selected");
	 sendKeys(Sample.login.CourseSearchBox,"Course1","Course Name");
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 Thread.sleep(5000);

		 //verifyExists(Sample.login.CourseDropDown,"Course Selected");
		// click(Sample.login.CourseDropDown,"CourseDropDown Selected");
		 //selectByVisibleText(Sample.login.CourseDropDown,"Course2","Course Drop Down value");
		// sleep(2000);
		 
	 
		 
		 //verifyExists(Sample.login.ChooseCourse,"Choose Course");
		// click(Sample.login.ChooseCourse,"Choose Course");
		// sleep(2000);
		/*
		sendKeys(Sample.login.SelectCourse,"Course1","Course field");
		click(Sample.login.SelectCourse,"Choose District");
		sleep(2000);
		 
		 
		verifyExists(Sample.login.Batch,"Choose Batch");
		 selectByVisibleText(Sample.login.Batch,"Morning","Student Btach");
		 sleep(2000);
		 
		 verifyExists(Sample.login.Batch,"Batch Selected");
		 javaScriptclick(Sample.login.Batch,"Batch Selected");
		 
		 verifyExists(Sample.login.FinishButton,"Batch Selected");
		 javaScriptclick(Sample.login.FinishButton,"Batch Selected");
		 */
		
	
