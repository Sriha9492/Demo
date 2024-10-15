package Sample;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product{

	private static WebElement[] priceElements;

	public static void main(String[] args) throws InterruptedException, IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://automationexercise.com/");

		WebElement Signup = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		Signup.click();

		WebElement Newuser = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
		Newuser.sendKeys("Srihari");
		Thread.sleep(2000);

		WebElement emailadd = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		emailadd.sendKeys("Srihari74@gmail.com");
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

		WebElement products3 = driver.findElement(By.xpath("//a[@href='/products']"));
		products3.click();



		WebElement Madame = driver.findElement(By.xpath("//a[@data-product-id='7']"));
		Madame.click();


		WebElement AddCart3 = driver.findElement(By.xpath("//button[@type='button']"));
		AddCart3.click();
		Thread.sleep(2000);

		//WebElement Shopingcontinue3 = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
		//Shopingcontinue3.click();

		WebElement Carts = driver.findElement(By.xpath("//a[@href='/view_cart']"));
		Carts.click();



		String bluetopprice=driver.findElement(By.xpath("(//p[@class='cart_total_price'])[1]")).getText();
		System.out.println(bluetopprice);

		String Stylishdress=driver.findElement(By.xpath("//*[@id=\"product-4\"]/td[5]/p[2]")).getText();
		System.out.println(Stylishdress);

		String Madames =driver.findElement(By.xpath("//*[@id=\"product-7\"]/td[5]/p[3]")).getText();
		System.out.println(Madames);

		List<Integer> price = new ArrayList<>();
		price.get(1);
        price.get(2);
        price.get(3);
		for (WebElement priceElement : priceElements) {
			String priceText = priceElement.getText().replace("$", "");  // Remove $ if present
			int priceValue = Integer.parseInt(priceText);  
			price.add(priceValue);  
		}

		Collections.sort(price);

        // If you need to sort in descending order
		
        Collections.sort(price, Collections.reverseOrder());
        
        System.out.println("Sorted prices in descending order: " + price);
        

	}   
}