import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import java.util.Scanner;

public class RestApiClient {
    public static void main(String[] args) throws Exception {
        // To read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter city name: ");
        String city = scanner.nextLine().trim();  // Read city name and remove leading/trailing spaces

        // OpenWeatherMap API key
        String apiKey = "295afbf53552b3369aeb7e24c0bc4ef8";
        
        // Construct the URL to call the weather API for the specified city with metric units
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                     "&appid=" + apiKey + "&units=metric";

        // Create an HttpClient instance to send HTTP requests
        HttpClient client = HttpClient.newHttpClient();
        
        // Build the HTTP GET request with the constructed URL
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Send the request and get the response body as a String
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parse the JSON response string into a JSONObject
        JSONObject json = new JSONObject(response.body());

        // Check if the response contains an error code (non-200 means error)
        if (json.has("cod") && json.getInt("cod") != 200) {
            // Print the error message from API and stop execution
            System.out.println("API Error: " + json.getString("message"));
            return;
        }

        // Extract the city name from the JSON response
        String cityName = json.getString("name");
        
        // Extract the "main" object that contains temperature and humidity data
        JSONObject main = json.getJSONObject("main");
        
        // Extract temperature details
        double temp = main.getDouble("temp");
        double feelsLike = main.getDouble("feels_like");
        int humidity = main.getInt("humidity");
        
        // Extract weather description from the "weather" array (first element)
        String description = json.getJSONArray("weather").getJSONObject(0).getString("description");

        // Display the fetched weather data in a user-friendly format
        System.out.println("\nWeather Data for " + cityName + ":");
        System.out.println("Temperature: " + temp + " °C");
        System.out.println("Feels Like: " + feelsLike + " °C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println("Description: " + description);
    }
}
