package setAndIteratorActivity.otherClasses;

public class Table {
    private int numOfSeats; // Number of seats at the table
    private boolean isReserved; // Whether the table is part of an active reservation

    public Table() {
        numOfSeats = 4;
        isReserved = false;
    }
    public Table(int numOfSeats, boolean isReserved) {
        this.numOfSeats = numOfSeats;
        this.isReserved = isReserved;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean isReserved() {
        return isReserved;
    }
    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numOfSeats=" + numOfSeats +
                ", isReserved=" + isReserved +
                '}';
    }
}
