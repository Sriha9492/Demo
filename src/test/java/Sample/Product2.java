package Sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product2 {
public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
		driver.get("https://demowebshop.tricentis.com/boo");
		WebElement Signup = driver.findElement(By.xpath("//a[@href='/login']"));
        Signup.click();
        
        WebElement Register = driver.findElement(By.xpath("//input[@type='button']"));
        Register.click();
		Thread.sleep(2000);
		
		
		WebElement gender = driver.findElement(By.id("//input[@id='gender-male']"));
		gender.click();
		
		WebElement FirstName = driver.findElement(By.xpath(""));
		FirstName.click();
 		
		WebElement LastName = driver.findElement(By.xpath(""));
		LastName.click();
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath(""));
		email.click();
		
		WebElement password = driver.findElement(By.xpath(""));
		password.click();
		
		WebElement conformpwd = driver.findElement(By.xpath(""));
		conformpwd.click();
		
}		

}
