package interfaces;

import otherClasses.*;

public interface Interactable {
    // More or less the same for both, but a staff member has additional information (Role, Managed Tables)
    public void displayAccount();

    // For a customer, this is their previous orders. For a staff member, this is the restaurant's orders.
    public void displayOrders();

    // A similar story: a customer's previous reservations; for a staff member, the restaurant's reservations
    public void displayReservations();

    // For a customer, they can place a new one or cancel an old one.
    // For a staff member, they can force-cancel orders or mark them as complete/change their status.
    public void modifyOrders();

    // Same deal as before, but for reservations instead
    public void modifyReservations();
}
