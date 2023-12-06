import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        int numOfFloors = 0;
        int totalRooms= 0;
        int occupiedRooms = 0;
        int vacantRooms = 0;
        double occupancyRate;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of floors");
        numOfFloors = userInput.nextInt();

        for (int i = 1; i <= numOfFloors; i++) {
            System.out.println("Enter number of rooms on floor " + i);
            totalRooms += userInput.nextInt();
            System.out.println("How many of the floor's rooms are occupied?");
            occupiedRooms += userInput.nextInt();
        }

        vacantRooms = totalRooms - occupiedRooms;
        occupancyRate = (double)occupiedRooms / totalRooms;

        System.out.println("Floors: " + numOfFloors);
        System.out.println("Rooms: " + totalRooms);
        System.out.println("Occupied Rooms: " + occupiedRooms);
        System.out.println("Vacant Rooms: " + vacantRooms);
        System.out.printf("Occupancy: %1.2f (%d%s)", occupancyRate, ((int)(occupancyRate*100)), "%");
    }
}