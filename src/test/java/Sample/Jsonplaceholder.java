package Sample;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import freemarker.core.ParseException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class Jsonplaceholder{

	 public static void main(String[] args) throws IOException, ParseException, org.apache.hc.core5.http.ParseException {
		 
	        // Step 1: Initialize WebDriver (Selenium)
		 
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://jsonplaceholder.typicode.com");

	        // Step 2: Initialize HttpClient to perform GET request to the JSONPlaceholder API
	        
	        CloseableHttpClient httpClient = HttpClients.createDefault();
	        
	        HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/posts/1");  // API endpoint

	        // Step 3: Execute the GET request and get the response
	        
	        try (CloseableHttpResponse response = httpClient.execute(request)) {
	        	
	            // Convert response into a string
	        	
	            String jsonResponse = EntityUtils.toString(response.getEntity());
	            
	            System.out.println("API Response: " + jsonResponse);  // Output the JSON response

	            // Example: Perform additional Selenium actions
	            
	        }

	 }	
}	
