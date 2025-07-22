import java.sql.*;

public class StatementExample {
    public static void main(String[] args) {
        // JDBC configuration
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb";
        String dbUser = "root";
        String dbPassword = "123456";  // Add password if needed

        try {
            // Load driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Create Statement
            Statement stmt = conn.createStatement();

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM users");

            // Process ResultSet
            while (rs.next()) {
                System.out.println(" The table fetch data is ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
}
