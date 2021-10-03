package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
 
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText(prop.getProperty("HomePage.clickCrmsfa.linkText"))).click();
		return new MyHomePage();

	}
	
	
	public LoginPage clickLogout() {
		
		
		 return new LoginPage();

	}

}
