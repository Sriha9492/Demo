package Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
public class Totals {

	public static void main(String[] args) throws InterruptedException, IOException{
        
			System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();


			driver.get("https://demowebshop.tricentis.com/");
		 
		        // Locate all cart items with price elements
			WebElement Login = driver.findElement(By.xpath("//a[@href='/login']"));
			Login.click();

		
			WebElement emailid = driver.findElement(By.xpath("//input[@class='email']"));
			emailid.sendKeys("haripula333@gmail.com");
			
        
			WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
			Password.sendKeys("Sriharipula@12");
			
			
			WebElement Loginbutton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
			Loginbutton.click();
		    
		    WebElement Books = driver.findElement(By.xpath("//a[@href='/books']"));
			Books.click();
			Thread.sleep(1000);


			WebElement Computer1 = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
			Computer1.click();
		    Thread.sleep(2000);

			WebElement Computer2 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
			Computer2.click();
		    Thread.sleep(2000);

			WebElement Shopingcart = driver.findElement(By.xpath("//a[@href='/cart']"));
			Shopingcart.click();
		    Thread.sleep(2000);

		    String value1 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[1]")).getText();
		    
		    String value2 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[2]")).getText();

		    double book1= Double.parseDouble(value1 );
		    double book2=Double.parseDouble(value2);
		    
		    if(book1 <book2) {
		    	
		    	WebElement Rm = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		    	Rm.click();
		    	WebElement Updatebutton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		    	Updatebutton.click();
		    }else {
		    		
		    	System.out.println("Let value1");
		    }
		   
		    Thread.sleep(2000);
		    
		    driver .navigate().back();
		    Thread.sleep(2000);
		    driver .navigate().back();

		    //3rd item
		    WebElement Computer3 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
			Computer3.click();
		   
		    //addded cart 
			
		    WebElement Shoping = driver.findElement(By.xpath("//a[@href='/cart']"));
		    Shoping.click();
		    
		    String Price1 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[1]")).getText();
		    
		    String Price2 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[2]")).getText();
		    
		   // String Price3 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[3]")).getText();
		   
		  double books1= Double.parseDouble(Price1 );
		    double books2=Double.parseDouble(Price2);
		  
		    // Sum of two products
		    int Sum =(int) (books1+books2);
		   
		    System.out.println(Sum);
		    
		    String Sum1 = String.valueOf(Sum);
		    
		    System.out.println(Sum1);
		    
		    String Total = driver.findElement(By.xpath("//span[@class='product-price']")).getText();
		    System.out.println(Total);
		    //double Totals=Double.parseDouble(Total); 
		   
		    if(Sum1.contains(Sum1)) {
		    	
		    	System.out.println("The total value matches the sum of individual item prices.");
		    }
		    	else {
		            System.out.println("Mismatch: The total value does not match the sum of individual items.");
		            System.out.println("Displayed Total: " +Total );
		    	
		    }
		    
		    
		    WebElement Checkbox = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		    Checkbox.click();
		    Thread.sleep(1000);
		    
		    
		    
		    
		    }
	      
			
	}

