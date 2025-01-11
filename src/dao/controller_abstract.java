/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author HP
 */
public abstract class controller_abstract {
    public String username_user;
    public String password_user;
    public String firstname_user;
    public String lastname_user;
    public String gender;
    public String username_admin;
    public String password_admin;
    
    
    public abstract void setFieldReservationsToLabel(String columnName, javax.swing.JLabel label);
    public abstract void setFieldSeatToLabel(String seat_number, javax.swing.JLabel label);
    public abstract void setFieldPassengerToLabel(String columnName, javax.swing.JLabel label);
    public abstract boolean signUpPassenger(String username_user,String password_user,String firstName_user,String lastName_user,String gender);
    public abstract boolean loginPassenger(String username_user, String password_user);
    public abstract boolean loginAdmin(String username_admin, String password_admin);
    public abstract boolean addPassenger(String passport, String name_user, String address, String mobile_number, String email);
    public abstract boolean addFlight(String flight_code, String flight_source, String destination, String flight_date, String flight_class);
    public abstract void handleSeatSelection(String seatNumber);
    
}
