package Sample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Demoweb {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://demoqa.com/automation-practice-form");
            
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); 
            
            JavascriptExecutor js = (JavascriptExecutor) driver;
            
            WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
            
            js.executeScript("arguments[0].scrollIntoView(true)", firstNameField);
	         js.executeScript("window.scrollBy(0,-200)", "");
	         //js.executeScript("arguments[0].click();", firstNameField);
	         Thread.sleep(5000);
	         
            //firstNameField.click();
            firstNameField.sendKeys("sri");
            Thread.sleep(2000);
            
            
            
            WebElement LastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
           
            LastNameField.sendKeys("Hari");
            Thread.sleep(2000);
            
            WebElement Email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='name@example.com']")));
            
            Email.sendKeys("srihari@gmail.com");
            Email.click();
            Thread.sleep(2000);
             
            WebElement Gender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")));
            Gender.click();  
            Thread.sleep(2000);
            
            
            //WebElement Gender1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")));
            //WebElement Gender2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")));
            
            //if (Gender==driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"))) {
            //    Gender.click();
            //} else if (Gender1==driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"))) {
            //    Gender1.click();
            //} else {
            //    Gender2.click();
            //}
            WebElement Mobile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Mobile Number']")));
            Mobile.sendKeys("9492933212");
            Mobile.click();
            Thread.sleep(2000);
            
            WebElement dob = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dateOfBirthInput']")));
            dob.click();
            Thread.sleep(2000);
            
            WebElement dob1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='react-datepicker__year-select']")));
            dob1.click();
            Thread.sleep(2000);
            
            
            WebElement doby = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='1996']")));
            doby.click();
            Thread.sleep(2000);
            
            
            WebElement dobm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='8']")));
            dobm.click();
            Thread.sleep(2000);
            
            WebElement dobd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@tabindex=\"-1\"]")));
            dobd.click();
            Thread.sleep(2000);
            
          
            
            
            
          //  WebElement Subject = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")));
           // Subject.click();
           // Subject.sendKeys("Maths","Science");
            
	         
            WebElement SubjectEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='subjectsInput']")));
            js.executeScript("arguments[0].scrollIntoView(true)", SubjectEle);
	         js.executeScript("window.scrollBy(0,-200)", "");
	         //js.executeScript("arguments[0].click();", firstNameField);
	         Thread.sleep(5000);
	         
            Actions action = new Actions(driver);
            action.moveToElement((SubjectEle)).perform();
            action.click(SubjectEle).perform();
            Thread.sleep(1000);
            action.sendKeys("Maths").build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.TAB).build().perform();
            
   
            
                        
            WebElement Hobbies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]")));
            Hobbies.click();
            Thread.sleep(2000);
            
            WebElement uploadfile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"uploadPicture\"]")));
            Thread.sleep(2000);
            uploadfile.sendKeys("C:\\Users\\SRPULA\\Downloads\\Payslips\\download.jpg");
            
            
            WebElement CurrentAddress
                                = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@id=\"currentAddress\"]")));
            CurrentAddress.sendKeys("Vijayawada ");
            Thread.sleep(6000);
           
    
            
            
            WebElement  State= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Select State')]")));
             
             js.executeScript("arguments[0].scrollIntoView(true)",State );
	         js.executeScript("window.scrollBy(0,-200)", "State");
	         //js.executeScript("arguments[0].click();", firstNameField);
	         //Thread.sleep(5000);
           
	         Actions action1 = new Actions(driver);
	            action.moveToElement((State)).perform();
	            action.click(State).perform();
	            Thread.sleep(1000);
	            action.sendKeys("NCR").build().perform();
	            Thread.sleep(1000);
	            action.sendKeys(Keys.TAB).build().perform();
            
            Thread.sleep(1000);
         
            
            
            WebElement  City= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Select City')]")));
            
            Actions actions = new Actions(driver);
            action.moveToElement((City)).perform();
            action.click(City).perform();
            Thread.sleep(1000);
            action.sendKeys("Delhi").build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.TAB).build().perform();
            
            /*Actions action1 = new Actions(driver);
            action.moveToElement((City)).perform();
            action.click(City).perform();
            Thread.sleep(1000);
            action.sendKeys("Delhi").build().perform();
            Thread.sleep(1000);
            action.sendKeys(Keys.SHIFT).build().perform();*/
            
           /* WebElement SelectState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"state\"]/div/div[2]/div/svg")));
            Thread.sleep(2000);
            SelectState.sendKeys("NCR");*/
            
           // WebElement Submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"submit\"]")));
            
            WebElement submitButton = driver.findElement(By.id("submit"));
            Thread.sleep(2000);
            submitButton.click();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
            
     		Date date = new Date();
     		String timestamp = dateFormat.format(date);
      
     		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     		FileUtils.copyFile(screenShot, new File("./Screenshot/image_" + timestamp + ".png"));
     		Thread.sleep(3000);
            
            
            
             //driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        } 
            
    }
}
