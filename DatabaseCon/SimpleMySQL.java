import java.sql.*;

public class SimpleMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = ""; // your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (
                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement()
            ) {
                // SQL with hardcoded values
                String sql = "INSERT INTO users (name, email) VALUES ('Ayush', 'ayush@example.com')";

                stmt.executeUpdate(sql);
                System.out.println("Inserted successfully!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
