package projectautomation_deliverable_2_Test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import projectautomation_deliverable_2.Add_Cart;
import projectautomation_deliverable_2.Click_Signin_Homepage;
import projectautomation_deliverable_2.Order_Confirmation_Printing;
import projectautomation_deliverable_2.Order_confirmation;
import projectautomation_deliverable_2.Pay_check;
import projectautomation_deliverable_2.Proceed_to_Checkout;
import projectautomation_deliverable_2.Registration_Form;
import projectautomation_deliverable_2.Signup_form;
import utilities.utilities;

public class Test_file_2 extends utilities{
	@BeforeTest
	public void Initilize() throws Exception{	
		driver = initilizeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	@Test(priority=14)
	public void url_initilize() throws IOException {
		driver.get("http://automationpractice.com");
	}
	@Test(priority=15)
	public void Click_signin_homepage_test() throws IOException {
		Click_Signin_Homepage signin_homepage = new Click_Signin_Homepage(driver);
		signin_homepage.getclickonsignin().click();
	}
	@Test(dataProvider="getdata", priority=16)
	public void Signup_form_test(String Username,String Password) throws IOException {
		Signup_form signup_email = new Signup_form(driver);
		signup_email.getregister_email().sendKeys(Username);
		signup_email.get_signup_submit().click();
	}
	@Test(dataProvider="getaccountdetails" , priority=17)
	public void Registration_Form_test(String firstname,String lastname,String password,String addr_firstname,String addr_lastname,String company,String addr_line1,String addr_line2,String addr_city,String addr_zip,String phone,String alias) throws IOException {
		Registration_Form register = new Registration_Form(driver);
		register.gettitle_gender().click();
		register.getfirst_name().sendKeys(firstname);
		register.getlast_name().sendKeys(lastname);
		register.getpassword().sendKeys(password);
		Select dob_day = new Select(register.getdob_day());
		dob_day.selectByIndex(2);
		Select dob_month = new Select(register.getdob_month());
		dob_month.selectByIndex(7);
		Select dob_year = new Select(register.getdob_year());
		dob_year.selectByIndex(4);
		register.getaddr_first_name().sendKeys(addr_firstname);
		register.getaddr_last_name().sendKeys(addr_lastname);
		register.getaddr_company_name().sendKeys(company);
		register.getaddr_line1().sendKeys(addr_line1);
		register.getaddr_line2().sendKeys(addr_line2);
		register.getaddr_city().sendKeys(addr_city);
		Select addr_state = new Select(register.getaddr_state());
		addr_state.selectByIndex(4);
		register.getaddr_zip().sendKeys(addr_zip);
		Select addr_country = new Select(register.getaddr_country());
		addr_country.selectByIndex(1);
		register.getaddr_phone().sendKeys(phone);
		register.getalis().sendKeys(alias);
		register.getsubmit().click();
		register.getHome().click();
	}
	@Test(priority=18)
	public void Add_Cart_Test() throws IOException, InterruptedException {
		Add_Cart addcart = new Add_Cart(driver);
		WebElement scroll = addcart.getmove_product();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
		Thread.sleep(500); 
		Actions cart = new Actions(driver);
		Action shift = cart.moveToElement(scroll).build();
		shift.perform();
		WebElement button_add_to_cart = addcart.getadd_cart();
		Action add_to_cart = cart.moveToElement(button_add_to_cart).click().build();
		add_to_cart.perform();
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement button_proceed_to_checkout;
		button_proceed_to_checkout = wait.until(ExpectedConditions.elementToBeClickable(addcart.getproceed_to_checkout()));
		button_proceed_to_checkout.click();
}
	@Test(priority=19)
	public void Proceed_to_checkout_Summary_Test() throws IOException, InterruptedException {
		Proceed_to_Checkout proceedcart = new Proceed_to_Checkout(driver);
		proceedcart.get_proceed_to_checkout_summary().click();
}
	@Test(priority=20)
	public void Proceed_to_checkout_Test_address() throws IOException, InterruptedException {
		Proceed_to_Checkout proceedcart_address = new Proceed_to_Checkout(driver);
		proceedcart_address.get_proceed_to_checkout_address().click();
}	
	@Test(priority=21)
	public void Proceed_to_checkout_Test_shipping() throws IOException, InterruptedException {
		Proceed_to_Checkout proceedcart_shipping = new Proceed_to_Checkout(driver);
		proceedcart_shipping.getagree_to_terms().click();
		proceedcart_shipping.get_proceed_to_checkout_shipping().click();
}
	@Test(priority=22)
	public void Pay_check_test() throws IOException, InterruptedException {
		Pay_check pay = new Pay_check(driver);
		pay.get_pay_check().click();
}
	@Test(priority=23)
	public void Order_confirmation_test() throws IOException, InterruptedException {
		Order_confirmation order = new Order_confirmation(driver);
		order.get_order_confirmation().click();
}
	@Test(priority=24)
	public void Order_confirmation_print_test() throws IOException, InterruptedException {
		Order_Confirmation_Printing order = new Order_Confirmation_Printing(driver);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(order.get_Order_Confirmation_Printing().getText());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
}
	@AfterTest
	public void teardown() throws Exception {
		driver.close();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="bhanu48@gmail.com";
		data[0][1]="xyz9999";
		return data;
	}
	@DataProvider
	public Object[][] getaccountdetails()
	{
		Object[][] data=new Object[1][12];
		data[0][0]="bhanu";
		data[0][1]="pratap";
		data[0][2]="xyz9999";
		data[0][3]="bhanu";
		data[0][4]="pratap";
		data[0][5]="exciteservices";
		data[0][6]="54512 downtown";
		data[0][7]="apt 55";
		data[0][8]="montreal";
		data[0][9]="21452";
		data[0][10]="5213535188";
		data[0][11]="54513 downtown";
		return data;
	}

}
