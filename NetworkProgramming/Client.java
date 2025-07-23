import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out.println("Hello Server");
        String reply = in.readLine();
        System.out.println("Server says: " + reply);
        s.close();
    }
}
