import java.sql.*;

public class SQLExceptionHandling {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "wrongpass")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM invalid_table");
        } catch (SQLException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
