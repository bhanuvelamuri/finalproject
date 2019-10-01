package projectautomation_deliverable_3_Test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import projectautomation_deliverable_3.Add_Cart;
import projectautomation_deliverable_3.Click_Signin_Homepage;
import projectautomation_deliverable_3.Edit_Details_Account;
import projectautomation_deliverable_3.Order_Confirmation_Printing;
import projectautomation_deliverable_3.Order_confirmation;
import projectautomation_deliverable_3.Pay_check;
import projectautomation_deliverable_3.Proceed_to_Checkout;
import projectautomation_deliverable_3.Search;
import projectautomation_deliverable_3.Sign_in_page;
import utilities.utilities;

public class Test_file_3 extends utilities{
	@BeforeTest
	public void Initilize() throws Exception {
		driver = initilizeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	@Test(priority=1)
	public void url_initilize() throws IOException {
		driver.get("http://automationpractice.com");
	}
	@Test(priority=2)
	public void Click_signin_homepage_test() throws IOException {
		Click_Signin_Homepage signin_homepage = new Click_Signin_Homepage(driver);
		signin_homepage.getclickonsignin().click();
	}
	@Test(dataProvider="getdata", priority=3)
	public void Sign_in_page_Test(String Username,String Password) throws IOException {
		Sign_in_page sign_in = new Sign_in_page(driver);
		sign_in.getemail().sendKeys(Username);
		sign_in.getpassword().sendKeys(Password);
		sign_in.getsubmit().click();
	}
	@Test(priority=4)
	public void Click_Account_Information_Test() throws IOException {
		Edit_Details_Account click = new Edit_Details_Account(driver);
		click.get_my_personal_information().click();
	}
	@Test(dataProvider="getaccountdetails" , priority=5)
	public void Edit_Details_Account_Test(String Oldpassword,String Newpassword) throws IOException {
		Edit_Details_Account register = new Edit_Details_Account(driver);
		register.get_old_password().sendKeys(Oldpassword);
		register.get_new_password().sendKeys(Newpassword);
		register.get_confirm_password().sendKeys(Newpassword);
		register.get_save().click();
		register.go_home().click();
	}
	@Test(dataProvider="getsearch", priority=6)
	public void Search_Test(String keyword) throws IOException {
		Search search = new Search(driver);
		search.get_search().sendKeys(keyword);
		search.get_Submit().click();
	}

	@Test(priority=7)
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
	@Test(priority=8)
	public void Proceed_to_checkout_Summary_Test() throws IOException, InterruptedException {
		Proceed_to_Checkout proceedcart = new Proceed_to_Checkout(driver);
		proceedcart.get_proceed_to_checkout_summary().click();
}
	@Test(priority=9)
	public void Proceed_to_checkout_Test_address() throws IOException, InterruptedException {
		Proceed_to_Checkout proceedcart_address = new Proceed_to_Checkout(driver);
		proceedcart_address.get_proceed_to_checkout_address().click();
}	
	@Test(priority=10)
	public void Proceed_to_checkout_Test_shipping() throws IOException, InterruptedException {
		Proceed_to_Checkout proceedcart_shipping = new Proceed_to_Checkout(driver);
		proceedcart_shipping.getagree_to_terms().click();
		proceedcart_shipping.get_proceed_to_checkout_shipping().click();
}
	@Test(priority=11)
	public void Pay_check_test() throws IOException, InterruptedException {
		Pay_check pay = new Pay_check(driver);
		pay.get_pay_check().click();
}
	@Test(priority=12)
	public void Order_confirmation_test() throws IOException, InterruptedException {
		Order_confirmation order = new Order_confirmation(driver);
		order.get_order_confirmation().click();
}
	@Test(priority=13)
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
		data[0][0]="bhanu37@gmail.com";
		data[0][1]="xyz9999";
		return data;
	}
	@DataProvider
	public Object[][] getsearch()
	{
		Object[][] data=new Object[1][1];
		data[0][0]="chiffon";
		return data;
	}
	@DataProvider
	public Object[][] getaccountdetails()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="xyz9999";
		data[0][1]="abc9999";
		return data;
	}

}
