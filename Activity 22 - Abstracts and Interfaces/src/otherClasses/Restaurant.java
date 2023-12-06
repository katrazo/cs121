package otherClasses;

import java.util.ArrayList;

public class Restaurant {
    Menu menu;
    ArrayList<Order> orders;
    ArrayList<Table> tables;
    ArrayList<Reservation> reservations;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "menu=" + menu +
                ", orders=" + orders +
                ", tables=" + tables +
                ", reservations=" + reservations +
                '}';
    }
}
