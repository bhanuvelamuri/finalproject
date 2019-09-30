package projectautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.utilities;

public class TotalAmt_with_Taxes  extends utilities{
	WebDriver driver;
	By final_taxes = By.cssSelector("td.data_left font:nth-child(1) font:nth-child(1) font:nth-child(1) b:nth-child(1) > font:nth-child(1)");
	By final_total_amt = By.cssSelector("td.data_left table:nth-child(1) tbody:nth-child(1) tr:nth-child(2) > td:nth-child(2)");
	
	public TotalAmt_with_Taxes(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


public WebElement getfinal_taxes() {
	return driver.findElement(final_taxes);
}
public WebElement getfinal_total_amt() {
	return driver.findElement(final_total_amt);
}
}
