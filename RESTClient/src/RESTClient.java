import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * RestClient Demo connecting to samples.openweathermap.org URL REST services
 * Advance Thank you to Open Weather
 */
public class RESTClient {

	public static void main(String[] args) {
		System.out.println("RESTful Application");
		
		try {
			URL weather = new URL(" https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22");
			URLConnection tc = weather.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(tc.getInputStream()));
			
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
