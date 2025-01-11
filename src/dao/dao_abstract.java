package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.database;

public class dao_abstract extends controller_abstract{
    
    @Override
    public void handleSeatSelection(String seatNumber) {
        String query = "INSERT INTO selected_seats (seat_number) VALUES (?)";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, seatNumber);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public boolean addFlight(String flight_code, String flight_source, String destination, String flight_date, String flight_class) {
    
    String query = "INSERT INTO reservations (flight_code, flight_source, destination, flight_date, flight_class) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, flight_code);
            stmt.setString(2, flight_source);
            stmt.setString(3, destination);
            stmt.setString(4, flight_date);
            stmt.setString(5, flight_class);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
        @Override
    public boolean addPassenger(String passport, String name_user, String address, String mobile_number, String email) {
        String query = "INSERT INTO passenger (passport, name_user, address, mobile_number, email) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, passport);
            stmt.setString(2, name_user);
            stmt.setString(3, address);
            stmt.setString(4, mobile_number);
            stmt.setString(5, email);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void setFieldReservationsToLabel(String columnName, javax.swing.JLabel label) {
        String query = "SELECT " + columnName + " FROM reservations ORDER BY id_reservations DESC LIMIT 1";

        try (java.sql.Connection conn = database.getConnection();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            String value = rs.getString(columnName);
            label.setText(value); // Tampilkan di JLabel
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
            label.setText("Error fetching " + columnName);
        }
    }

    @Override
    public void setFieldSeatToLabel(String seat_number, javax.swing.JLabel result_seat) {
        String query = "SELECT seat_number FROM selected_seats ORDER BY id DESC LIMIT 1";

        try (java.sql.Connection conn = database.getConnection();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        if (rs.next()) {
            String value = rs.getString("seat_number"); // Ambil kolom "seat_number"
            result_seat.setText(value); // Tampilkan di JLabel
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
            result_seat.setText("Error fetching data");
        }
    }
    
    @Override
    public void setFieldPassengerToLabel(String columnName, javax.swing.JLabel label) {
        String query = "SELECT " + columnName + " FROM passenger ORDER BY id_passenger DESC LIMIT 1";
        
        try (Connection conn = database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                String value = rs.getString(columnName);
                label.setText(value); // Set the value to the JLabel
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            label.setText("Error fetching data for " + columnName);
        }
    }
    
    @Override
    public boolean loginPassenger(String username_user, String password_user) {
        String query = "SELECT username_user, password_user FROM sign_up WHERE username_user = ? AND password_user = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username_user);
            stmt.setString(2, password_user);

                  // Eksekusi query
        ResultSet rs = stmt.executeQuery();

        // Jika ada hasil, login berhasil
        return rs.next();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
    
        @Override
    public boolean loginAdmin(String username_admin, String password_admin) {
        String query = "SELECT * FROM login_admin WHERE username_admin = ? AND password_admin = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username_admin);
            stmt.setString(2, password_admin);

        // Eksekusi query
        ResultSet rs = stmt.executeQuery();

        // Jika ada hasil, login berhasil
        return rs.next();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }    

    @Override
    public boolean signUpPassenger(String username_user, String password_user, String firstName_user, String lastName_user, String gender) {
        String query = "INSERT INTO sign_up (username_user, password_user, firstName_user, lastName_user, gender) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username_user);
            stmt.setString(2, password_user);
            stmt.setString(3, firstName_user);
            stmt.setString(4, lastName_user);
            stmt.setString(5, gender);

             int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        return false; 
        }
    }   
}
