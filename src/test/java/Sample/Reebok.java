package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Reebok {

	public static void main(String[] args) throws InterruptedException {
	
		
        System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=shoes");
        driver.manage().window().maximize();
        
        
        
          //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
          JavascriptExecutor js = (JavascriptExecutor) driver;

          WebElement Shopping=driver.findElement(By.xpath("//div[text() =\"Shopping\"]"));
          Shopping.click();
          
          
          js.executeScript("arguments[0].scrollIntoView(true)",Shopping );
	     // js.executeScript("window.scrollBy(0,00)", "Shopping");
	      js.executeScript("arguments[0].click();", Shopping);
          Thread.sleep(1000);

          
          //WebElement Brand=driver.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div[3]/div[1]/div[1]"));
           //Brand.click();
          
          js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
          
          
          
          WebElement Reebok=driver.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div[5]/div[2]/div/div/div/span[4]/div/a/span[2]/span"));
          Reebok.click();
          Thread.sleep(1000);
          
          WebElement Shoehighprice =driver.findElement(By.xpath(" //*[@id=\"ow15\"]/div[1]/div"));
          Shoehighprice.click();
          
          
          WebElement Shoesprice =driver.findElement(By.xpath("//*[@id=\"ow15\"]/div[1]/div"));
          Shoesprice.click();
          
        
          
          
       //WebElement Shopping = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cnt\"]/div[2]/div/div/a[2]/div")));
       // Shopping.sendKeys("Shopping");
       // Thread.sleep(2000);
       
        
	}

}
