package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL extends Database {
  public static final String DRIVER = "jdbc:mysql";
  public static final String HOSTNAME = "localhost";
  public static final String DATABASE = "trans_db";
  public static final String PORT = "3306";
  public static final String USERNAME = "root";
  private static final String PASSWORD = "";
  private Connection connection;

  public MySQL() {
    String url = String.format(
        "%s://%s:%s/%s?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
        DRIVER, HOSTNAME, PORT, DATABASE);
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      this.connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  @Override
  public Connection getConnection() {
    return connection;
  }
}
