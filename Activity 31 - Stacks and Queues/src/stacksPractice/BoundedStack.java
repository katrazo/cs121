package stacksPractice;

public class BoundedStack {
    private Object[] array;
    private int size = 0;

    public BoundedStack(int maxSize) {
        array = new Object[maxSize];
    }

    public void push(Object item) {
        if (size == array.length)
            System.out.println("Stack overflow--cannot add to full stack.");
        else
            array[size++] = item;
    }

    public Object pop() {
        if (size == 0)
            return "Cannot pop from empty stack.";
        else {
            Object result = array[size-1];
            array [--size] = null;
            return result;
        }
    }

    public Object peek() {
        if (size == 0)
            return "Cannot peek into empty stack.";
        else
            return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
