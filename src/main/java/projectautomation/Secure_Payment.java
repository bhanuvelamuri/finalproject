package projectautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.utilities;

public class Secure_Payment extends utilities{
	WebDriver driver;
	By taxes = By.cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(8) td.data_left:nth-child(2) > font:nth-child(1)");
	By total_amt = By.cssSelector("tbody:nth-child(1) tr:nth-child(9) td.data_left:nth-child(2) font:nth-child(1) > b:nth-child(1)");
	By first_name = By.xpath("//input[@name='passFirst0']");
	By last_name = By.xpath("//input[@name='passLast0']");
	By meal = By.xpath("//select[@name='pass.0.meal']");
	By card_type = By.xpath("//select[@name='creditCard']");
	By number = By.xpath("//input[@name='creditnumber']");
	By exp_month = By.xpath("//select[@name='cc_exp_dt_mn']");
	By exp_date = By.xpath("//select[@name='cc_exp_dt_yr']");
	By card_first_name = By.cssSelector("table:nth-child(1) tbody:nth-child(1) tr:nth-child(2) td:nth-child(1) > input:nth-child(1)");
	By card_middle_name = By.xpath("//input[@name='cc_mid_name']");
	By card_last_name = By.xpath("//input[@name='cc_last_name']");
	By travel_type = By.xpath("//tbody//tr[8]//td[2]//input[1]");
	By billing_street_add_1 = By.xpath("//input[@name='billAddress1']");
	By billing_street_add_2 = By.xpath("//input[@name='billAddress2']");
	By billing_city = By.xpath("//input[@name='billCity']");
	By billing_state = By.xpath("//input[@name='billState']");
	By billing_postal_code = By.xpath("//input[@name='billZip']");
	By billing_country = By.xpath("//select[@name='billCountry']");
	By same_as_billing_add = By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[14]/td[2]/input[1]");
	By delivery_street_1 = By.xpath("//input[@name='delAddress1']");
	By delivery_street_2 = By.xpath("//input[@name='delAddress2']");
	By delivery_city = By.xpath("//input[@name='delCity']");
	By delivery_state = By.xpath("//input[@name='delState']");
	By delivery_postal_code = By.xpath("//input[@name='delZip']");
	By delivery_country = By.xpath("//select[@name='delCountry']");
	By secure_purchase = By.xpath("//input[@name='buyFlights']");
public Secure_Payment(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement gettaxes() {
	return driver.findElement(taxes);
}
public WebElement gettotal_amt() {
	return driver.findElement(total_amt);
}
public WebElement getfirst_name() {
	return driver.findElement(first_name);
}
public WebElement getlast_name() {
	return driver.findElement(last_name);
}
public WebElement getmeal() {
	return driver.findElement(meal);
}
public WebElement getcard_type() {
	return driver.findElement(card_type);
}
public WebElement getcardnumber() {
	return driver.findElement(number);
}
public WebElement getexp_month() {
	return driver.findElement(exp_month);
}
public WebElement getexp_date() {
	return driver.findElement(exp_date);
}
public WebElement getcard_first_name() {
	return driver.findElement(card_first_name);
}
public WebElement getcard_middle_name() {
	return driver.findElement(card_middle_name);
}
public WebElement getcard_last_name() {
	return driver.findElement(card_last_name);
}
public WebElement gettravel_type() {
	return driver.findElement(travel_type);
}
public WebElement getbilling_street_add_1() {
	return driver.findElement(billing_street_add_1);
}
public WebElement getbilling_street_add_2() {
	return driver.findElement(billing_street_add_2);
}
public WebElement getbilling_city() {
	return driver.findElement(billing_city);
}
public WebElement getbilling_state() {
	return driver.findElement(billing_state);
}
public WebElement getbilling_postal_code() {
	return driver.findElement(billing_postal_code);
}
public WebElement getbilling_country() {
	return driver.findElement(billing_country);
}
public WebElement getsame_as_billing_add() {
	return driver.findElement(same_as_billing_add);
}
public WebElement getdelivery_street_1() {
	return driver.findElement(delivery_street_1);
}
public WebElement getdelivery_street_2() {
	return driver.findElement(delivery_street_2);
}
public WebElement getdelivery_city() {
	return driver.findElement(delivery_city);
}
public WebElement getdelivery_state() {
	return driver.findElement(delivery_state);
}
public WebElement getdelivery_postal_code() {
	return driver.findElement(delivery_postal_code);
}
public WebElement getdelivery_country() {
	return driver.findElement(delivery_country);
}
public WebElement getsecure_purchase() {
	return driver.findElement(secure_purchase);
}
}
