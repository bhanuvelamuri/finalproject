package projectautomation_deliverable_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_Form {
	WebDriver driver;
	By title_gender = By.xpath("//input[@id='id_gender1']");
	By first_name = By.xpath("//input[@id='customer_firstname']");
	By last_name = By.xpath("	//input[@id='customer_lastname']");
	By password = By.xpath("//input[@id='passwd']");
	By dob_day = By.xpath("//select[@id='days']");
	By dob_month = By.xpath("//select[@id='months']");
	By dob_year = By.xpath("//select[@id='years']");
	By addr_first_name = By.xpath("//input[@id='firstname']");
	By addr_last_name = By.xpath("//input[@id='lastname']");
	By addr_company_name = By.xpath("//input[@id='company']");
	By addr_line1 = By.xpath("//input[@id='address1']");
	By addr_line2 = By.xpath("//input[@id='address2']");
	By addr_city = By.xpath("//input[@id='city']");
	By addr_state = By.xpath("//select[@id='id_state']");
	By addr_zip = By.xpath("//input[@id='postcode']");
	By addr_country = By.xpath("//select[@id='id_country']");
	By addr_phone = By.xpath("//input[@id='phone_mobile']");
	By alis = By.xpath("//input[@id='alias']");
	By submit = By.xpath("//button[@id='submitAccount']");
	By Home = By.xpath("//*[@title='Home']");
	
public Registration_Form(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement gettitle_gender() {
	return driver.findElement(title_gender);
}
public WebElement getfirst_name() {
	return driver.findElement(first_name);
}
public WebElement getlast_name() {
	return driver.findElement(last_name);
}
public WebElement getpassword() {
	return driver.findElement(password);
}
public WebElement getdob_day() {
	return driver.findElement(dob_day);
}
public WebElement getdob_month() {
	return driver.findElement(dob_month);
}
public WebElement getdob_year() {
	return driver.findElement(dob_year);
}
public WebElement getaddr_first_name() {
	return driver.findElement(addr_first_name);
}
public WebElement getaddr_last_name() {
	return driver.findElement(addr_last_name);
}
public WebElement getaddr_company_name() {
	return driver.findElement(addr_company_name);
}
public WebElement getaddr_line1() {
	return driver.findElement(addr_line1);
}
public WebElement getaddr_line2() {
	return driver.findElement(addr_line2);
}
public WebElement getaddr_city() {
	return driver.findElement(addr_city);
}
public WebElement getaddr_state() {
	return driver.findElement(addr_state);
}
public WebElement getaddr_zip() {
	return driver.findElement(addr_zip);
}
public WebElement getaddr_country() {
	return driver.findElement(addr_country);
}
public WebElement getaddr_phone() {
	return driver.findElement(addr_phone);
}
public WebElement getalis() {
	return driver.findElement(alis);
}
public WebElement getsubmit() {
	return driver.findElement(submit);
}
public WebElement getHome() {
	return driver.findElement(Home);
}
}
