package Sample;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Postrequest {

	public static void main(String[] args) {
		 try {
	            // Define the URL for the POST request
			 
	            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
	            
	            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	            
	            conn.setRequestMethod("POST");
	            
	            conn.setRequestProperty("Content-Type", "application/json; utf-8");
	            
	            conn.setRequestProperty("Accept", "application/json");
	            
	            conn.setDoOutput(true); // Enable writing to connection

	            // JSON body data
	            String jsonInputString = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

	            // Write JSON input data to the request body
	            
	            try (OutputStream os = conn.getOutputStream()) {
	            	
	                byte[] input = jsonInputString.getBytes("utf-8");
	                
	                os.write(input, 0, input.length);
	                
	            }

	            // Check if the request was successful
	            
	            int responseCode = conn.getResponseCode();
	            
	            System.out.println("Response Code: " + responseCode);

	            // Close the connection
	            
	            conn.disconnect();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	}
