package projectautomation_deliverable_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	WebDriver driver;
	By search = By.xpath("//*[@id=\"search_query_top\"]");
	By Submit = By.xpath("//button[@name='submit_search']");
public Search(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

public WebElement get_search() {
	return driver.findElement(search);
}
public WebElement get_Submit() {
	return driver.findElement(Submit);
}	
}
