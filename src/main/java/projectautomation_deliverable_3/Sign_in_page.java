package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_in_page {
	WebDriver driver;
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By submit = By.xpath("//button[@id='SubmitLogin']");
public Sign_in_page(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement getemail() {
	return driver.findElement(email);
}
public WebElement getpassword() {
	return driver.findElement(password);
}
public WebElement getsubmit() {
	return driver.findElement(submit);
}
}