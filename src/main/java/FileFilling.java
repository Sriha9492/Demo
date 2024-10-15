import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileFilling {

	public static void main(String[] args) {
		  // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Comcast\\chromedriver\\chromedriver.exe"); // Replace with the path to your ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the form page
        driver.get("https://demoqa.com/automation-practice-form"); // Replace with the actual URL

		

	}

}
