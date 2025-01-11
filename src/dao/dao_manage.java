/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import koneksi.database;

/**
 *
 * @author febri
 */
public class dao_manage implements interface_manage{
    @Override
    public boolean addPassenger(String passport, String name, String address, String mobileNumber, String email) {
        String query = "INSERT INTO passenger (passport, name_user, address, mobile_number, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, passport);
            stmt.setString(2, name);
            stmt.setString(3, address);
            stmt.setString(4, mobileNumber);
            stmt.setString(5, email);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePassenger(int id, String passport, String name, String address, String mobileNumber, String email) {
        String query = "UPDATE passenger SET passport = ?, name_user = ?, address = ?, mobile_number = ?, email = ? WHERE id_passenger = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, passport);
            stmt.setString(2, name);
            stmt.setString(3, address);
            stmt.setString(4, mobileNumber);
            stmt.setString(5, email);
            stmt.setInt(6, id); // id_passenger tidak berubah

            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePassenger(int id) {
        String query = "DELETE FROM passenger WHERE id_passenger = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean addSchedule(String flight_code, String flight_source, String destination, java.util.Date flight_date) {
        String query = "INSERT INTO flight (flight_code, flight_source, destination, flight_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, flight_code);
            stmt.setString(2, flight_source);
            stmt.setString(3, destination);
            stmt.setDate(4, new java.sql.Date(flight_date.getTime()));

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateSchedule(int id_flight, String flight_code, String flight_source, String destination, java.util.Date flight_date) {
        String query = "UPDATE flight SET flight_code = ?, flight_source = ?, destination = ?, flight_date = ? WHERE id_flight = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, flight_code);
            stmt.setString(2, flight_source);
            stmt.setString(3, destination);
            stmt.setDate(4, new java.sql.Date(flight_date.getTime()));
            stmt.setInt(5, id_flight);

            return stmt.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteSchedule(int id_flight) {
        String query = "DELETE FROM flight WHERE id_flight = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id_flight);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean addBook(String flight_code, String flight_source, String destination, String flight_date, String flight_class) {
        String query = "INSERT INTO reservations (flight_code, flight_source, destination, flight_date) VALUES (?, ?, ?, ?, ?)";
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
    public boolean updateBook(int idReservations, String flight_code, String flight_source, String destination, String flight_date, String flight_class) {
        String query = "UPDATE reservations SET flight_code = ?, flight_source = ?, destination = ?, flight_date = ?, flight_class = ? WHERE id_reservations = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, flight_code);
            stmt.setString(2, flight_source);
            stmt.setString(3, destination);
            stmt.setString(4, flight_date);
            stmt.setString(5, flight_class);
            stmt.setInt(6, idReservations);

            return stmt.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteBook(int id_reservations) {
        String query = "DELETE FROM reservations WHERE id_reservations = ?";
        try (Connection conn = database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, id_reservations);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    
}
