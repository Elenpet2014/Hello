import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckWebSites{
	public static void main(String[] args){

		String websites [] = {"http://www.google.com", "http://www.youtube.com", "http://www.facebook.com"};
		for (String website : websites) {

			try {
                URL url = new URL(website);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                // System.out.println(responseCode);
                if (responseCode == HttpURLConnection.HTTP_OK){
                	System.out.println(website + " is accessible from your device");

                }else{
                	System.out.println(website + " is not accessible from your device");
                } 
                
            } catch (IOException e) {
                System.out.println("check your network connection");
                break;
            }

		}

	}

}
