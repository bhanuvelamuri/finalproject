package projectautomation_deliverable_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_Cart {
	WebDriver driver;
	By move_product = By.xpath("//*[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']");
	By add_cart = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]");
	By proceed_to_checkout = By.linkText("Proceed to checkout");
public Add_Cart(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}
public WebElement getmove_product() {
	return driver.findElement(move_product);
}
public WebElement getadd_cart() {
	return driver.findElement(add_cart);
}
public WebElement getproceed_to_checkout() {
	return driver.findElement(proceed_to_checkout);
}
}
