package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_Confirmation_Printing {
	WebDriver driver;
	By Order_Confirmation_Printing = By.xpath("//div[@class='box order-confirmation']");
public Order_Confirmation_Printing(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
public WebElement get_Order_Confirmation_Printing() {
	return driver.findElement(Order_Confirmation_Printing);
}
}
