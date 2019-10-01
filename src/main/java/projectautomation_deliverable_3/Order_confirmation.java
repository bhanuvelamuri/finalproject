package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_confirmation {
	WebDriver driver;
	By Order_confirmation = By.xpath("//p[@id='cart_navigation']//button[@type='submit']");
public Order_confirmation(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
public WebElement get_order_confirmation() {
	return driver.findElement(Order_confirmation);
}
}
