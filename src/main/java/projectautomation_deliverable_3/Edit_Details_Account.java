package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edit_Details_Account {
	WebDriver driver;
	By my_account = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
	By my_personal_information = By.linkText("My personal information");
	By old_password = By.xpath("//input[@id='old_passwd']");
	By new_password = By.xpath("//input[@id='passwd']");
	By confirm_password = By.xpath("//input[@id='confirmation']");
	By save = By.xpath("//button[@class='btn btn-default button button-medium']");
	By home = By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[2]/a");
public Edit_Details_Account(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement get_my_account() {
	return driver.findElement(my_account);
}
public WebElement get_my_personal_information() {
	return driver.findElement(my_personal_information);
}
public WebElement get_old_password() {
	return driver.findElement(old_password);
}
public WebElement get_new_password() {
	return driver.findElement(new_password);
}
public WebElement get_confirm_password() {
	return driver.findElement(confirm_password);
}
public WebElement get_save() {
	return driver.findElement(save);
}
public WebElement go_home() {
	return driver.findElement(home);
}
}
