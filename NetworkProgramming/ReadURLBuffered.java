import java.io.*;
import java.net.*;

class ReadURLBuffered {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://pathakayush.com.np/");        // URL of the file

        URLConnection connection = url.openConnection();   // Open connection

        // Read using BufferedReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);                      // Print each line
        }

        reader.close(); // Close reader
    }
}
