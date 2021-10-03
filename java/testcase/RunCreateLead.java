package testcase;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import base.ProjectSpecificMethods;

import pages.LoginPage;

public class RunCreateLead extends ProjectSpecificMethods{
	
	
	@Test
	public void toRunCreateLead(String username, String password) {
		
		new LoginPage().enterUserName(username).enerPassword(password).clickLogin().clickCrmsfa().
		clickLeads().clickCreadLeadButtonAtFirst().
		enterCompName().enterFirstName().enterSecondName().clickCreateLead().verifyFristName();
		
		/*
		 * new LoginPage(). enerPassword(password).clickLogin(). clickCrmsfa().
		 * clickLeads(). clickCreadLeadButtonAtFirst().enterCompName().
		 * enterFirstName().enterSecondName().clickCreateLead().verifyFristName();
		 * 
		 */

	}

}
