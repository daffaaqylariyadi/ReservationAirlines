/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author febri
 */
public interface interface_manage {
    
    //passenger
    boolean addPassenger(String passport, String name, String address, String mobileNumber, String email);
    boolean updatePassenger(int id, String passport, String name, String address, String mobileNumber, String email);
    boolean deletePassenger(int id);
    
    //schedule
    boolean addSchedule(String flight_code, String flight_source, String destination, java.util.Date flight_date);
    boolean updateSchedule(int id_flight, String flight_code, String flight_source, String destination, java.util.Date flight_date);
    boolean deleteSchedule(int id_flight);
    
    //reservations
    boolean addBook(String flight_code, String flight_source, String destination, String flight_date, String flight_class);
    boolean updateBook(int idReservations, String flight_code, String flight_source, String destination, String flight_date, String flight_class);
    boolean deleteBook(int id_reservations);
}
