package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {

WebDriver driver;
@Given("User is on homepage")
public void user_is_on_homepage() {
	
	System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://uniformm1.upskills.in/admin/");
}
@When("user enter invalid Username {string} and password {string}")
public void user_enter_invalid_Username_and_password(String username, String password) {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);	   
}

@When("user click on Submit button")
public void user_click_on_Submit_button() throws InterruptedException {
	
    driver.findElement(By.className("btn")).click();
    driver.findElement(By.id("button-menu")).click();
    driver.findElement(By.id("sale")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Gift Vouchers']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//li[@id='sale']/ul/li[4]/ul/li/a")).click();
    driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
}


@When("user enter valid credentials and code {string}")
public void user_enter_valid_credentials_and_code(String code)  throws InterruptedException {
	driver.findElement(By.name("code")).sendKeys(code);
	driver.findElement(By.name("from_name")).sendKeys("rajesh");
	driver.findElement(By.name("from_email")).sendKeys("rajesh@gmail.com");
	driver.findElement(By.name("to_name")).sendKeys("Balu");
	driver.findElement(By.name("to_email")).sendKeys("Balu123@gmail.com");
	driver.findElement(By.name("message")).sendKeys("This is Impartant Message");
	driver.findElement(By.name("amount")).sendKeys("4000");
	Thread.sleep(2000);
}
@When("user click on submit button")
public void user_click_on_submit_button() throws InterruptedException {
    
	driver.findElement(By.xpath("//button[@data-original-title='Save']")).click();   
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='Voucher Themes']")).click();
	driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
	 driver.findElement(By.className("form-control")).sendKeys("Blue");
    
}
@When("User enter valid Credentials")
public void user_enter_valid_data() throws InterruptedException {
	driver.findElement(By.className("img-thumbnail")).click();
	driver.findElement(By.id("button-image")).click();
	Thread.sleep(2000);
	
}
@When("User click on submit button")
public void User_click_on_submit_button() throws InterruptedException {
	driver.findElement(By.xpath("//img[@title='2017-10-066.jp g']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-original-title='Save']")).click();
   
}
}
//delete code usesing value
//driver.findElement(By.xpath("//input[@value='74']")).click();
//driver.findElement(By.xpath("//button[@data-original-title='Delete']")).click();
//driver.switchTo().alert().accept();


