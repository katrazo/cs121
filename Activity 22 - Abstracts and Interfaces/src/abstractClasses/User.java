package abstractClasses;

import otherClasses.Restaurant;

public abstract class User {
    protected String name;
    protected String contactNumber; // String instead of int in case of oddly-placed zeroes
    protected String email;
    protected String password;
    protected Restaurant restaurant;

    public User(String name, String contactNumber, String email, String password, Restaurant restaurant) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.password = password;
        this.restaurant = restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    /* abstract password setter -- how its set will depend upon the type of user
     * - Customer: Can set password as wanted
     * - Staff: password cannot match previous 30 passwords (saved in database matched to email)
     */
    public abstract void setPassword(String password);

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
