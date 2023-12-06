package abstractClasses;

import otherClasses.*;
import java.util.ArrayList;

public class Customer extends User{
    private ArrayList<Order> myOrders;
    private ArrayList<Reservation> myReservations;

    public Customer(String name, String contactNumber, String email, String password, Restaurant restaurant, ArrayList<Order> myOrders, ArrayList<Reservation> myReservations) {
        super(name, contactNumber, email, password, restaurant);
        this.myOrders = myOrders;
        this.myReservations = myReservations;
    }
    public Customer() {
        super("Bob", "333", "bobbbb@gmail.com","weewoocopcar", new Restaurant());
        myOrders = new ArrayList<Order>();
        myReservations = new ArrayList<Reservation>();
    }

    public ArrayList<Order> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(ArrayList<Order> myOrders) {
        this.myOrders = myOrders;
    }

    public ArrayList<Reservation> getMyReservations() {
        return myReservations;
    }

    public void setMyReservations(ArrayList<Reservation> myReservations) {
        this.myReservations = myReservations;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "myOrders=" + myOrders +
                ", myReservations=" + myReservations +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", restaurant=" + restaurant +
                '}';
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password changed successfully to: " + password);
    }

}
