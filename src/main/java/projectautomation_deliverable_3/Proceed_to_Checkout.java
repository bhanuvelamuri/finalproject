package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Proceed_to_Checkout {
	WebDriver driver;
	By proceed_to_checkout = By.xpath("//p[@class='cart_navigation clearfix']//span");
	By agree_to_terms = By.cssSelector("#cgv");
public Proceed_to_Checkout(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
public WebElement get_proceed_to_checkout_summary() {
	return driver.findElement(proceed_to_checkout);
}
public WebElement get_proceed_to_checkout() {
	return driver.findElement(proceed_to_checkout);
}
public WebElement get_proceed_to_checkout_address() {
	return driver.findElement(proceed_to_checkout);
}
public WebElement getagree_to_terms() {
	return driver.findElement(agree_to_terms);
}
public WebElement get_proceed_to_checkout_shipping() {
	return driver.findElement(proceed_to_checkout);
}
}
