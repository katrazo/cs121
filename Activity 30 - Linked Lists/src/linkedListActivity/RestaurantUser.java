package linkedListActivity;

import linkedListActivity.otherClasses.Table;

import java.util.LinkedList;

public class RestaurantUser {
    private String username; // A string representing the user's name.
    private String reservationDate; // for preservation purposes, stored as a string until parsed
    private int numberOfGuests; // The number of guests the user intends to reserve a table for.
    private int tableNumber; // I do not know the purpose of this; I only know that it is a number.
                             // Perhaps this is the number of the table being reserved in the *restaurant*?
    private Object menuSelection; // I'm not really sure what this is supposed to be.
                                  // Perhaps it is the selected item's from a restaurant's menu?
    private int orderNumber; // The ID of the user's order as it is to be tracked by the restaurant?
    private LinkedList<Table> tableList = new LinkedList<>(); // The list of tables reserved by this user?

    /**
     * A constructor for the Restaurant User class. Note that the "tableList" element is not constructed here.
     */
    public RestaurantUser(String username, String reservationDate, int numberOfGuests, int tableNumber, Object menuSelection, int orderNumber) {
        this.username = username;
        this.reservationDate = reservationDate;
        this.numberOfGuests = numberOfGuests;
        this.tableNumber = tableNumber;
        this.menuSelection = menuSelection;
        this.orderNumber = orderNumber;
    }

    /**
     * Adds a table object to the user's list of reserved tables.
     * @param table the table object to add to the list
     */
    public void addTableReservation(Table table) {
        tableList.add(table);
    }

    /**
     * Removes a table object from the user's list of reserved tables, if said table exists.
     * @param table the table object to remove from the list
     * @return returns true if the table is successfully removed; returns false if the user's list of reserved tables does not contain the argument object
     */
    public boolean removeTableReservation(Table table) {
        if (tableList.contains(table)) {
            tableList.remove(table);
            return true;
        }
        else
            return false;
    }

    /**
     * A glorified toString() method containing all user info except the list of reserved tables.
     * @return a String containing all user information except for the list of reserved tables.
     */
    public String getUserInfo() {
        return "RestaurantUser{" +
                "username='" + username + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", tableNumber=" + tableNumber +
                ", menuSelection=" + menuSelection +
                ", orderNumber=" + orderNumber +
                '}';
    }

    /**
     * Prints the list of reserved tables to the console output, utilizing each table's toString() method.
     */
    public void displayUserBooking() {
        System.out.println("-=-=- Booked Tables: -=-=-");
        for (Table currentTable : tableList)
            System.out.println(currentTable.toString());
        System.out.println();
    }

    // -=-=- Extra Methods -=-=-

    /**
     * A personal method for ease of access in removing tables that certainly exist inside of the main method
     * @param index the index of the table in the list
     * @return the table at the index
     */
    public Table getTableFromList (int index) {
        return tableList.get(index);
    }
}
