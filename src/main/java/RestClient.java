import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;



import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.HttpClient.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pdoshi on 31/12/16.
 * You are allowed to go through internet
 * TODO :1 Using Httpclient try to use GET service to get json output
 * TODO :2 Using JSON jackson library try to parse the output to
 */
public class RestClient {

    private static final String restURL = "https://lognsystems.com:8443/ayurbaby/pregnancy/food/8/nutritional";

    public static void main(String... args) {

DefaultHttpClient httpclient =  new DefaultHttpClient();
HttpGet httpGet = new HttpGet(restURL);
        try {
            HttpResponse response = httpclient.execute(httpGet);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode());
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            httpclient.getConnectionManager().shutdown();
        }
        catch(IOException e)
        {

        }


    }



    //Convert to Java Object form JSON string that
    //is passed from main method
    //Please use Nutrition.java to bind json to java object
    public static void convertToJava(String jsonStr) {

    }
}



