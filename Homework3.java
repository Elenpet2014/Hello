// public class Homework3{
	
// 	public static void main (String[] args){
// 		String [] sites = {"www.google.com", "www.youtube.com", "www.facebook.com", "www.imdb.com"};

// 		System.out.println(sites[1]);
// 	}
// }

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Homework3 {
    public static void main(String[] args) {
        String[] websites = {"https://www.example.com", "https://www.google.com"};

        for (String website : websites) {
            try {
                URL url = new URL(website);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                System.out.println(website + " - Response code: " + responseCode);

                connection.disconnect();
            } catch (IOException e) {
                System.out.println(website + " - Error: " + e.getMessage());
            }
        }
    }
}
