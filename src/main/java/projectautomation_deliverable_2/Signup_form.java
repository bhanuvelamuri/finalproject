package projectautomation_deliverable_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup_form {
	WebDriver driver;
	By register_email = By.xpath("//input[@id='email_create']");
	By submit = By.xpath("//button[@id='SubmitCreate']");
public Signup_form(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement getregister_email() {
	return driver.findElement(register_email);
}
public WebElement get_signup_submit() {
	return driver.findElement(submit);
}
}
