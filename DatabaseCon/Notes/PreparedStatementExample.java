import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");

            // SQL query with placeholders
            String sql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";

            // Create PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set parameters
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Ayush");
            pstmt.setString(3, "ayush@gmail.com");

            // Execute
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully.");

            // Close connections
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
