import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9806);
            System.out.println("Server is waiting for client...");

            Socket soc = ss.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String clientMsg = in.readLine();

            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Client message: " + clientMsg);

            soc.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
