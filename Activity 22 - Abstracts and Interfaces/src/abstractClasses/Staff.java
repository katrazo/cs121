package abstractClasses;

import otherClasses.*;
import java.util.ArrayList;

public class Staff extends User{
    private String role;
    private ArrayList<Table> tablesManaged;
    private ArrayList<String> previousPasswords;

    public Staff(String name, String contactNumber, String email, String password, Restaurant restaurant, String role, ArrayList<Table> tablesManaged, ArrayList<String> previousPasswords) {
        super(name, contactNumber, email, password, restaurant);
        this.role = role;
        this.tablesManaged = tablesManaged;
        this.previousPasswords = previousPasswords;
        previousPasswords.add(password);
    }
    public Staff() {
        super("Kat","317oopsIforgot","student@bsu.edu","eekmyhomework",new Restaurant());
        role = "General Manager";
        tablesManaged = new ArrayList<Table>();
        previousPasswords = new ArrayList<String>();
        previousPasswords.add(password);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<Table> getTablesManaged() {
        return tablesManaged;
    }

    public void setTablesManaged(ArrayList<Table> tablesManaged) {
        this.tablesManaged = tablesManaged;
    }

    public ArrayList<String> getPreviousPasswords() {
        return previousPasswords;
    }

    public void setPreviousPasswords(ArrayList<String> previousPasswords) {
        this.previousPasswords = previousPasswords;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "role='" + role + '\'' +
                ", tablesManaged=" + tablesManaged +
                ", previousPasswords=" + previousPasswords +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", restaurant=" + restaurant +
                '}';
    }

    @Override
    public void setPassword(String password) {
        boolean matchesOld = false;
        for (String passwordChecker: previousPasswords) {
            if (passwordChecker.equals(password)) {
                matchesOld = true;
                System.out.println("New password matches previous password.");
                break;
            }
        }

        if (!matchesOld) {
            this.password = password;
            System.out.println("Password changed successfully to: " + password);
        }
    }
}
