package stacksPractice;

public class BoundedStackTester {
    public static void main(String[] args) {

        /*int size = 0;
        System.out.println(size++);
        System.out.println(size);
        System.out.println(--size);*/

        BoundedStack stack = new BoundedStack(3);

        stack.push(1);
        System.out.println(stack.peek());
        stack.push(2);
        System.out.println(stack.peek());
        stack.push(3);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
