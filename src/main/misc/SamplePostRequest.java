

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * @from http://www.java2blog.com/2016/07/how-to-send-http-request-getpost-in-java.html
 */
public class SamplePostRequest {

 private final String USER_AGENT = "Mozilla/5.0";

 public static void main(String[] args) throws Exception {
   SamplePostRequest http = new SamplePostRequest();
   // Sending post request
   http.sendingPostRequest();
 }
 
 // HTTP Post request
 private void sendingPostRequest() throws Exception {
   String url = "http://alexaphillyhack.herokuapp.com/api/readings/ ";
   URL obj = new URL(url);
   HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Setting basic post request
  con.setRequestMethod("POST");
  con.setRequestProperty("User-Agent", USER_AGENT);
  con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
  con.setRequestProperty("Content-Type","application/json");

  String postJsonData = "{\"id\":5,\"countryName\":\"USA\",\"population\":8000}";
  
  // Send post request
  con.setDoOutput(true);
  DataOutputStream wr = new DataOutputStream(con.getOutputStream());
  wr.writeBytes(postJsonData);
  wr.flush();
  wr.close();

  int responseCode = con.getResponseCode();
  System.out.println("\nSending 'POST' request to URL : " + url);
  System.out.println("Post Data : " + postJsonData);
  System.out.println("Response Code : " + responseCode);

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
