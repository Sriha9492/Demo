package Sample;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Seconditem {

	private static java.util.List<WebElement> addToCartButtons;
	private static java.util.List<WebElement> cartItems;

	public static void main(String[] args)throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Launch browser

		driver.get("https://automationexercise.com/");



		WebElement Signup = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		Signup.click();

		WebElement Newuser = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		Newuser.sendKeys("Srihari");
		Thread.sleep(2000);

		WebElement emailadd = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		emailadd.sendKeys("Srihari725@gmail.com");
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

		//Product selecting

		WebElement Product = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
		Product.click();

		Thread.sleep(1000);


		WebElement Tshirt1 = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
		Tshirt1.click();

		WebElement AddCart = driver.findElement(By.xpath("//button[@type='button']"));
		AddCart.click();
		Thread.sleep(2000);

		WebElement Shopingcontinue = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		Shopingcontinue.click();



		js.executeScript("arguments[0].scrollIntoView(true)",Shopingcontinue );
		js.executeScript("window.scrollBy(0,100)", "Shopingcontinue");

		WebElement products = driver.findElement(By.xpath("//a[@href='/products']"));
		products.click();

		WebElement style = driver.findElement(By.xpath("//a[@href='/product_details/4']"));
		style.click();


		WebElement AddCart2 = driver.findElement(By.xpath("//button[@type='button']"));
		AddCart2.click();
		Thread.sleep(2000);

		WebElement Shopingcontinue2 = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		Shopingcontinue2.click();

		WebElement Cart = driver.findElement(By.xpath("//a[@href='/view_cart']"));
		Cart.click();
        
		WebElement Rem = driver.findElement(By.xpath("//i[@class='fa fa-times']"));
		Rem.click();
		
		WebElement aftCart = driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
		Cart.click();
		
		
		/*List cartItems = (List) driver.findElements(By.xpath("//a[@href='/product_details/1']"));}
		  public static void validateRemainingItems(WebDriver driver, String[] expectedRemainingItems) {
		        // Fetch the list of products currently in the cart
			  
		        List<WebElement> cartItems = driver.findElements(By.xpath("//i[@class='fa fa-times']"));
		        boolean validationPassed = true;
	
		        for (String expectedItem : expectedRemainingItems) {
		            boolean itemFound = false;
		            for (WebElement item : cartItems) {
		                String itemName = item.findElement(By.xpath("//input[@type='text']")).getText();
		                if (itemName.equals(expectedItem)) {
		                    itemFound = true;
		                    break;
		                }
		            }
		            if (!itemFound) {
		                validationPassed = false;
		                System.out.println("Validation Failed: " + expectedItem + " is not found in the cart.");
		            }
		        }

		        if (validationPassed) {
		            System.out.println("Validation Passed: All expected items are present in the cart.");
		        } else {
		            System.out.println("Validation Failed: Some expected items are missing.");
		        }*/
		    }	
	}


