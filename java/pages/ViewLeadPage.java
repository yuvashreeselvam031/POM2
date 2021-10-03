package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage verifyFristName() {
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("first name verified : " +text);
		return this;

		
	}

}
