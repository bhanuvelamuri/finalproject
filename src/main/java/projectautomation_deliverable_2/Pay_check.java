package projectautomation_deliverable_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pay_check {
	WebDriver driver;
	By pay_check = By.xpath("//a[@title='Pay by check.']");
public Pay_check(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
public WebElement get_pay_check() {
	return driver.findElement(pay_check);
}
}
