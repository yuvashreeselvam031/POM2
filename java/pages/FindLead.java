package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class FindLead extends ProjectSpecificMethods{
	
	
	public FindLead clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;

	}
	public FindLead clickOnPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;

	}
	public FindLead enterPhoneNo() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;

	}
	public FindLead clickFindLeadButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;

	}	
	public FindLead getID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		return this;

	}
	public ViewLeadPage clickID() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage();
		

	}
	

}
