package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.internal.Excluder;

import java.io.IOException;
import java.util.List;

public class Addcart {
    public static void main(String[] args) throws IOException {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe");
    	
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://demowebshop.tricentis.com/");
		
		Excluder excelReader = new Excluder();
		 
	   // List<Product> products = excelReader.getProductsFromExcel("C:\\Users\\SRPULA\\OneDrive - Capgemini\\Desktop\\Excel.xlsx");

	       
	        
	        

    }      
}
