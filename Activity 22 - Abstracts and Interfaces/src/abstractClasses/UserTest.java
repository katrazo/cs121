package abstractClasses;

import otherClasses.*;
import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        System.out.println();
        Restaurant myRestaurant = new Restaurant();

        Customer myCustomer = new Customer("Jimbathy", "3173173177", "jim.bathy@gmail.com", "b1rds4reC00l!", myRestaurant, new ArrayList<Order>(), new ArrayList<Reservation>());
        System.out.println(myCustomer.getName() + "'s current password is: " + myCustomer.getPassword());
        myCustomer.setPassword("wawawawawa");
        System.out.println();

        // In case you were wondering, these are references to that old commercial
        Staff myStaff = new Staff("Bobathy","8005882300","Bobathy@empire.today","weLovePasswords",myRestaurant,"Kitchen Manager",new ArrayList<Table>(),new ArrayList<String>());
        System.out.println(myStaff.getName() + "'s current password is: " + myStaff.getPassword());
        myStaff.setPassword("weLovePasswords");
        myStaff.setPassword("newPassword");
    }

}
