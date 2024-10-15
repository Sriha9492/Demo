package Sample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException, IOException {
		
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
		emailadd.sendKeys("Srihari754@gmail.com");
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
		
		
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        
 		Date date = new Date();
 		String timestamp = dateFormat.format(date);
  
 		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 		FileUtils.copyFile(screenShot, new File("./Screenshot/image_" + timestamp + ".png"));
 		Thread.sleep(3000);
		
		
		
		
		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		Continue.click();
		Thread.sleep(1000);
		
		//Product selecting
		
 		WebElement Product = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
 		Product.click();
 	
 		Thread.sleep(1000);
 	
 		
 		WebElement Tshirt1 = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
 		Tshirt1.click();
 		
        
 		
 		//Add to cart
 		WebElement AddCart = driver.findElement(By.xpath("//button[@type='button']"));
 		AddCart.click();
 		Thread.sleep(2000);
 		
 		

 		WebElement Shopingcontinue = driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
 		Shopingcontinue.click();
 		
 		WebElement Cart = driver.findElement(By.xpath("//a[@href='/view_cart']"));
 		Cart.click();
 		
 		
 		 WebElement couponCodeInput = driver.findElement(By.id("coupon-code-input"));
         couponCodeInput.sendKeys("DISCOUNT10");

         // 4. Apply the coupon by clicking the "Apply Coupon" button
         
         WebElement applyCouponButton = driver.findElement(By.id("apply-coupon-button"));
         applyCouponButton.click();

         // 5. Verify the coupon application success message or discount amount
         
         WebElement successMessage = driver.findElement(By.id("coupon-success-message"));
         if (successMessage.getText().contains("Coupon applied successfully")) {
             System.out.println("Coupon applied successfully!");
         } else {
             System.out.println("Failed to apply coupon.");
         }

        
         WebElement totalPrice = driver.findElement(By.id("total-price"));
         System.out.println("Total price after discount: " + totalPrice.getText());
 		
 		/*//checkout 
 		WebElement Proceedtocheckout = driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
 		Proceedtocheckout.click();
 		Thread.sleep(1000);
 		
 		WebElement Placeorder = driver.findElement(By.xpath("//a[@href='/payment']"));
 		Placeorder.click();
 		Thread.sleep(3000);
 		
 		//Paymentdetails
 		WebElement Accountholder = driver.findElement(By.xpath("//input[@class='form-control']"));
 		Accountholder.sendKeys("Srihari");
 		Thread.sleep(2000);
 		
 		WebElement Cardnumber = driver.findElement(By.xpath("//input[@name='card_number']"));
 		Cardnumber.sendKeys("1111 2222 3333 4444");
 		
 		Thread.sleep(2000);
 		WebElement CVC = driver.findElement(By.xpath("//input[@name='cvc']"));
 		CVC.sendKeys("311");
 		
 		Thread.sleep(2000);
 		
 		WebElement ExpirationM = driver.findElement(By.xpath("//input[@class='form-control card-expiry-month']"));
 		ExpirationM.sendKeys("01");
 		Thread.sleep(2000);
 		
 		WebElement ExpirationY = driver.findElement(By.xpath("//input[@name='expiry_year']"));
 		ExpirationY.sendKeys("2025");
 		Thread.sleep(2000);
 		
 		WebElement ConfiromOrder = driver.findElement(By.xpath("//button[@class='form-control btn btn-primary submit-button']"));
 		ConfiromOrder.click();
 		Thread.sleep(2000);
 		
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        
 		Date date2 = new Date();
 		String timestamp2 = dateFormat.format(date);
  
 		File screenShot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 		FileUtils.copyFile(screenShot, new File("./Screenshot/image_" + timestamp + ".png"));
 		Thread.sleep(3000);
 		//invoice
 		WebElement Downloadinvoice = driver.findElement(By.xpath("//a[@href='/download_invoice/500']"));
 		Downloadinvoice.click();
 		
 		//delete account
 		WebElement Continues = driver.findElement(By.xpath("//a[@href='/']"));
 		Continues.click();
 		
 		WebElement DeleteAccount = driver.findElement(By.xpath("//a[@href='/delete_account']"));
 		DeleteAccount.click(); 		
 		
 		WebElement Contiune1 = driver.findElement(By.xpath("//a[@href='/']"));
 		Contiune1.click();*/
 		
 		
 		
 		
	}

}
