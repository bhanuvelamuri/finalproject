package projectautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_Page {
		WebDriver driver;
		By username = By.xpath("//input[@name='userName']");
		By password = By.xpath("//input[@name='password']");
		By submit = By.xpath("//input[@value='Login']");
	public Signin_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getusername() {
		return driver.findElement(username);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement getsubmit() {
		return driver.findElement(submit);
	}
}
