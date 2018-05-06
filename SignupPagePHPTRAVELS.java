package demophpRegistration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPagePHPTRAVELS {

	public static void main(String[] args) throws IOException { 
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://phptravels.com/");
    
    //click on login link     
	    driver.findElement(By.className("login")).click();
		
   //click on register link
		driver.findElement(By.tagName("//a[@href='/register.php']")).click();
		
   // signup page 
		driver.findElement(By.id("inputFirstName")).sendKeys("Shweta");
		driver.findElement(By.id("inputLastName")).sendKeys("Mishra");
		driver.findElement(By.id("inputEmail")).sendKeys("shwetamishracsjm@gmail.com");
	
  // drop down of country code
		WebElement a1 = driver.findElement(By.id("selected-dial-code"));
	    Select b1 = new Select (a1);
		b1.selectByVisibleText("india"); 
		
  // billing address
		
		driver.findElement(By.id("inputAddress1")).sendKeys("102 kiel street ");
		driver.findElement(By.id("inputCity")).sendKeys("Delhi");
		
  //Additional Required Information
		
		WebElement a2 = driver.findElement(By.id("customfield1"));
	    Select b2 = new Select (a2);
		b2.selectByVisibleText("Google");
		
  // Account Security
		driver.findElement(By.id("inputNewPassword1")).sendKeys("QWERTY1234");
		driver.findElement(By.id("inputNewPassword2")).sendKeys("QWERTY1234");
		
		driver.findElement(By.id("click on resigter button ")).click();
		
		driver.close();
		   
	} }
		   
		   
		   
		   
		   