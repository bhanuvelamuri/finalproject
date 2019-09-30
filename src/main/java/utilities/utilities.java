package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utilities {
	 public WebDriver driver;
	 public Properties prop;
	 public WebDriver initilizeDriver() throws IOException{
		 Properties prop = new Properties();
		 FileInputStream fis = new FileInputStream("/bhanu/mcit/src/main/java/utilities/data.properties");
		 prop.load(fis);
		 String browserName= prop.getProperty("browser");
		if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","/bhanu/chromedriver");
				driver = new ChromeDriver();
		}
			else if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","/bhanu/geckodriver");
				driver = new FirefoxDriver();
			}
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			//driver.close();
			return driver;
			
	}
}
