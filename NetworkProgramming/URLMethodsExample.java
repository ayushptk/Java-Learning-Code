import java.net.*;

public class URLMethodsExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.pathakaayush.com:443/index.html");

            // Display commonly used methods of URL class
            System.out.println("Protocol   : " + url.getProtocol());   // https
            System.out.println("Host       : " + url.getHost());       // www.example.com
            System.out.println("Port       : " + url.getPort());       // 443
            System.out.println("Path       : " + url.getPath());       // /index.html
       

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
