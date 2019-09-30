package projectautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flight_Selection {
	WebDriver driver;
	By triptype = By.xpath("//input[@value='oneway']");
	By passengers = By.xpath("//select[@name='passCount']");
	By depaturefrom = By.xpath("//select[@name='fromPort']");
	By depaturemonth = By.xpath("//select[@name='fromMonth']");
	By depaturedate = By.xpath("//select[@name='fromDay']");
	By arrivalto = By.xpath("//select[@name='toPort']");
	By returnmonth = By.xpath("//select[@name='toMonth']");
	By returndate = By.xpath("//select[@name='toDay']");
	By serviceclass = By.xpath("//input[@value='Business']");
	By airline = By.xpath("//select[@name='airline']");
	By submit = By.xpath("//input[@name='findFlights']");
public Flight_Selection(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement gettriptype() {
	return driver.findElement(triptype);
}
public WebElement getpassengers() {
	return driver.findElement(passengers);
}
public WebElement getdepaturefrom() {
	return driver.findElement(depaturefrom);
}
public WebElement getdepaturemonth() {
	return driver.findElement(depaturemonth);
}
public WebElement getdepaturedate() {
	return driver.findElement(depaturedate);
}
public WebElement getarrivalto() {
	return driver.findElement(arrivalto);
}
public WebElement getreturnmonth() {
	return driver.findElement(returnmonth);
}
public WebElement getreturndate() {
	return driver.findElement(returndate);
}
public WebElement getserviceclass() {
	return driver.findElement(serviceclass);
}
public WebElement getairline() {
	return driver.findElement(airline);
}
public WebElement getsubmit() {
	return driver.findElement(submit);
}
}
