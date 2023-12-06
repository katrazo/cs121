import java.util.ArrayList;
import java.util.Stack;

public class MyStack {
    private ArrayList<Integer> stack;
    public MyStack() {
        stack = new ArrayList<>();
    }

    public void push(int element) {
        stack.add(element);
    }
    public int pop() throws IndexOutOfBoundsException {
        int toReturn = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return toReturn;
    }
    public int peek() throws IndexOutOfBoundsException {
        return stack.get(stack.size() - 1);
    }
    boolean isEmpty() {
        return stack.size() == 0;
    }

}
