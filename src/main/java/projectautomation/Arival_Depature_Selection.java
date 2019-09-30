package projectautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Arival_Depature_Selection {
	WebDriver driver;
	By depart = By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[9]/td[1]/input[1]");
	By arrive = By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[5]/td[1]/input[1]");
	By reserve = By.xpath("//input[@name='reserveFlights']");
public Arival_Depature_Selection(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement getdepart() {
	return driver.findElement(depart);
}
public WebElement getarrive() {
	return driver.findElement(arrive);
}
public WebElement getreserveflight() {
	return driver.findElement(reserve);
}
}
