// Create the client
// Example:
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;

// Define the remote interface
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}

// Implement the remote interface
public class HelloImpl extends UnicastRemoteObject implements Hello {
    public HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello, World!";
    }
}

// Create the server
public class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl(); // Create remote object

            // Bind the remote object in the RMI registry
            Naming.rebind("//localhost/Hello", obj);
            System.out.println("Hello Server ready");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}

// Create the client
public class Client {
    public static void main(String[] args) {
        try {
            // Lookup the remote object
            Hello obj = (Hello) Naming.lookup("//localhost/Hello");

            // Invoke a method on the remote object
            String message = obj.sayHello();
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Hello Client exception: " + e);
        }
    }
}
