package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.clickLeads.linkText"))).click();
		return new MyLeadsPage();
		
	}

}
