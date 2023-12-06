package interfaces;

import otherClasses.*;
// I could import abstractClasses.Customer here, but that Customer and this Customer would conflict.

public class Customer implements Interactable{
    abstractClasses.Customer user;

    public Customer(abstractClasses.Customer user) {
        this.user = user;
    }

    public void displayAccount() {
        System.out.println("-=-=- Customer -=-=-");
        System.out.printf("%-20s %-20s %-20s %-20s%n", "Name", "Contact Number", "Email", "Password");
        System.out.printf("%-20s %-20s %-20s %-20s%n", user.getName(), user.getContactNumber(), user.getEmail(), user.getPassword());
        System.out.println();

        System.out.println("To view orders, click [here]."); // Popup using displayOrders()
        System.out.println("To view reservations, click [here]."); // Popup using displayReservations()
    }

    public void displayOrders() {
        System.out.println("Orders:");
        for (Order checker : user.getMyOrders()) {
            System.out.println(checker.toString());
        }
        System.out.println();
    }

    public void displayReservations() {
        System.out.println("Reservations:");
        for (Reservation checker : user.getMyReservations()) {
            System.out.println(checker.toString());
        }
        System.out.println();
    }

    public void modifyOrders() {
        // Allows users to cancel their *own* orders or place a new one
    }

    public void modifyReservations() {
        // Allows users to cancel their *own* reservations or place a new one
    }
}
