import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client started");
            Socket soc = new Socket("localhost", 9806);
//read the text from the keyboard and user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String str = userInput.readLine();
//write the string to the socket
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);

            //read the response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());

            soc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
