

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @from http://www.java2blog.com/2016/07/how-to-send-http-request-getpost-in-java.html
 */
public class SampleGetRequest {

 private final String USER_AGENT = "Mozilla/5.0";

 public static void main(String[] args) throws Exception {

  SampleGetRequest http = new SampleGetRequest();

  // Sending get request
  http.sendingGetRequest();

 }

 // HTTP GET request
 private void sendingGetRequest() throws Exception {

  String urlString = "http://alexaphillyhack.herokuapp.com/api/readings/ ";
  
  URL url = new URL(urlString);
  HttpURLConnection con = (HttpURLConnection) url.openConnection();

  // By default it is GET request
  con.setRequestMethod("GET");

  //add request header
  con.setRequestProperty("User-Agent", USER_AGENT);

  int responseCode = con.getResponseCode();
  System.out.println("Sending get request : "+ url);
  System.out.println("Response code : "+ responseCode);

  // Reading response from input Stream
  BufferedReader in = new BufferedReader(
          new InputStreamReader(con.getInputStream()));
  String output;
  StringBuffer response = new StringBuffer();

  while ((output = in.readLine()) != null) {
   response.append(output);
  }
  in.close();

  //printing result from response
  System.out.println(response.toString());

 }
}
