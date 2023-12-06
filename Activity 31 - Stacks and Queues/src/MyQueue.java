import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> queue;
    public MyQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int element) {
        queue.add(element);
    }
    public int dequeue() throws IndexOutOfBoundsException {
        int toReturn = queue.get(0);
        queue.remove(0);
        return toReturn;
    }
    public int peek() {
        return queue.get(0);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
