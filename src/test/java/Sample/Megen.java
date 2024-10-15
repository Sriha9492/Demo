package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Megen {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       //Launch browser
		driver.get("https://magento.softwaretestingboard.com/");

		WebElement Createaccount = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		Createaccount.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		firstName.sendKeys("sri");
		Thread.sleep(2000);

		WebElement LastName = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		LastName.sendKeys("Hari");
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true)", LastName);
		// js.executeScript("window.scrollBy(0,200)", "LastName");

		Thread.sleep(3000);

		WebElement Email = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		Email.sendKeys("admin@gmai.com");
		Thread.sleep(2000);

		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.sendKeys("Selenium@12");

		WebElement Confirmpassword = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
		Confirmpassword.sendKeys("Selenium@12");
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView(true)", Confirmpassword);
		js.executeScript("window.scrollBy(0,100)", "Confirmpassword");

		WebElement Createdanaccount = driver.findElement(By.xpath(" //*[@id=\"form-validate\"]/div/div[1]/button"));
		Createdanaccount.click();
        Thread.sleep(2000);
        
      
        //Valid credentials
        
        driver.findElement(By.xpath(
				"//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/']"))
				.click();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Admin@gmai.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Selenium@12");

		WebElement SignIN = driver.findElement(By.id("send2"));
		SignIN.click();
		
		
		Thread.sleep(2000);	
		
	}

}
