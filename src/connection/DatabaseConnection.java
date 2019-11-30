package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/test";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        return connection;
    }

    private static Connection connection = null;

    public boolean startConnection() throws SQLException {
        // driverName:dbms://IPAddress:portNumber/databaseName
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection != null;
    }

    public void printConnectionStatus() throws SQLException {
        System.out.println(this.startConnection() ? "Connection OK" : "Connection Failed");
    }
}
