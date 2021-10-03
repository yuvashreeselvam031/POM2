package pages;

import org.openqa.selenium.By;

import com.beust.jcommander.Parameter;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	

	
    
	public LoginPage enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;

	}	
	
	public LoginPage enerPassword(String pword) {
		driver.findElement(By.id("password")).sendKeys(pword);
		return this;

		
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();

	}

	}


