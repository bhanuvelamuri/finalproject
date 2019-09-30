package projectautomation;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.utilities;

public class Test_file extends utilities{
	@BeforeTest
	public void Initilize() throws IOException{
		driver = initilizeDriver();
		System.out.println("=======================================");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	@Test(priority=12)
	public void url_initilize() throws IOException {
		driver.get("http://newtours.demoaut.com/");
	}
	@Test(dataProvider="getData" , priority=13)
	public void sign_in_test(String Username,String Password) throws IOException {
		Signin_Page signin = new Signin_Page(driver);
		signin.getusername().sendKeys(Username);
		signin.getpassword().sendKeys(Password);
		signin.getsubmit().click();
		System.out.println("sign in complete");
		
	}
	@Test(priority = 14)	
	public void flight_Select_test() throws IOException {
		Flight_Selection airlineform = new Flight_Selection(driver);
		airlineform.gettriptype().click();
		Select passengersnumber = new Select(airlineform.getpassengers());
		passengersnumber.selectByValue("3");
		Select depaturestate = new Select(airlineform.getdepaturefrom());
		depaturestate.selectByIndex(5);
		Select depaturemonthname = new Select(airlineform.getdepaturemonth());
		depaturemonthname.selectByIndex(4);
		Select depaturedatenumber = new Select(airlineform.getdepaturedate());
		depaturedatenumber.selectByIndex(6);
		Select arrivingstate = new Select(airlineform.getarrivalto());
		arrivingstate.selectByIndex(3);
		Select returningmonth = new Select(airlineform.getreturnmonth());
		returningmonth.selectByIndex(8);
		Select returningdate = new Select(airlineform.getreturndate());
		returningdate.selectByIndex(20);
		airlineform.getserviceclass().click();
		Select airlinepreference = new Select(airlineform.getairline());
		airlinepreference.selectByIndex(2);
		airlineform.getsubmit().click();
		System.out.println("flight_form complete");
		
	}
	@Test(priority=15)
	public void Arival_Depature_Selection() throws IOException {
		Arival_Depature_Selection reserveflight = new Arival_Depature_Selection(driver);
		reserveflight.getdepart().click();
		reserveflight.getarrive().click();
		reserveflight.getreserveflight().click();
		System.out.println("flight selection complete");
	}
	@Test(priority=16)
	public void Form_fill_secure_Payment_Test() throws IOException {
		Secure_Payment pay = new Secure_Payment(driver);
		pay.gettaxes().getText();
		pay.gettotal_amt().getText();
		pay.getfirst_name().sendKeys("bhanu");
		pay.getlast_name().sendKeys("pratap");
		Select meal = new Select(pay.getmeal());
		meal.selectByIndex(2);
		Select cardtype = new Select(pay.getcard_type());
		cardtype.selectByIndex(1);
		pay.getcardnumber().sendKeys("1234567891234567");
		Select cardmonth = new Select(pay.getexp_month());
		cardmonth.selectByIndex(5);
		Select carddate = new Select(pay.getexp_date());
		carddate.selectByIndex(4);
		driver.switchTo().alert().accept();
		pay.getcard_first_name().sendKeys("bhanu");
		pay.getcard_middle_name().sendKeys("pratap");
		pay.getcard_middle_name().sendKeys("reddy");
		pay.gettravel_type().click();
		pay.getbilling_street_add_1().clear();
		pay.getbilling_street_add_1().sendKeys("3510 downtown");
		pay.getbilling_street_add_2().sendKeys("room number #506");
		pay.getbilling_city().sendKeys("Montreal");
		pay.getbilling_state().sendKeys("QC");
		pay.getbilling_postal_code().sendKeys("H8H8H2");
		Select billcountry = new Select(pay.getbilling_country());
		billcountry.selectByVisibleText("CANADA");
		pay.getsame_as_billing_add().click();
		pay.getdelivery_street_1().clear();
		pay.getdelivery_street_1().sendKeys("3510 downtown");
		pay.getdelivery_street_2().sendKeys("room number #506");
		pay.getdelivery_city().sendKeys("Montreal");
		pay.getdelivery_state().sendKeys("QC");
		pay.getdelivery_postal_code().sendKeys("H8H8H2");
		Select delcountry = new Select(pay.getdelivery_country());
		delcountry.selectByVisibleText("CANADA");
		driver.switchTo().alert().accept();
		pay.getsecure_purchase().click();
		System.out.println("payment complete");
	}
	@Test(priority=17)
	public void TotalAmt_with_Taxes() throws IOException {
		TotalAmt_with_Taxes total_amt = new TotalAmt_with_Taxes(driver);
		System.out.println(total_amt.getfinal_taxes().getText());
		System.out.println(total_amt.getfinal_total_amt().getText());
		System.out.println("total amount printing complete");
	}
	@AfterTest
	public void teardown() {
		System.out.println("=======================================");
		driver.close();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="mercury";
		data[0][1]="mercury";

		return data;
	}


}
