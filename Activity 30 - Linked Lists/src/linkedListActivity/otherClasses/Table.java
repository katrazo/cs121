package linkedListActivity.otherClasses;

public class Table {
    private int numberOfSeats;
    private boolean isReserved;

    public Table() {
        numberOfSeats = 4;
        isReserved = false;
    }
    public Table(int numberOfSeats, boolean isReserved) {
        this.numberOfSeats = numberOfSeats;
        this.isReserved = isReserved;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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
                "numberOfSeats=" + numberOfSeats +
                ", isReserved=" + isReserved +
                '}';
    }
}
