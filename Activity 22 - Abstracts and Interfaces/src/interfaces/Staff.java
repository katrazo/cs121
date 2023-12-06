package interfaces;

import otherClasses.*;

public class Staff implements Interactable{
    abstractClasses.Staff user;

    public Staff(abstractClasses.Staff user) {
        this.user = user;
    }

    public void displayAccount() {
        System.out.println("-=-=- Staff -=-=-");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", "Name", "Contact Number", "Email", "Password", "Role");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", user.getName(), user.getContactNumber(), user.getEmail(), user.getPassword(), user.getRole());
        System.out.println();

        System.out.println("To view orders, click [here]."); // Popup using displayOrders()
        System.out.println("To view reservations, click [here]."); // Popup using displayReservations()
    }

    public void displayOrders() {
        System.out.println("Orders:");
        for (Order checker : user.getRestaurant().getOrders()) {
            System.out.println(checker.toString());
        }
        System.out.println();
    }

    public void displayReservations() {
        System.out.println("Reservations:");
        for (Reservation checker : user.getRestaurant().getReservations()) {
            System.out.println(checker.toString());
        }
        System.out.println();
    }

    public void displayMyTables() {
        // Prints out all managed tables
    }

    public void modifyOrders() {
        // Allows users to cancel **the restaurant's** orders or place a new one
    }

    public void modifyReservations() {
        // Allows users to cancel **the restaurant's** reservations or place a new one
    }
}
