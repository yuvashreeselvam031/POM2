package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	
	public CreateLeadPage clickCreadLeadButtonAtFirst() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.clickCreadLeadButtonAtFirst.linkText"))).click();
		return new CreateLeadPage();
	
	}
	
	public FindLead clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLead();

	}

}
