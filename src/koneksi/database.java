package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {

    private static final String URL = "jdbc:mysql://localhost:3306/Airlines_Project1";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Method untuk menjalankan query SELECT dan mengembalikan ResultSet
    public static ResultSet executeQuery(String query) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        return stmt.executeQuery();
    }

    // Method untuk menjalankan query INSERT, UPDATE, DELETE
    public static int executeUpdate(String query) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        return stmt.executeUpdate();
    }
}
