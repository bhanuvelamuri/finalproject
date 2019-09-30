package projectautomation_deliverable_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click_Signin_Homepage {
	WebDriver driver;
	By click = By.xpath("//a[@title='Log in to your customer account']");
public Click_Signin_Homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement getclickonsignin() {
	return driver.findElement(click);
}
	

}
