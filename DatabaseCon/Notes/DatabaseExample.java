import java.sql.*;

public class DatabaseExample {
    public static void main(String[] args) {
          // Connection URL, Username, Password
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "password";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

          
            // Connect to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // Create statement object to run SQL queries
            Statement stmt = con.createStatement();

            // Create a new table using DDL
            String createTableSql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255))";
            stmt.executeUpdate(createTableSql);

            // Insert data into the table using DML
            String insertSql = "INSERT INTO users VALUES (1, 'Manisha', 'mss@gmail.com')";
            stmt.executeUpdate(insertSql);

            // Retrieve data from the table using DML
            String selectSql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(selectSql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            // Update data in the table using DML
            String updateSql = "UPDATE users SET name = 'Shila' WHERE id = 1";
            stmt.executeUpdate(updateSql);

            // Delete data from the table using DML
            String deleteSql = "DELETE FROM users WHERE id = 1";
            stmt.executeUpdate(deleteSql);

            // Drop the table using DDL
            String dropTableSql = "DROP TABLE users";
            stmt.executeUpdate(dropTableSql);

            // Close connections
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
