package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private static Connection conn = null;
  public static String url = "jdbc:mysql://localhost:3306/BloodManagement?useSSL=false&allowPublicKeyRetrieval=true";
  private static final String user = "root"; // your DB username
  private static final String password = "1234"; // your DB password

  public static Connection connect() {
    try {
      // Load MySQL JDBC Driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish the connection
      conn = DriverManager.getConnection(url, user, password);
      System.out.println("✅ Database connected successfully.");
    } catch (ClassNotFoundException e) {
      System.err.println("❌ JDBC Driver not found: " + e.getMessage());
    } catch (SQLException e) {
      System.err.println("❌ SQL Error: " + e.getMessage());
    }
    return conn;
  }

  public static Connection getConnection() {
    try {
      if (conn == null || conn.isClosed()) {
        connect();
      }
    } catch (SQLException e) {
      System.err.println("❌ Connection check failed: " + e.getMessage());
    }
    return conn;
  }
}
