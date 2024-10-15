package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Systemout {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	        try {	        	

	    		driver.get("https://automationexercise.com/");

	            // Define a wait to handle page timeouts or delays
	    		
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	           
	            try {
	            	WebElement Signup = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
	        		Signup.click();

	        		WebElement Newuser = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
	        		Newuser.sendKeys("Srihari");
	        		Thread.sleep(2000);

	        		WebElement emailadd = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
	        		emailadd.sendKeys("Srihari7r@gmail.com");
	        		Thread.sleep(2000);


	        		WebElement signupbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
	        		signupbutton.click();

	        		JavascriptExecutor js = (JavascriptExecutor) driver; 

	        		//from filling details 
	        		WebElement Title = driver.findElement(By.id("id_gender1"));
	        		Thread.sleep(1000);
	        		Title.click();



	        		js.executeScript("arguments[0].scrollIntoView(true)", Title);
	        		js.executeScript("window.scrollBy(0,200)", "Title");

	        		WebElement Password = driver.findElement(By.id("password")); 
	        		Password.sendKeys("Srihari@12");
	        		Thread.sleep(1000);


	        		WebElement DOBd = driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]"));  
	        		DOBd.click(); 
	        		Thread.sleep(2000);

	        		WebElement DOBm = driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));  
	        		DOBm.click(); 
	        		Thread.sleep(2000);

	        		WebElement DOBy = driver.findElement(By.xpath("//*[@id=\"years\"]/option[28]"));  
	        		DOBy.click(); 
	        		Thread.sleep(2000);

	        		WebElement Text = driver.findElement(By.id("newsletter"));  
	        		Text.click(); 

	        		js.executeScript("arguments[0].scrollIntoView(true)", Text);
	        		js.executeScript("window.scrollBy(0,100)", "Text");


	        		WebElement firstName = driver.findElement(By.id("first_name"));
	        		firstName.sendKeys("Sri");
	        		Thread.sleep(1000);

	        		WebElement LastName = driver.findElement(By.id("last_name"));
	        		LastName.sendKeys("Hari");
	        		Thread.sleep(1000);

	        		WebElement Company = driver.findElement(By.id("company"));
	        		Company.sendKeys("CG");
	        		Thread.sleep(1000);

	        		WebElement Address = driver.findElement(By.id("address1"));
	        		Address.sendKeys("Gandhinagar");
	        		Thread.sleep(1000);

	        		WebElement Address2 = driver.findElement(By.id("address2"));
	        		Address2.sendKeys("Krishna DT");
	        		Thread.sleep(1000);

	        		WebElement Country = driver.findElement(By.xpath("//*[@id=\"country\"]/option[1]"));
	        		Country.click();
	        		Thread.sleep(1000);

	        		js.executeScript("arguments[0].scrollIntoView(true)", Country);
	        		js.executeScript("window.scrollBy(0,100)", "Country");


	        		WebElement State = driver.findElement(By.id("state"));
	        		State.sendKeys("AP");
	        		Thread.sleep(1000);

	        		WebElement City = driver.findElement(By.id("city"));
	        		City.sendKeys("BZA");
	        		Thread.sleep(1000);

	        		WebElement Zipcode = driver.findElement(By.id("zipcode"));
	        		Zipcode.sendKeys("500001");
	        		Thread.sleep(1000);

	        		WebElement Mobile = driver.findElement(By.id("mobile_number"));
	        		Mobile.sendKeys("9492933212");
	        		Thread.sleep(2000);

	        		WebElement Accountcreated = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
	        		Accountcreated.click();



	        		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
	        		Continue.click();
	        		Thread.sleep(1000);
	                
	                System.out.println("Page loaded successfully!");
	                
	            } 
	            catch (TimeoutException e) {
	                System.out.println("System outage: Page failed to load within the timeout period.");
	                     }

	               } 
	            catch (Exception e)
	            {
	               System.out.println("System outage: Unable to reach the website. Exception: " + e.getMessage());
	            } 
	        finally {
	            // Close the browser
	            //driver.quit();
	        }
	    }
		
		
	}
