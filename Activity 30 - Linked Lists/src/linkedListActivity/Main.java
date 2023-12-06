package linkedListActivity;

import linkedListActivity.otherClasses.Table;

public class Main {
    public static void main(String[] args) {
        RestaurantUser user1 = new RestaurantUser("Bob","Today",4,1,"Selection 1",1);
        RestaurantUser user2 = new RestaurantUser("Jimbathy","Tomorrow",7,2,"Selection 2",2);

        // -=-=- user1: Bob -=-=-
        user1.addTableReservation(new Table(1, true));
        user1.addTableReservation(new Table(2, true));
        user1.addTableReservation(new Table(2, true));

        System.out.println(user1.getUserInfo() + "\n");

        user1.displayUserBooking();

        user1.removeTableReservation(user1.getTableFromList(2));

        user1.displayUserBooking();

        // -=-=- user1: Jimbathy -=-=-
        user2.addTableReservation(new Table(3, true));
        user2.addTableReservation(new Table(2, true));
        user2.addTableReservation(new Table(2, true));

        System.out.println(user2.getUserInfo() + "\n");

        user2.displayUserBooking();

        user2.removeTableReservation(user2.getTableFromList(1));

        user2.displayUserBooking();
    }
}
