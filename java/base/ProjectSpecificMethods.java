package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public static Properties prop;

	@Parameters({"language","username","password"})
	@BeforeMethod
	public void precondition(String lang) throws IOException {
		// For Multilingual
		// step1: set the path of the properties file
		FileInputStream fis = new FileInputStream("./src/main/resources/" + lang + ".properties");
		// step2: create object for properties
		prop = new Properties();
		// step3: load the properties
		prop.load(fis);
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}
