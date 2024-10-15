package Sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applesite {

	public static void main(String[] args)throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://www.apple.com/in");
		
		  		
		  WebElement iPhone16 = driver.findElement(By.xpath("//body[@class='page-home ac-nav-overlap globalnav-scrim  body-with-ribbon globalheader-dark']"));
		  iPhone16.click();
		  Thread.sleep(2000);
		  
		  WebElement availabilityElement = driver.findElement(By.xpath("//span[@data-pricing-product='iphone-16-pro']"));
		  availabilityElement.click();
		  String availabilityStatus = availabilityElement.getText();
		  
         /* WebElement  Storage= driver.findElement(By.xpath("//span[@class='row']"));
          Storage.click();
          
          WebElement  checkavalible= driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[4]/div/div/div/div/div/div[3]/div/div/div/div[1]/div/div/div[2]/div/div/button/span"));
          checkavalible.click();*/
          
          
          
            System.out.println("Availability of iPhone 15 Pro: " + availabilityStatus);
         // System.out.println("The price of iPhone 15 Pro is: " + price);

	}

}
