package interfaces;
// once again with imports of classes with the same name causing naming conflicts

public class InteractableTest {
    public static void main(String[] args) {
        Customer myCustomer = new Customer(new abstractClasses.Customer());
        Staff myStaff = new Staff(new abstractClasses.Staff());
        System.out.println();

        System.out.println("-----------------------------------------------------------------------------------------");
        myCustomer.displayAccount();
        System.out.println("-----------------------------------------------------------------------------------------");
        myStaff.displayAccount();
        System.out.println("-----------------------------------------------------------------------------------------");

    }
}
