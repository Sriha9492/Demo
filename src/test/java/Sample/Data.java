package Sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.github.dockerjava.transport.DockerHttpClient.Response;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;

public class Data {

	private static final String RestAssured = null;

	public static void main(String[] args) {
		 
		 try {
	            // API URL
			 
	            String apiUrl = "https://reqres.in/"; 
	            
	            // Create a URL object
	            
	            URL url = new URL(apiUrl);
	            
	            // Open connection
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            
	            // Set the request method (GET in this case)
	            
	            connection.setRequestMethod("GET");
	            
	            // Set request headers if required (optional)
	            
	            connection.setRequestProperty("Accept", "application/json");
	            
	            // Get the response code
	            
	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);
	            
	            // If the response code is 200 (HTTP OK)
	            
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                StringBuilder response = new StringBuilder();
	                
	                while ((inputLine = in.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                
	                in.close();
	                
	                // Print the API response
	                System.out.println("API Response: " + response.toString());
	                
	                // Now, integrate Selenium WebDriver after API call
	                
	                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	                WebDriver driver = new ChromeDriver();
	                
	                // Open a website or perform further actions using Selenium
	                
	                driver.get("");
	            } else {
	                System.out.println("GET request failed.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}
