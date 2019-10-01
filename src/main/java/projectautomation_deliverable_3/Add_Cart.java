package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_Cart {
	WebDriver driver;
	By move_product = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div");
	By add_cart = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/div[2]/a[1]/span");
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
