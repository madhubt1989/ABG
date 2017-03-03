package Madhu.ABGJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public void testMethod(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
